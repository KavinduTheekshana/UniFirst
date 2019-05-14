/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Addmember;
import Register.DbSave;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "AddMemberServelet", urlPatterns = {"/AddMemberServelet"})
public class AddMemberServelet extends HttpServlet {
    Addmember addmember = new Addmember();
    DbSave dbsave = new DbSave();


   


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
   
            PrintWriter out = response.getWriter(); 
            String username = request.getParameter("username");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            HttpSession session = request.getSession();
            String universityID = (String) session.getAttribute("universityID");
            
            
            addmember.setUsername(username);
            addmember.setAddress(address);
            addmember.setEmail(email);
            addmember.setPassword(password);
            addmember.setUniversityID(universityID);
            
            try {
                boolean b = dbsave.AddMember(addmember);
                request.setAttribute("SucessMessage", "Member Added Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("UniversityAddMember.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
            
            
            
//            DbSave.AddMember(username, address, email, password);
//            response.sendRedirect("Addmember.jsp");


            request.getRequestDispatcher("AddMember.jsp").forward(request, response);
            
            
    
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
