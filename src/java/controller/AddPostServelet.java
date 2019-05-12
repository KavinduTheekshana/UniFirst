/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.UniversityAddPost;
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
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "AddPostServelet", urlPatterns = {"/AddPostServelet"})
public class AddPostServelet extends HttpServlet {
     private static final String SAVE_DIR="images";
    UniversityAddPost universityaddpost = new UniversityAddPost();
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
        

        
        
//  String saveFile="";
//    String contentType = request.getContentType();
//        DataInputStream in = new DataInputStream (request.getInputStream());
//        int formDataLength = request.getContentLength();
//        byte dataBytes[] = new byte [formDataLength];
//        int byteRead = 0;
//        int totalBytesRead = 0;
//        while (totalBytesRead< formDataLength){
//            byteRead = in.read(dataBytes,totalBytesRead,formDataLength);
//            totalBytesRead += byteRead;
//        }
//        String file = new String(dataBytes);
//        saveFile = file.substring(file.indexOf("filename=\"")+10);
//        saveFile= saveFile.substring(0,saveFile.indexOf("\n"));
//        saveFile = saveFile.substring(saveFile.lastIndexOf("\\")+ 1,saveFile.indexOf("\""));
//        int lastIndex = contentType.lastIndexOf("=");
//        String boundary = contentType.substring(lastIndex + 1,contentType.length());
//        int pos;
//        pos=file.indexOf("filename=\"");
//        pos=file.indexOf("\n",pos) + 1;
//        pos=file.indexOf("\n",pos) + 1;
//        pos=file.indexOf("\n",pos) + 1;
//        int boundaryLocation = file.indexOf(boundary,pos) -4;
//        int startPos = ((file.substring(0,pos)).getBytes()).length;
//        int endPos= ((file.substring(0,boundaryLocation)).getBytes()).length;
//        File ff = new File("C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/"+saveFile);
//        FileOutputStream fileOut=new FileOutputStream (ff);
//        fileOut.write(dataBytes,startPos , (endPos-startPos));
//        fileOut.flush();
//        fileOut.close();
        
        
        
        
        
        
        
        
        
        PrintWriter out = response.getWriter(); 
        String title = request.getParameter("title");
        String postbody = request.getParameter("postbody");
        

        universityaddpost.setTitle(title);
        universityaddpost.setPostbody(postbody);
        
        try {
                boolean b = dbsave.AddPost(universityaddpost);
                request.setAttribute("SucessMessage", "Post Added Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("UniversityAddPost.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
        

        
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
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String savePath = "C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/" + File.separator + SAVE_DIR;
                File fileSaveDir=new File(savePath);
                if(!fileSaveDir.exists()){
                    fileSaveDir.mkdir();
                }
                
            Part part=request.getPart("file");
            String fileName=extractFileName(part);
            part.write(savePath + File.separator + fileName);
            String filePath= savePath + File.separator + fileName ;
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println(filePath);
        
//         try {
//            ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
//            List<FileItem> multifiles = sf.parseRequest(request);
//            
//            for(FileItem item:multifiles){
//                item.write(new File("/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/"+item.getName()));
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
     
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
