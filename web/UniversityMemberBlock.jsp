        <%
            String id = request.getParameter("block");
            int no = Integer.parseInt(id);
            Register.DbSeaarch.UniversityMemberBlock(id);
            request.setAttribute("BlockMessage", "Member Blocked Sucessfully !");
            RequestDispatcher rd = request.getRequestDispatcher("UniversityViewMember.jsp");
            rd.forward(request, response); 
        %>