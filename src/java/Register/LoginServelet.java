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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String txtEmail = request.getParameter("txtEmail");
        String txtPassword = request.getParameter("txtPassword");
        Statement stmt;
        ResultSet rs = null;

        try {

            stmt = DBConnection.getStatementConnection();
            rs = new DbSeaarch().searchLogin();
            boolean b = true;
            while (rs.next()) {

                String email = null;
                String password = null;
                String role = null;
                String ststus = null;
                String name = null;
                String universityID = null;
                String uniID = null;
                String profilepic = null;

                email = rs.getString("email");
                password = rs.getString("password");
                role = rs.getString("user_role");
                ststus = rs.getString("ststus");
                name = rs.getString("name");
                universityID = rs.getString("id");
                uniID = rs.getString("universityID");
                profilepic = rs.getString("profilepic");

                if (txtPassword.equals(password) && txtEmail.equals(email)) {
                    System.out.println("if" + txtPassword);
                    System.out.println("if" + txtEmail);
                    System.out.println(email);

                    if (ststus.equals("1")) {
                        if (role.equals("University")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);
                            session.setAttribute("role", role);
                            session.setAttribute("universityID", universityID);
                            session.setAttribute("profilepic", profilepic);
                            session.setMaxInactiveInterval(60 * 60 * 24);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5 * 60);
                            response.addCookie(cookie);

                            response.sendRedirect("UniversityDashboard.jsp");

                        } else if (role.equals("Company")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);
                            session.setAttribute("role", role);
                            session.setAttribute("universityID", universityID);
                            session.setAttribute("profilepic", profilepic);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5 * 60);
                            response.addCookie(cookie);

                            response.sendRedirect("CompanyDashboard.jsp");
                        }else if (role.equals("Student")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);
                            session.setAttribute("role", role);
                            session.setAttribute("universityID", universityID);
                            session.setAttribute("uniID", uniID);
                            session.setAttribute("profilepic", profilepic);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5 * 60);
                            response.addCookie(cookie);

                            response.sendRedirect("StudentDashboard.jsp");
                        }else if (role.equals("Admin")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("name", name);
                            session.setAttribute("role", role);
                            session.setAttribute("universityID", universityID);
                            session.setAttribute("profilepic", profilepic);

                            Cookie cookie = new Cookie("email", email);
                            cookie.setMaxAge(5 * 60);
                            response.addCookie(cookie);

                            response.sendRedirect("AdminDashboard.jsp");
                        }
                    } else if (ststus.equals("0")){
                        RequestDispatcher rd = request.getRequestDispatcher("Blocked.jsp");
                        rd.forward(request, response);
                        out.print("Your Account Has Temporery Blocked");
                    }else{
                        RequestDispatcher rd = request.getRequestDispatcher("Activate.jsp");
                        rd.forward(request, response);
                        out.print("Your Account Has Temporery Blocked");
                    }
                    
                    b=false;

                    break;

                }
            }

            if (b) {
                request.setAttribute("errorMessage", "Wrong User Name or Password");
                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                rd.forward(request, response);
            }

        } catch (Exception e) {

            out.println(e.toString());
        }
    }

}
