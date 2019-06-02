/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Register.DBConnection;
import Register.DbSeaarch;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "loadComments", urlPatterns = {"/loadComments"})
public class loadComments extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Statement stmt;
        ResultSet rs = null;
        
        try {
            
            
            
            String content = "";
            stmt = DBConnection.getStatementConnection();
            String x = req.getParameter("comment");
            System.out.println(x);
            rs = new DbSeaarch().getAllcomment2(x);
            while (rs.next()) {
                System.out.println(rs.getString("profilepic"));
            
                content += "  <div class=\"row mb-10 mt-10\">\n" +
"                                        <div class=\"col-md-2\">\n" +
"                                            \n" +
"                                        </div>\n" +
"                                        \n" +
"                                        <div class=\"col-md-10\">\n" +
"                                            <div class=\"row\">\n" +
"                                                <div class=\" avatar avatar-sm mr-15\">\n" +
"                                                    <img class=\"avatar-img rounded-circle\" src=\""+rs.getString("profilepic")+"\" alt=\"Generic placeholder image\">\n" +
"                                                </div>\n" +
"                                                <h6 class=\"pt-10\">"+rs.getString("comment")+"</h6>\n" +
"                                        \n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                                \n" +
"                                    </div>";

            }

            resp.getWriter().write(content);
        } catch (Exception e) {
        }
    }

}
