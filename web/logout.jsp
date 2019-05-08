<%-- 
    Document   : logout
    Created on : Apr 5, 2019, 10:28:40 PM
    Author     : Kavindu Theekshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
session.invalidate();
response.sendRedirect("Login.jsp");
        %>
    </body>
</html>
