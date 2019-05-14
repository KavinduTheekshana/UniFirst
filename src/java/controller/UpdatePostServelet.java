/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AddPost;
import Register.DbSave;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "UpdatePostServelet", urlPatterns = {"/UpdatePostServelet"})
public class UpdatePostServelet extends HttpServlet {
    AddPost universityaddpost = new AddPost();
    DbSave dbsave = new DbSave();

    



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
        
        
        
        
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String postbody = request.getParameter("postbody");
        
        System.out.println(id);
        System.out.println(title);
        
        universityaddpost.setId(id);
        universityaddpost.setTitle(title);
        universityaddpost.setPostbody(postbody);
        
        try {
                boolean b = dbsave.UpdatePost(universityaddpost);
                request.setAttribute("postUpdateSucessMessage", "Post Update Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("ViewPost.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
