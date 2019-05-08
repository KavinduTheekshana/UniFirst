<!DOCTYPE html>
<!-- 
Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template
Author: Hencework
Contact: https://hencework.ticksy.com/

License: You must have a valid license purchased only from templatemonster to legally use the template for your project.
-->
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Unifirst | Add Event</title>
    <meta name="description" content="A responsive bootstrap 4 admin dashboard template by hencework" />

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="dist/img/graduation.ico" type="image/x-icon">
	
	<!-- Morris Charts CSS -->
    <link href="vendors/morris.js/morris.css" rel="stylesheet" type="text/css" />
    
     <!-- Daterangepicker CSS -->
    <link href="vendors/daterangepicker/daterangepicker.css" rel="stylesheet" type="text/css" />
	
    <!-- Toggles CSS -->
    <link href="vendors/jquery-toggles/css/toggles.css" rel="stylesheet" type="text/css">
    <link href="vendors/jquery-toggles/css/themes/toggles-light.css" rel="stylesheet" type="text/css">
	
	<!-- Toastr CSS -->
    <link href="vendors/jquery-toast-plugin/dist/jquery.toast.min.css" rel="stylesheet" type="text/css">

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
    
    <!-- Bootstrap Dropzone CSS -->
	<link href="vendors/dropify/dist/css/dropify.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <!-- Preloader -->
    <jsp:include page="UniversityHeader.jsp"/>

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                
                
                
                <section class="hk-sec-wrapper">
                            <h5 class="hk-sec-title">Add Event</h5>
                            <!--<p class="mb-25">Add Student Accounts in Here use University Email Address</p>-->
                            <div class="row">
                                <div class="col-sm">
                                    <form action="" method="get">
                                        
                                        <br>
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Title</label>
                                            <input class="form-control" id="address2" placeholder="Event Title" type="text">
                                        </div>
                                        
                                        
                                        
                                         
                                    <div class="row">
                                        <div class="col-md-4">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Date</label>
                                            <input class="form-control" type="text" name="daterange" value="01/01/2018 - 01/15/2018" /> 
                                        </div>
                                       
                                        <div class="col-md-4">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Time</label>
                                            <input class="form-control input-timepicker" type="text" name="time" />
                                        </div>
                                        
                                        <div class="col-md-4">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Type</label>
                                             <select class="form-control custom-select">
                                                <option value="1">Meetups</option>
                                                <option value="2">Competitions</option>
                                                <option value="3">Hackathons </option>
                                                <option value="4">Other </option>
                                            </select>
                                        </div>
                                    </div>
                                
                                        <br>
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Venue</label>
                                            <input class="form-control" id="address2" placeholder="Event Title" type="text">
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Description</label>
                                            <textarea class="form-control" rows="3" placeholder="Textarea"></textarea>
                                        </div>
                                        
                                        <div class="form-group mb-0">
                                            <label class="control-label mb-10" for="exampleInputuname_1">Image Upload</label>
                                            <input type="file" id="input-file-now" class="dropify" />
                                        </div>
                                        
                                        
                                        
                                        
                                       
                                        
                                        <br>
                                  
                                    
                                        
                                        
                                        
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
	
        <!-- EChartJS JavaScript -->
    <script src="vendors/echarts/dist/echarts-en.min.js"></script>
    
        <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
    <script src="dist/js/dashboard2-data.js"></script>
    
    <!-- Pickr JavaScript -->
    <script src="vendors/pickr-widget/dist/pickr.min.js"></script>
    <script src="dist/js/pickr-data.js"></script>

     <!--Daterangepicker JavaScript--> 
    <script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/daterangepicker/daterangepicker.js"></script>
    <script src="dist/js/daterangepicker-data.js"></script>
    

	
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
        

    
    
	
</body>

</html>
