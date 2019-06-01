        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.UniversityEventDelete(id);
            request.setAttribute("EventDeleteMessage", "Event Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ViewEvent.jsp");
            rd.forward(request, response); 
        %>