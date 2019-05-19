<%-- 
    Document   : index
    Created on : Jul 10, 2018, 7:31:05 PM
    Author     : Saroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='vendors/AcadamicCalander/fullcalendar.min.css' rel='stylesheet' />
        <link href='vendors/AcadamicCalander/fullcalendar.print.min.css' rel='stylesheet' media='print' />
        <script src='vendors/AcadamicCalander/js/moment.min.js'></script>
        <script src="vendors/AcadamicCalander/js/jquery-ui.min.js"></script>
        <script src='vendors/AcadamicCalander/js/jquery.min.js'></script>
        <script src='vendors/AcadamicCalander/js/fullcalendar.min.js'></script>

        <script>
            $(document).ready(function () {

                $('#calendar').fullCalendar({
                    defaultDate: '2018-07-01',
                    editable: true,
                    eventLimit: true, // allow "more" link when too many events
                    events: "CalendarJsonServlet"
                });

            });

        </script>
    </head>
    <body>
        <div id="calendar"></div>
    </body>
</html>
