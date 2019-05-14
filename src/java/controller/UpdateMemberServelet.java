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
@WebServlet(name = "UpdateMemberServelet", urlPatterns = {"/UpdateMemberServelet"})
public class UpdateMemberServelet extends HttpServlet {
    Addmember addmember = new Addmember();
    DbSave dbsave = new DbSave();




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

   
            PrintWriter out = response.getWriter(); 
            String id = request.getParameter("id");
            String username = request.getParameter("username");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            addmember.setId(id);
            addmember.setUsername(username);
            addmember.setAddress(address);
            addmember.setEmail(email);
            addmember.setPassword(password);
            
            try {
                boolean b = dbsave.UpdateMember(addmember);
                request.setAttribute("SucessUpdateMessage", "Member Update Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("UniversityViewMember.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(UpdateMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
            
            
            


            request.getRequestDispatcher("AddMember.jsp").forward(request, response);
            
            
    
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
