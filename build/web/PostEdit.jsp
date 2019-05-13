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
    <title>Unifirst | Add Post</title>
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
    <jsp:include page="UniversityHeader.jsp"/>

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                
                
                
                <section class="hk-sec-wrapper">
                            <h5 class="hk-sec-title">Add Post</h5>
                            <br>
                            <% if(null!=request.getAttribute("SucessUpdatPosteMessage")){ %>
                                    <div class="alert alert-success">
                                        <% out.println(request.getAttribute("SucessUpdatPosteMessage")); %>
                                    </div>            
                                <%}%>
                            
                            <!--<p class="mb-25">Add Student Accounts in Here use University Email Address</p>-->
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
                                    
                                    
                                    <form action="UpdatePostServelet" method="get" enctype="multipart/form-data">
                                        
                                         <%
                                            stat=conn.createStatement();
                                            String id = request.getParameter("edit");
                                            int num=Integer.parseInt(id);
                                            String data = "SELECT * FROM `post` WHERE `id`='"+num+"'";
                                            res=stat.executeQuery(data);
                                            while(res.next()){
                                        %>
                                        

                                        <div class="row">   
                                        <div class="form-group col-md-9">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Title</label>
                                            <div class="input-group">
                                                
                                                <input type="text" class="form-control" id="exampleInputuname_1" name="title" value="<%=res.getString("title")%>" required>
                                            </div>
                                        </div>
                                            
                                            
                                             <div class="form-group col-md-3">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Post ID</label>
                                            <div class="input-group">
                                                
                                                <input type="text" class="form-control" id="exampleInputuname_1" name="id" value="<%=res.getString("id")%>" readonly>
                                            </div>
                                        </div>
                                        </div>
                                        
                                        
                                        
                                        
                                        <div class="form-group mb-0">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Image Upload</label><br>
                                            <img class="mr-15 circle d-100" src="<%=res.getString("image")%>" alt="Generic placeholder image">
                                        </div>
                                        
                                        <br>
                                        <div class="form-group mb-0">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Post Body</label>
                                            <textarea class="tinymce" name="postbody" required><%=res.getString("postbody")%></textarea>
                                        </div>
                                        
                                        
                                        <br>
                                        <%}%>
                                        <button type="submit" class="btn btn-primary mr-10">Submit</button>
                                        <button type="reset" class="btn btn-light">Reset</button>
                                        
                                        
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
