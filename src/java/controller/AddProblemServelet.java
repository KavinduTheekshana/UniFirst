/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AddProblem;
import Register.DbSave;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.zip.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@MultipartConfig(fileSizeThreshold=1024*1024*2, 
                 maxFileSize=1024*1024*10,      
                 maxRequestSize=1024*1024*50)

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "AddProblemServelet", urlPatterns = {"/AddProblemServelet"})
public class AddProblemServelet extends HttpServlet {
    AddProblem addproblem = new AddProblem();
    DbSave dbsave = new DbSave();





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
              

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        PrintWriter writer=response.getWriter();

        String title = request.getParameter("Problemtitle");
        String postbody = request.getParameter("postbody");
        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        

        addproblem.setTitle(title);
        addproblem.setPostbody(postbody);
        addproblem.setUniversityID(universityID);
        
        try {
                boolean b = dbsave.AddProblem(addproblem);
                request.setAttribute("ProblemSucessMessage", "Problem Added Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("UploadProblems.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        
        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
