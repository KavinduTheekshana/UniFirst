/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Addmember;
import Model.UpdatePassword;
import Register.DbSave;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@MultipartConfig(fileSizeThreshold=1024*1024*2, 
                 maxFileSize=1024*1024*10,      
                 maxRequestSize=1024*1024*50)


/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "UpdatePasswordServelet", urlPatterns = {"/UpdatePasswordServelet"})
public class UpdatePasswordServelet extends HttpServlet {
    UpdatePassword updatepassword = new UpdatePassword();
    DbSave dbsave = new DbSave();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        
        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        String password = request.getParameter("password");
        
        
        
            updatepassword.setUniversityID(universityID);
            updatepassword.setPassword(password);

            
            try {
                boolean b = dbsave.UpdatePassword(updatepassword);
                request.setAttribute("PasswordUpdateSucessfully", "Password Update Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp"); 
                rd.forward(request, response); 
                response.sendRedirect("Profile.jsp");
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
    }



}
