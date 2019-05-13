        <%
            String id = request.getParameter("delete");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.UniversityPostDelete(id);
            request.setAttribute("PostDeleteMessage", "Post Delete Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("ViewPost.jsp");
            rd.forward(request, response); 
        %>