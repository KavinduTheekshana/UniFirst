/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import Model.RequestLecture;
import Register.DbSave;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig(fileSizeThreshold=1024*1024*2, 
                 maxFileSize=1024*1024*10,      
                 maxRequestSize=1024*1024*50)

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "RequestLectureServelet", urlPatterns = {"/RequestLectureServelet"})
public class RequestLectureServelet extends HttpServlet {
    RequestLecture requestlecture = new RequestLecture();
    DbSave dbsave = new DbSave();

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        PrintWriter writer=response.getWriter();

         
    
        
        
        String subject = request.getParameter("subject");
        String date = request.getParameter("daterange");
        String time = request.getParameter("time");
        String venue = request.getParameter("venue");
        String description = request.getParameter("description");

        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        
        

        requestlecture.setSubject(subject);
        requestlecture.setDate(date);
        requestlecture.setTime(time);
        requestlecture.setVenue(venue);
        requestlecture.setDescription(description);
        requestlecture.setUniversityID(universityID);
        
        try {
                boolean b = dbsave.RequestLecture(requestlecture);
                request.setAttribute("RequestLectureSucess", "Request Send Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("RequestLecture.jsp");
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
