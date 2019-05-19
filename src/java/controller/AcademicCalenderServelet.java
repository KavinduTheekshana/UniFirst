/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AcadamicCalander;
import Model.AddPost;
import Register.DbSave;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AcademicCalenderServelet", urlPatterns = {"/AcademicCalenderServelet"})
public class AcademicCalenderServelet extends HttpServlet {
    AcadamicCalander acadamiccalander = new AcadamicCalander();
    DbSave dbsave = new DbSave();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String title = req.getParameter("title");
          String start = req.getParameter("start");
           String end = req.getParameter("end");
           
           acadamiccalander.setTitle(title);
           acadamiccalander.setStart(start);
           acadamiccalander.setEnd(end);
           
           
           try {
                boolean b = dbsave.AddAcadamicCalander(acadamiccalander);
                req.setAttribute("AddAcadamicCalander", "Acadamic Calander Added Sucessfully !");
                RequestDispatcher rd = req.getRequestDispatcher("AcademicCalendar.jsp");
                rd.forward(req, resp);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
    }



}
