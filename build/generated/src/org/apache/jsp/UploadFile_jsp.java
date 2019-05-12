package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.zip.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class UploadFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String saveFile="";
    String contentType = request.getContentType();
    if((contentType !=null)&& (contentType.indexOf("multipart/form-data")>=0)){
        DataInputStream in = new DataInputStream (request.getInputStream());
        int formDataLength = request.getContentLength();
        byte dataBytes[] = new byte [formDataLength];
        int byteRead = 0;
        int totalBytesRead = 0;
        while (totalBytesRead< formDataLength){
            byteRead = in.read(dataBytes,totalBytesRead,formDataLength);
            totalBytesRead += byteRead;
        }
        String file = new String(dataBytes);
        saveFile = file.substring(file.indexOf("filename=\"")+10);
        saveFile= saveFile.substring(0,saveFile.indexOf("\n"));
        saveFile = saveFile.substring(saveFile.lastIndexOf("\\")+ 1,saveFile.indexOf("\""));
        int lastIndex = contentType.lastIndexOf("=");
        String boundary = contentType.substring(lastIndex + 1,contentType.length());
        int pos;
        pos=file.indexOf("filename=\"");
        pos=file.indexOf("\n",pos) + 1;
        pos=file.indexOf("\n",pos) + 1;
        pos=file.indexOf("\n",pos) + 1;
        int boundaryLocation = file.indexOf(boundary,pos) -4;
        int startPos = ((file.substring(0,pos)).getBytes()).length;
        int endPos= ((file.substring(0,boundaryLocation)).getBytes()).length;
        File ff = new File("C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/"+saveFile);
        FileOutputStream fileOut=new FileOutputStream (ff);
        fileOut.write(dataBytes,startPos , (endPos-startPos));
        fileOut.flush();
        fileOut.close();

      out.write("<br><table border=\"2\" <tr><td><b>You have successfully upload the file:</b>\n");
      out.write("            ");
out.println(saveFile);
      out.write("</td></tr></table>\n");
      out.write("            ");

                PreparedStatement psmnt = null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/photo","root","");
                    psmnt = con.prepareStatement("insert into myphoto(image) values(?)");
                    psmnt.setString(1,ff.getPath());
                    int s = psmnt.executeUpdate();
                    if(s>0)
                    {
                        out.println("<h1>Uploaded Successfully !</h1>");
                        
                    }
                    
                    else
                    {
                        out.println("Error!");
                    }
                    
                }
                catch(Exception e)
                {
                    out.println(e);
                }
                
}
                
                
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
