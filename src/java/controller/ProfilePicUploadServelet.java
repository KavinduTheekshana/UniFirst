/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.UpdateProfilePic;
import Register.DbSave;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.http.Part;



@MultipartConfig(fileSizeThreshold=1024*1024*2, 
                 maxFileSize=1024*1024*10,      
                 maxRequestSize=1024*1024*50)

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "ProfilePicUploadServelet", urlPatterns = {"/ProfilePicUploadServelet"})
public class ProfilePicUploadServelet extends HttpServlet {
    private static final String SAVE_DIR="images";
    UpdateProfilePic updateprofilePic = new UpdateProfilePic();
    DbSave dbsave = new DbSave();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          PrintWriter writer=response.getWriter();
         FileOutputStream out =null;
         
        response.setContentType("text/html;charset=UTF-8");
            String savePath = "C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/images/Profiles";
            String savePathdb = "dist/images/Profiles";
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
        

        String filePath= savePathdb + File.separator + fileName ;
        HttpSession session = request.getSession();
        String universityID = (String) session.getAttribute("universityID");
        session.setAttribute("profilepic", filePath);
        

        updateprofilePic.setImage(filePath);
        updateprofilePic.setUniversityID(universityID);
        
        try {
                boolean b = dbsave.UpdateProfilePic(updateprofilePic);
                
                request.setAttribute("ProfilePictureUpdateSucessfully", "Profile Picture Update Sucessfully !");
                
                RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
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

    

}
