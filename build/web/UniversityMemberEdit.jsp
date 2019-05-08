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
    <title>Unifirst | Update Members</title>
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

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <!-- Preloader -->
    <jsp:include page="UniversityHeader.jsp"/>

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                
                
                
                <section class="hk-sec-wrapper">
                            <h5 class="hk-sec-title">Update Members</h5>
                            <p class="mb-25">Update Student Accounts in Here use University Email Address</p>
                                     
                            
                             <% if(null!=request.getAttribute("SucessUpdateMessage")){ %>
                                    <div class="alert alert-success">
                                        <% out.println(request.getAttribute("SucessUpdateMessage")); %>
                                    </div>            
                             <%}%>
                                
                            <div class="row">
                                <div class="col-sm">
                                    
                                    <%
                                        String host ="jdbc:mysql://localhost:3306/unifirst";
                                        Statement stat=null;
                                        ResultSet res=null;
                                        PreparedStatement stmt=null;
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn=DriverManager.getConnection(host,"root","");
                                        
                                    %>
                                    
                                    <form action="UpdateMemberServelet" method="get">
                                        
                                        <%
                                            stat=conn.createStatement();
                                            String id = request.getParameter("edit");
                                            int num=Integer.parseInt(id);
                                            String data = "SELECT * FROM `users` WHERE `id`='"+num+"'";
                                            res=stat.executeQuery(data);
                                            while(res.next()){
                                        %>
                                        
                                        <div class="row">
                                            <div class="col-md-10  form-group">
                                                <label class="control-label mb-10" for="exampleInputuname_1">User Name</label>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text"><i class="icon-user"></i></span>
                                                    </div>
                                                    <input type="text" class="form-control" id="exampleInputuname_1" name="username" value="<%=res.getString("name")%>" placeholder="Username" required>
                                                </div>
                                            </div>
                                            <div class="col-md-2 form-group">
                                                <label for="lastName">&nbsp;&nbsp;ID</label>
                                                <input class="form-control" id="lastName" placeholder="" value="<%=res.getString("id")%>" type="text" name="id" readonly>
                                            </div>
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputEmail_1">Address</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="ti-location-pin"></i></span>
                                                </div>
                                                <input type="text" class="form-control" id="exampleInputEmail_1" name="address" value="<%=res.getString("address")%>" placeholder="Address" required>
                                            </div>
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputEmail_1">Email address</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-envelope-open"></i></span>
                                                </div>
                                                <input type="email" class="form-control" id="exampleInputEmail_1" name="email" value="<%=res.getString("email")%>" placeholder="Enter Email" required>
                                            </div>
                                        </div>
                                        
                                        
                                        
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
                                                <input class="form-control" placeholder="Enter Password" id="password" type="password" value="<%=res.getString("password")%>" name="password" onkeyup='check();' required>
                                            </div>
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputpwd_2">Confirm Password</label>
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text"><i class="icon-lock"></i></span>
                                                </div>
                                                <input class="form-control" placeholder="Re Enter Password" type="password" value="<%=res.getString("password")%>" id="confirm_password" name="confirm_password" onkeyup='check();' required>
                                            </div>
                                        </div>
                                    
                                        <span id='message'></span>
                                        <br>
<!--                                        <div class="form-group">
                                            <label class="control-label mb-10">Gender</label>
                                            <div>
                                                <div class="custom-control custom-radio mb-5">
                                                    <input id="radio_1" name="radio1" class="custom-control-input" checked="" type="radio">
                                                    <label class="custom-control-label" for="radio_1">M</label>
                                                </div>
                                                <div class="custom-control custom-radio">
                                                    <input id="radio_2" name="radio1" class="custom-control-input" checked="" type="radio">
                                                    <label class="custom-control-label" for="radio_1">F</label>
                                                </div>
                                            </div>
                                        </div>-->
<!--                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox">
                                                <input class="custom-control-input" id="checkbox_1" type="checkbox" checked>
                                                <label class="custom-control-label" for="checkbox_1">Remember me</label>
                                            </div>
                                        </div>-->

                                        <%}%>
                                        <button type="submit" class="btn btn-primary mr-10">Update</button>
                                    </form>
                                </div>
                            </div>
                        </section>
                

                
            </div>
            <!-- /Container -->
			
            <!-- Footer -->
            
            <jsp:include page="Footer.jsp"/>
<!--            <div class="hk-footer-wrap container">
                <footer class="footer">
                    <div class="row">
                        <div class="col-md-6 col-sm-12">
                            <p>Pampered by<a href="https://hencework.com/" class="text-dark" target="_blank">Hencework</a> © 2019</p>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <p class="d-inline-block">Follow us</p>
                            <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-facebook"></i></span></a>
                            <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-twitter"></i></span></a>
                            <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-google-plus"></i></span></a>
                        </div>
                    </div>
                </footer>
            </div>-->
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
	
        <!-- EChartJS JavaScript -->
    <script src="vendors/echarts/dist/echarts-en.min.js"></script>
    
        <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
    <script src="dist/js/dashboard2-data.js"></script>
	
</body>

</html>
