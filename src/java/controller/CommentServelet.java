/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Comment;
import Register.DbSave;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
@WebServlet(name = "CommentServelet", urlPatterns = {"/CommentServelet"})
public class CommentServelet extends HttpServlet {
    Comment comments = new Comment();
    DbSave dbsave = new DbSave();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if(req.getParameter("comment")!=null){
                String comment=req.getParameter("comment");
                String PostId=req.getParameter("PostId");
                HttpSession session = req.getSession();
                String universityID = (String) session.getAttribute("universityID");
                
                comments.setComment(comment);
                comments.setPostid(PostId);
                comments.setUniversityID(universityID);
                
                try {
                boolean b = dbsave.AddComment(comments); 
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }

                
                
                resp.getWriter().write("1");
            }else{
                resp.getWriter().write("2");
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
}
