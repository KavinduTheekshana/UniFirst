        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.RequestDelete(id);
            request.setAttribute("RequestDeleteMessage", "Request Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ViewLecture.jsp");
            rd.forward(request, response); 
        %>