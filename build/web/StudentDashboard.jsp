<!DOCTYPE html>
<!-- 
Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template
Author: Hencework
Contact: https://hencework.ticksy.com/
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
License: You must have a valid license purchased only from templatemonster to legally use the template for your project.
-->

<jsp:useBean id="dbSearch" scope="session" class="Register.DbSeaarch" />

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

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <!-- Preloader -->
    <jsp:include page="StudentHeader.jsp"/>
        <!-- /Setting Panel -->

        <!-- Main Content -->
        <div class="hk-pg-wrapper">
			<!-- Container -->
            <div class="container mt-xl-50 mt-sm-30 mt-15">
                <!-- Title -->
                <div class="hk-pg-header">
                    <div>
						<h2 class="hk-pg-title font-weight-600">Student Dashboard</h2>
					</div>
		
                </div>
                <!-- /Title -->

                <!-- Row -->
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hk-row">
                            <div class="col-lg-3 col-sm-6">

                                <% String host1 = "jdbc:mysql://localhost:3306/unifirst";
                                    Statement stat1 = null;
                                    ResultSet res1 = null;
                                    PreparedStatement stmt1 = null;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn1 = DriverManager.getConnection(host1, "root", "");

                                        stat1 = conn1.createStatement();
                                        String data = "SELECT COUNT(queries.id) as queriescount FROM `queries` where universityID ='" + session.getAttribute("universityID") + "'";
                                        res1 = stat1.executeQuery(data);
                                        if (res1.first()) {
                                %>
                                <div class="card card-sm">
                                    <div class="card-body">
                                        <span class="d-block font-11 font-weight-500 text-dark text-uppercase mb-10">My Total Queries</span>
                                        <div class="d-flex align-items-center justify-content-between position-relative">
                                            <div>
                                                <span class="d-block display-5 font-weight-400 text-dark"><%=res1.getString("queriescount")%></span>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <%
                                        }
                                    } catch (Exception ex) {

                                    }

                                %>       




                            </div>

                            <div class="col-lg-3 col-sm-6">

                                <% String host2 = "jdbc:mysql://localhost:3306/unifirst";
                                    Statement stat2 = null;
                                    ResultSet res2 = null;
                                    PreparedStatement stmt2 = null;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn2 = DriverManager.getConnection(host2, "root", "");

                                        stat2 = conn2.createStatement();
                                        String data = "SELECT COUNT(events.id) as eventcount FROM `events`";
                                        res2 = stat2.executeQuery(data);
                                        if (res2.first()) {
                                %>
                                <div class="card card-sm">
                                    <div class="card-body">
                                        <span class="d-block font-11 font-weight-500 text-dark text-uppercase mb-10">Total EVENTS</span>
                                        <div class="d-flex align-items-center justify-content-between position-relative">
                                            <div>
                                                <span class="d-block display-5 font-weight-400 text-dark"><%=res2.getString("eventcount")%></span>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <%
                                        }
                                    } catch (Exception ex) {

                                    }

                                %>       




                            </div>

                            <div class="col-lg-3 col-sm-6">

                                <% String host3 = "jdbc:mysql://localhost:3306/unifirst";
                                    Statement stat3 = null;
                                    ResultSet res3 = null;
                                    PreparedStatement stmt3 = null;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn3 = DriverManager.getConnection(host3, "root", "");

                                        stat3 = conn3.createStatement();
                                        String data = "SELECT COUNT(problem.id) as problemcount FROM `problem`";
                                        res3 = stat3.executeQuery(data);
                                        if (res3.first()) {
                                %>
                                <div class="card card-sm">
                                    <div class="card-body">
                                        <span class="d-block font-11 font-weight-500 text-dark text-uppercase mb-10">Total Industry Problems</span>
                                        <div class="d-flex align-items-center justify-content-between position-relative">
                                            <div>
                                                <span class="d-block display-5 font-weight-400 text-dark"><%=res3.getString("problemcount")%></span>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <%
                                        }
                                    } catch (Exception ex) {

                                    }

                                %>       




                            </div>


                            <div class="col-lg-3 col-sm-6">

                                <% String host4 = "jdbc:mysql://localhost:3306/unifirst";
                                    Statement stat4 = null;
                                    ResultSet res4 = null;
                                    PreparedStatement stmt4 = null;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection conn4 = DriverManager.getConnection(host4, "root", "");

                                        stat4 = conn4.createStatement();
                                        String data = "SELECT COUNT(post.id) as postcount FROM `post`";
                                        res4 = stat4.executeQuery(data);
                                        if (res4.first()) {
                                %>
                                <div class="card card-sm">
                                    <div class="card-body">
                                        <span class="d-block font-11 font-weight-500 text-dark text-uppercase mb-10">Total Posts</span>
                                        <div class="d-flex align-items-center justify-content-between position-relative">
                                            <div>
                                                <span class="d-block display-5 font-weight-400 text-dark"><%=res4.getString("postcount")%></span>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <%
                                        }
                                    } catch (Exception ex) {

                                    }

                                %>       




                            </div>

                        </div>



















                        <div class="d-flex align-items-center justify-content-between mt-40 mb-20">
                            <h4>Latest Queries</h4>
                            <a href="ViewQueries.jsp" class="btn btn-sm btn-link">view all</a>
                        </div>
                        <c:forEach items="${dbSearch.getLastFiveQueries(sessionScope.universityID)}" var="b">    
            <section class="hk-sec-wrapper">
                <div class="row">    
                    <div class="col-sm">
                        <div class="media pa-20 border border-2 border-light rounded">
                            <img class="mr-15 circle d-100" src=${b.getImage() } alt="Generic placeholder image">
                                <div class="media-body">
                                    <h4 class="mb-5">${b.getQueries() }</h4> 
                                     ${b.getDescription() }
                                </div>
                        </div>
                    </div>
                                                
                </div>
            </section>
            </c:forEach>
                    </div>
                </div>
            </div>
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
	
	<!-- EChartJS JavaScript -->
    <script src="vendors/echarts/dist/echarts-en.min.js"></script>
    
    <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
	<script src="dist/js/dashboard2-data.js"></script>
	
</body>

</html>
