        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.QueriesDelete(id);
            request.setAttribute("QueriesUpdateSucessMessage", "Querie Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ViewQueries.jsp");
            rd.forward(request, response); 
        %>