        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.UniversityCalanderDelete(id);
            request.setAttribute("Deletecalander", "Calander Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ManageCalendar.jsp");
            rd.forward(request, response); 
        %>