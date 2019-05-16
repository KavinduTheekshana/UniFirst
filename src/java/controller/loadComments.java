/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
        try {
            
            
            
            String content = "";
            
            for (int i = 0; i < 10; i++) {
                content += " <input type='text' id='commentid${b.getId()}' class='form-control' placeholder='Type A Comment in Here' aria-label='Recipient's username' aria-describedby='basic-addon2'>";

            }

            resp.getWriter().write(content);
        } catch (Exception e) {
        }
    }

}
