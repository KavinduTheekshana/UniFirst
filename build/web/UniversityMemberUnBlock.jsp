        <%
            String id = request.getParameter("unblock");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.UniversityMemberUnBlock(id);
            request.setAttribute("UnBlockMessage", "Member UnBlocked Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("UniversityViewMember.jsp");
            rd.forward(request, response); 
        %>