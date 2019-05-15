        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.ProblemtDelete(id);
            request.setAttribute("ProblemDeleteMessage", "Problem Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ViewProblems.jsp");
            rd.forward(request, response); 
        %>