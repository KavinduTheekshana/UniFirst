/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AddPost;
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
@WebServlet(name = "AddPostServelet", urlPatterns = {"/AddPostServelet"})
public class AddPostServelet extends HttpServlet {
     private static final String SAVE_DIR="images";
    AddPost universityaddpost = new AddPost();
    DbSave dbsave = new DbSave();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddPostServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddPostServelet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        
        
//     PrintWriter writer=response.getWriter();
//         FileOutputStream out =null;
//         
//        response.setContentType("text/html;charset=UTF-8");
//            String savePath = "C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/images";
//                File fileSaveDir=new File(savePath);
//                if(!fileSaveDir.exists()){
//                    fileSaveDir.mkdir();
//                }
//            String firstName=request.getParameter("firstname");
//            String lastName=request.getParameter("lastname");
//            Part part=request.getPart("file");
//
//            
//            String fileName=extractFileName(part);
//
//
//             out = new FileOutputStream(new File(fileSaveDir.getAbsolutePath() + File.separator
//                + fileName));
//            InputStream filecontent = part.getInputStream();
//            
//            int read = 0;
//            final byte[] bytes = new byte[1024];
//
//               while ((read = filecontent.read(bytes)) != -1) {
//            out.write(bytes, 0, read);
//                }
//        
//
//        String title = request.getParameter("title");
//        String filePath= savePath + File.separator + fileName ;
//        String postbody = request.getParameter("postbody");
//        
//
//        universityaddpost.setTitle(title);
//        universityaddpost.setPostbody(postbody);
//        universityaddpost.setImage(filePath);
//        
//        try {
//                boolean b = dbsave.AddPost(universityaddpost);
//                request.setAttribute("SucessMessage", "Post Added Sucessfully !");
//                RequestDispatcher rd = request.getRequestDispatcher("UniversityAddPost.jsp");
//                rd.forward(request, response);  
//            
//        } catch (Exception e) {
//            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
//        }
//        
//        

        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter writer=response.getWriter();
         FileOutputStream out =null;
         
        response.setContentType("text/html;charset=UTF-8");
            String savePath = "C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/images";
            String savePathdb = "dist/images";
                File fileSaveDir=new File(savePath);
                if(!fileSaveDir.exists()){
                    fileSaveDir.mkdir();
                }
            Part part=request.getPart("file");

            
            String fileName=extractFileName(part);


             out = new FileOutputStream(new File(fileSaveDir.getAbsolutePath() + File.separator
                + fileName));
            InputStream filecontent = part.getInputStream();
            
            int read = 0;
            final byte[] bytes = new byte[1024];

               while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);
                }
        

        String title = request.getParameter("title");
        String filePath= savePathdb + File.separator + fileName ;
        String postbody = request.getParameter("postbody");
        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        

        universityaddpost.setTitle(title);
        universityaddpost.setPostbody(postbody);
        universityaddpost.setImage(filePath);
        universityaddpost.setUniversityID(universityID);
        
        try {
                boolean b = dbsave.AddPost(universityaddpost);
                request.setAttribute("postSucessMessage", "Post Added Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("AddPost.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        
     
    }
    
    
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
