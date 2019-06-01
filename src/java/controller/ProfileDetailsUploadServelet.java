/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.UpdatePassword;
import Model.UpdateProfileDetails;
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
@WebServlet(name = "ProfileDetailsUploadServelet", urlPatterns = {"/ProfileDetailsUploadServelet"})
public class ProfileDetailsUploadServelet extends HttpServlet {
    UpdateProfileDetails updateprofiledetails = new UpdateProfileDetails();
    DbSave dbsave = new DbSave();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter writer=response.getWriter();
        
        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        String username = request.getParameter("username");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        
        
        
            updateprofiledetails.setUniversityID(universityID);
            updateprofiledetails.setUsername(username);
            updateprofiledetails.setAddress(address);
            updateprofiledetails.setEmail(email);

            
            try {
                boolean b = dbsave.UpdateProfileDetails(updateprofiledetails);
                request.setAttribute("ProfileDetailsUpdateSucessfully", "Profile Details Update Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp"); 
                rd.forward(request, response); 
                response.sendRedirect("Profile.jsp");
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }

    

}
