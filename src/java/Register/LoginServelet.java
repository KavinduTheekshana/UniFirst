/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.rsa.RSACore;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "LoginServelet", urlPatterns = {"/LoginServelet"})
public class LoginServelet extends HttpServlet {

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
            out.println("<title>Servlet LoginServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServelet at " + request.getContextPath() + "</h1>");
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
        
        PrintWriter out = response.getWriter(); 
        String txtEmail = request.getParameter("txtEmail");
        String txtPassword = request.getParameter("txtPassword");
        Statement stmt;
        ResultSet rs=null;
        
        try {
            
            String email = null;
            String password = null;
            String role = null;
            String ststus = null;
            String name = null;
            String universityID = null;
            
            
            stmt=DBConnection.getStatementConnection();
            rs=new DbSeaarch().searchLogin();
            while(rs.next()){
                email = rs.getString("email");
                password = rs.getString("password");
                role = rs.getString("user_role");
                ststus = rs.getString("ststus");
                name = rs.getString("name");
                universityID = rs.getString("id");
            

                if(txtPassword.equals(password) && txtEmail.equals(email)){
                    if(ststus.equals("1")){                    
                        if(role.equals("University")){
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);
                            session.setAttribute("universityID", universityID);
                            session.setMaxInactiveInterval(60*60*24);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5*60);
                            response.addCookie(cookie);

                            response.sendRedirect("UniversityDashboard.jsp");
                        }else if(role.equals("Company")){
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5*60);
                            response.addCookie(cookie);

                            response.sendRedirect("CompanyDashboard.jsp");
                        }else if(role.equals("Admin")){
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5*60);
                            response.addCookie(cookie);

                            response.sendRedirect("AdminDashboard.jsp");
                        }
                    }else{
                        out.print("Your Account Has Temporery Blocked");
                    }
                }
                else{ 
                    request.setAttribute("errorMessage", "Wrong User Name or Password");
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);    
                }
            }
          
            
        } catch (Exception e) {
            
            out.println(e.toString());
        }   
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
