/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "checkcount", urlPatterns = {"/checkcount"})
public class checkcount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String host = "jdbc:mysql://localhost:3306/unifirst";
        Statement stat = null;
        ResultSet res = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(host, "root", "");

            stat = conn.createStatement();

            String data = "SELECT COUNT(users.id) as idcount FROM `users`";
            res = stat.executeQuery(data);
            if (res.first()) {
                System.out.println(res.getString("idcount"));
            }
        } catch (Exception ex) {
            Logger.getLogger(checkcount.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
