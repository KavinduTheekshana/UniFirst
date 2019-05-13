/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "checkSession", urlPatterns = {"/checkSession"})
public class checkSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("awa");
            if (req.getSession(false) != null) {

                if (req.getSession(false).getAttribute("name") == null) {

                    resp.getWriter().write("1");
                }
            } else {
                resp.getWriter().write("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
