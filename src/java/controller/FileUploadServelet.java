/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold=1024*1024*2, 
                 maxFileSize=1024*1024*10,      
                 maxRequestSize=1024*1024*50)

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "FileUploadServelet", urlPatterns = {"/FileUploadServelet"})
public class FileUploadServelet extends HttpServlet {
     private static final String SAVE_DIR="images";

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
            out.println("<title>Servlet FileUploadServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUploadServelet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        
//        String sav_dir="";
       
//        sav_dir="888";
//        int flag=0;
//        String saveparth="C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist"+File.separator+sav_dir;
//        File file = new File(saveparth);
//        if(!file.exists()){
//            file.mkdir();
//        }
//        String filename="";
//        List<Part> fileparts=request.getParts().stream().filter(part->"file".equals(part.getName())).collect(Collectors.toList());
//        
//        for(Part filePart:fileparts){
//            filename=Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
//            filePart.write(saveparth+"/"+filename);
//            System.out.println(sav_dir);
//            flag=1;
//        }
        
         PrintWriter out=response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
            String savePath = "C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/";
                File fileSaveDir=new File(savePath);
                if(!fileSaveDir.exists()){
                    fileSaveDir.mkdir();
                }
            String firstName=request.getParameter("firstname");
            String lastName=request.getParameter("lastname");
            Part part=request.getPart("file");
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            System.out.println("part == " +part);
            
            String fileName=extractFileName(part);
//            System.out.println("ttttttttttttttt"+savePath+File.separator + fileName);

     
            part.write(fileSaveDir.getAbsolutePath()+ "/" + fileName);

         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(FileUploadServelet.class.getName()).log(Level.SEVERE, null, ex);
         }
            Connection con = null;
         try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unifirst","root","");
         } catch (SQLException ex) {
             Logger.getLogger(FileUploadServelet.class.getName()).log(Level.SEVERE, null, ex);
         }
            String query="INSERT INTO customerdetail (first_name, last_name, file) values (?, ?, ?)";
            
                PreparedStatement pst;
         try {
             pst=con.prepareStatement(query);
              pst.setString(1, firstName);
                pst.setString(2,lastName);
                String filePath= savePath + File.separator + fileName ;
                pst.setString(3,filePath);
                pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(FileUploadServelet.class.getName()).log(Level.SEVERE, null, ex);
         }
               
    }
    // file name of the upload file is included in content-disposition header like this:
    //form-data; name="dataFile"; filename="PHOTO.JPG"
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
