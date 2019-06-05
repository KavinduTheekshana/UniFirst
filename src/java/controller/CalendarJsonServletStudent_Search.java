/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AcadamicCalander;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kavindu
 */
@WebServlet(name = "CalendarJsonServletStudent_Search", urlPatterns = {"/CalendarJsonServletStudent_Search"})
public class CalendarJsonServletStudent_Search extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
                List progs = new ArrayList();

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unifirst", "root", "123");
                ResultSet rs = con.createStatement().executeQuery("SELECT `id`, `title`, `start`, `end` FROM `acadamiccalander` where `universityID` ='" + request.getParameter("id") + "'");

                while (rs.next()) {
                    AcadamicCalander pb = new AcadamicCalander();
                    pb.setId((rs.getString(1)));
                    pb.setStart(rs.getString(3));
                    pb.setEnd(rs.getString(4));
                    pb.setTitle(rs.getString(2));
                    progs.add(pb);

                }
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                out.write(new Gson().toJson(progs));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalendarJsonServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CalendarJsonServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
