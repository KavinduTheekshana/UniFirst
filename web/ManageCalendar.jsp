<!DOCTYPE html>
<!-- 
Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template
Author: Hencework
Contact: https://hencework.ticksy.com/
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
License: You must have a valid license purchased only from templatemonster to legally use the template for your project.
-->
<jsp:useBean id="dbSearch" scope="session" class="Register.DbSeaarch" />
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
        <link href="vendors/jquery-toggles/css/toggles.css" rel="stylesheet" type="text/css">
        <link href="vendors/jquery-toggles/css/themes/toggles-light.css" rel="stylesheet" type="text/css">

        <!-- Toastr CSS -->
        <link href="vendors/jquery-toast-plugin/dist/jquery.toast.min.css" rel="stylesheet" type="text/css">

        <!-- Custom CSS -->
        <link href="dist/css/style.css" rel="stylesheet" type="text/css">
        <link href="vendors/datatables.net-dt/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
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
                    <h5 class="hk-sec-title">Manage Academic Calender</h5>
<!--                    <form action="SearchMemberServelet" method="get">

                        <div class="row">

                            <div class="col-md-4">
                                <select class="form-control custom-select" name="selection">
                                    <option value="name">name</option>
                                    <option value="email">email</option>
                                    <option value="address">address</option>
                                </select>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="searchText" placeholder="Search" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-outline-light" name="BtnType" value="search" type="Submit">Search</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4">

                                <a href="SearchMemberServelet?BtnType=all" class="btn btn-primary btn-block" role="button">View All</a>

                            </div>
                        </div>
                    </form>-->
                    <!--<p class="mb-40">Add advanced interaction controls to HTML tables like <code>search, pagination & selectors</code>. For responsive table just add the <code>responsive: true</code> to your DataTables function. <a href="https://datatables.net/reference/option/" target="_blank">View all options</a>.</p>-->
                    
                    <% if(null!=request.getAttribute("Deletecalander")){ %>
                        <div class="alert alert-danger">
                             <% out.println(request.getAttribute("Deletecalander")); %>
                        </div>            
                     <%}%>
                     
                     <% if(null!=request.getAttribute("BlockMessage")){ %>
                        <div class="alert alert-warning">
                             <% out.println(request.getAttribute("BlockMessage")); %>
                        </div>            
                     <%}%>
                     
                     <% if(null!=request.getAttribute("UnBlockMessage")){ %>
                        <div class="alert alert-info ">
                             <% out.println(request.getAttribute("UnBlockMessage")); %>
                        </div>            
                     <%}%>
                     
                     <% if(null!=request.getAttribute("SucessUpdateMessage")){ %>
                        <div class="alert alert-dark  ">
                             <% out.println(request.getAttribute("SucessUpdateMessage")); %>
                        </div>            
                     <%}%>
                                
                    <div class="row">
                        <div class="col-sm">
                            <div class="table-wrap">
                                <table id="datable_1" class="table table-hover w-100 display pb-30">
                                    <thead>
                                        <tr>
                                            <th>Title</th>
                                            <th>Start</th>
                                            <th>End</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>

 
                                        <c:forEach items="${dbSearch.ManageCalander(sessionScope.universityID)}" var="b">
                                        <tr>
                                            <td>${b.getTitle() }</td>
                                            <td>${b.getStart() }</td>
                                            <td>${b.getEnd() }</td>
                                      
                                            <td>
                                             
                                                    
                                                
                                                    
                                                <a href="UniversityCalanderDelete.jsp?delete=${b.getId() }" class="btn btn-icon btn-danger btn-icon-style-1"><span class="btn-icon-wrap"><i class="material-icons">delete</i></span></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                  
                                </table>
                            </div>
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
    <script src="vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="vendors/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
    <script src="vendors/datatables.net-dt/js/dataTables.dataTables.min.js"></script>
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
