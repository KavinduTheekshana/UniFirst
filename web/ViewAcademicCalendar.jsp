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
    <title>Unifirst | View Members</title>
    <meta name="description" content="A responsive bootstrap 4 admin dashboard template by hencework" />

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="dist/img/graduation.ico" type="image/x-icon">
	
	<!-- Morris Charts CSS -->
    <link href="vendors/morris.js/morris.css" rel="stylesheet" type="text/css" />
	
    <!-- Toggles CSS -->
    <!--<link href="vendors/jquery-toggles/css/toggles.css" rel="stylesheet" type="text/css">-->
    <!--<link href="vendors/jquery-toggles/css/themes/toggles-light.css" rel="stylesheet" type="text/css">-->
	
	<!-- Toastr CSS -->
    <!--<link href="vendors/jquery-toast-plugin/dist/jquery.toast.min.css" rel="stylesheet" type="text/css">-->

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
    <!--<link href="vendors/datatables.net-dt/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />-->
    
    
    
    <link href='vendors/fullcalendar/dist/fullcalendar.min.css' rel='stylesheet' />
        <!--<link href='vendors/AcadamicCalander/fullcalendar.print.min.css' rel='stylesheet' media='print' />-->
        <script src='vendors/AcadamicCalander/js/moment.min.js'></script>
        <script src="vendors/AcadamicCalander/js/jquery-ui.min.js"></script>
        <script src='vendors/AcadamicCalander/js/jquery.min.js'></script>
        <script src='vendors/AcadamicCalander/js/fullcalendar.min.js'></script>


<!--<script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/jquery-ui.min.js"></script>
    <script src="vendors/fullcalendar/dist/fullcalendar.min.js"></script>
    <script src="dist/js/fullcalendar-data.js"></script>-->

<style>
    .fc-title{
        color: white;
    }
</style>


        <script>
            $(document).ready(function () {

                $('#calendar').fullCalendar({
                    defaultDate: '2019-01-01',
                    editable: true,
                    eventLimit: true, // allow "more" link when too many events
                    events: "CalendarJsonServlet"
                });

            });

        </script>
        
        
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

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                
                
                
                <section class="hk-sec-wrapper">
                            <div id="calendar"></div>
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

    <!-- Fullcalendar JavaScript -->
    <script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/jquery-ui.min.js"></script>
    <script src="vendors/fullcalendar/dist/fullcalendar.min.js"></script>
    <script src="dist/js/fullcalendar-data.js"></script>

    <!-- Fancy Dropdown JS -->
    <script src="dist/js/dropdown-bootstrap-extended.js"></script>

    <!-- FeatherIcons JavaScript -->
    <script src="dist/js/feather.min.js"></script>

    <!-- Daterangepicker JavaScript -->
    <script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/daterangepicker/daterangepicker.js"></script>
    <script src="dist/js/daterangepicker-data.js"></script>

    <!-- Toggles JavaScript -->
    <script src="vendors/jquery-toggles/toggles.min.js"></script>
    <script src="dist/js/toggle-data.js"></script>

    <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
    
    <script>
        
//        $(".fc-title").addClass("text-white");
        
        document.getElementsByClassName("fc-title").className="text-white";
        
    </script>
	
</body>

</html>
