<!DOCTYPE html>
<!-- 
Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template
Author: Hencework
Contact: https://hencework.ticksy.com/

License: You must have a valid license purchased only from templatemonster to legally use the template for your project.
-->


<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>


<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Unifirst | University Dashboard</title>
    <meta name="description" content="A responsive bootstrap 4 admin dashboard template by hencework" />

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="dist/img/graduation.ico" type="image/x-icon">
	
	<!-- Morris Charts CSS -->
    <link href="vendors/morris.js/morris.css" rel="stylesheet" type="text/css" />
	
    <!-- Toggles CSS -->
    <link href="vendors/jquery-toggles/css/toggles.css" rel="stylesheet" type="text/css">
    <link href="vendors/jquery-toggles/css/themes/toggles-light.css" rel="stylesheet" type="text/css">
	
	<!-- Toastr CSS -->
    <link href="vendors/jquery-toast-plugin/dist/jquery.toast.min.css" rel="stylesheet" type="text/css">
    
    <!-- Bootstrap Dropzone CSS -->
	<link href="vendors/dropify/dist/css/dropify.min.css" rel="stylesheet" type="text/css"/>

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <!-- Preloader -->
        <% if(session.getAttribute("role").equals("University")){%>
        <jsp:include page="UniversityHeader.jsp"/>
    <%}%>
    
    <% if(session.getAttribute("role").equals("Company")){%>
        <jsp:include page="CompanyHeader.jsp"/>
    <%}%>
    
    <% if (session.getAttribute("role").equals("Student")) {%>
        <jsp:include page="StudentHeader.jsp"/>
        <%}%>
        <!-- /Setting Panel -->

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                <!-- Title -->
           
                <!-- /Title -->

                <!-- Row -->
                <div class="row">
                    <div class="col-xl-12">
                        <div class="row">
                              <%
                                        String host ="jdbc:mysql://localhost:3306/unifirst";
                                        Statement stat=null;
                                        ResultSet res=null;
                                        PreparedStatement stmt=null;
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn=DriverManager.getConnection(host,"root","");
                                        
                                    %>
                                    
                                    <%
                                            stat=conn.createStatement();
                                            String id = (String)request.getSession().getAttribute("universityID");
                                            int num=Integer.parseInt(id);
                                            String data = "SELECT * FROM `users` WHERE `id`='"+num+"'";
                                            res=stat.executeQuery(data);
                                            while(res.next()){
                                        %>
							
					
                                        
                                        
                                        
                                        
                        <section class="hk-sec-wrapper col-lg-6 col-sm-6" style="padding: 30px; margin-right: 30px;">
                            <h5 class="hk-sec-title">Update Profile Picture</h5>
                            <br>
                            <% if(null!=request.getAttribute("ProfilePictureUpdateSucessfully")){ %>
                                    <div class="alert alert-success">
                                        <% out.println(request.getAttribute("ProfilePictureUpdateSucessfully")); %>
                                    </div>            
                            <%}%>
                             
                            <!--<p class="mb-25">Add Student Accounts in Here use University Email Address</p>-->
                            <div class="row">
                                <div class="col-sm">
                                    
                                    <div class=" avatar avatar-sm mr-15">
                                        <img class="mr-15 circle d-100" src="<%=res.getString("profilepic")%>" alt="Generic placeholder image">
                                    </div>
                                    <br><br>
                                    <form action="ProfilePicUploadServelet" method="post" enctype="multipart/form-data">
                                    <div class="form-group mb-0">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Image Upload</label>
                                            <input type="file" name="file" id="input-file-now" class="dropify" />
                                        </div>
                                        <br>
                                        <button type="submit"  class="btn btn-primary mr-10 btn-block">Submit</button>
                                     </form>
                                   
                                </div>
                            </div>
                        </section>
                                    
                                    
                                    
                                    
                                    
                                    
                       <section class="hk-sec-wrapper col-lg-5 col-sm-5" style="padding: 30px;">
                            <h5 class="hk-sec-title">Update password</h5>
                            <br>
                            <% if(null!=request.getAttribute("PasswordUpdateSucessfully")){ %>
                                    <div class="alert alert-success">
                                        <% out.println(request.getAttribute("PasswordUpdateSucessfully")); %>
                                    </div>            
                            <%}%>
                             
                            <!--<p class="mb-25">Add Student Accounts in Here use University Email Address</p>-->
                            <div class="row">
                                <div class="col-sm">
                                    
                                    <form action="UpdatePasswordServelet" method="post" enctype="multipart/form-data">
                                        
                                               <script>
                                  var check = function() {
                                  if (document.getElementById('password').value ==
                                    document.getElementById('confirm_password').value) {
                                    document.getElementById('message').style.color = '';
                                    document.getElementById('message').innerHTML = 'Password is Matching';
                                  } else{
                                    document.getElementById('message').style.color = 'red';
                                    document.getElementById('message').innerHTML = 'Your Password Not Matching';
                                  }
                                }
                                    </script>
                                    
                                    
                                    <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputpwd_1">Password</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-lock"></i></span>
                                                </div>
                                                <input class="form-control" placeholder="Enter Password" id="password" type="password" name="password" onkeyup='check();' required>
                                            </div>
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputpwd_2">Confirm Password</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-lock"></i></span>
                                                </div>
                                                <input class="form-control" placeholder="Re Enter Password" type="password" id="confirm_password" name="confirm_password" onkeyup='check();' required>
                                            </div>
                                        </div>
                                    
                                    <span id='message'></span>
                                    
                                    
                                    <br><br>
                                        <button type="submit"  class="btn btn-primary mr-10 btn-block">Submit</button>
                                     </form>
                                   
                                </div>
                            </div>
                        </section>
                            
                            
               
                                                                                         
                                                     
						</div>
						
					
							
						
									</div>
								</div>
                                                
                                                
                                                <div class="row">
                                                                   
                        <section class="hk-sec-wrapper col-lg-8 col-sm-8" style="padding: 30px; margin-right: 30px;">
                            <h5 class="hk-sec-title">Update Profile Details</h5>
                            <br>
                            <% if(null!=request.getAttribute("ProfileDetailsUpdateSucessfully")){ %>
                                    <div class="alert alert-success">
                                        <% out.println(request.getAttribute("ProfileDetailsUpdateSucessfully")); %>
                                    </div>            
                            <%}%>
                             
                            <!--<p class="mb-25">Add Student Accounts in Here use University Email Address</p>-->
                            <div class="row">
                                <div class="col-sm">

                                    <form action="ProfileDetailsUploadServelet" method="post" enctype="multipart/form-data">
                                <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputuname_1">User Name</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-user"></i></span>
                                                </div>
                                                <input type="text" class="form-control" id="exampleInputuname_1" name="username" value="<%=res.getString("name")%>" required>
                                            </div>
                                        </div>
                                        
                                        
                                         <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputEmail_1">Address</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="ti-location-pin"></i></span>
                                                </div>
                                                <input type="text" class="form-control" id="exampleInputEmail_1" name="address" value="<%=res.getString("address")%>" required>
                                            </div>
                                        </div>
                                        
                                        
                                        
                                           <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputEmail_1">Email address</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-envelope-open"></i></span>
                                                </div>
                                                <input type="email" class="form-control" id="exampleInputEmail_1" name="email" value="<%=res.getString("email")%>" required>
                                            </div>
                                        </div>
                                        
                                        
                                        
                                        <br><br>
                                        
                                        <button type="submit"  class="btn btn-primary mr-10 btn-block">Submit</button>
                                     </form>
                                   
                                </div>
                            </div>
                        </section>
                                    
                                                </div>
							</div>
                                    <%}%>
						</div>		
					
               
                <!-- /Row -->
        
            <!-- /Container -->
			
            <!-- Footer -->
            <jsp:include page="Footer.jsp"/>
            <!-- /Footer -->
        </div>
        <!-- /Main Content -->

    </div>
    <!-- /HK Wrapper -->

    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendors/popper.js/dist/umd/popper.min.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Slimscroll JavaScript -->
    <script src="dist/js/jquery.slimscroll.js"></script>

    <!-- Fancy Dropdown JS -->
    <script src="dist/js/dropdown-bootstrap-extended.js"></script>

    <!-- FeatherIcons JavaScript -->
    <script src="dist/js/feather.min.js"></script>

    <!-- Toggles JavaScript -->
    <script src="vendors/jquery-toggles/toggles.min.js"></script>
    <script src="dist/js/toggle-data.js"></script>
	
	<!-- Toastr JS -->
    <!--<script src="vendors/jquery-toast-plugin/dist/jquery.toast.min.js"></script>-->
    
	<!-- Counter Animation JavaScript -->
	<script src="vendors/waypoints/lib/jquery.waypoints.min.js"></script>
	<script src="vendors/jquery.counterup/jquery.counterup.min.js"></script>
	
	<!-- Morris Charts JavaScript -->
    <script src="vendors/raphael/raphael.min.js"></script>
    <script src="vendors/morris.js/morris.min.js"></script>
	
	<!-- Easy pie chart JS -->
    <script src="vendors/easy-pie-chart/dist/jquery.easypiechart.min.js"></script>
	
	<!-- Flot Charts JavaScript -->
    <script src="vendors/flot/excanvas.min.js"></script>
    <script src="vendors/flot/jquery.flot.js"></script>
    <script src="vendors/flot/jquery.flot.pie.js"></script>
    <script src="vendors/flot/jquery.flot.resize.js"></script>
    <script src="vendors/flot/jquery.flot.time.js"></script>
    <script src="vendors/flot/jquery.flot.stack.js"></script>
    <script src="vendors/flot/jquery.flot.crosshair.js"></script>
    <script src="vendors/jquery.flot.tooltip/js/jquery.flot.tooltip.min.js"></script>
    
    	<!-- Dropify JavaScript -->
	<script src="vendors/dropify/dist/js/dropify.min.js"></script>
	
        <!-- EChartJS JavaScript -->
    <script src="vendors/echarts/dist/echarts-en.min.js"></script>
    
        <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
    <script src="dist/js/dashboard2-data.js"></script>
    
    
	<!-- Dropzone JavaScript -->
	<script src="vendors/dropzone/dist/dropzone.js"></script>
	
	<!-- Dropify JavaScript -->
	<script src="vendors/dropify/dist/js/dropify.min.js"></script>
	
	<!-- Form Flie Upload Data JavaScript -->
	<script src="dist/js/form-file-upload-data.js"></script>
	
	<!-- FeatherIcons JavaScript -->
	<script src="dist/js/feather.min.js"></script>
	
	<!-- Toggles JavaScript -->
	<script src="vendors/jquery-toggles/toggles.min.js"></script>
	<script src="dist/js/toggle-data.js"></script>
        
          <!-- Tinymce JavaScript -->
    <script src="vendors/tinymce/tinymce.min.js"></script>

    <!-- Tinymce Wysuhtml5 Init JavaScript -->
    <script src="dist/js/tinymce-data.js"></script>
	
	
</body>

</html>
