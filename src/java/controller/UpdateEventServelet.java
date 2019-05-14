/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.AddEvent;
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
@WebServlet(name = "UpdateEventServelet", urlPatterns = {"/UpdateEventServelet"})
public class UpdateEventServelet extends HttpServlet {
    AddEvent universityaddevent = new AddEvent();
    DbSave dbsave = new DbSave();





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
        
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String daterange = request.getParameter("daterange");
        String time = request.getParameter("time");
        String type = request.getParameter("type");
        String venue = request.getParameter("venue");
        String description = request.getParameter("description");


        
        universityaddevent.setId(id);
        universityaddevent.setTitle(title);
        universityaddevent.setDate(daterange);
        universityaddevent.setTime(time);
        universityaddevent.setType(type);
        universityaddevent.setVenue(venue);
        universityaddevent.setDescription(description);

        
        try {
                boolean b = dbsave.UpdateEvent(universityaddevent);
                request.setAttribute("EventUpdateSucessMessage", "Event Update Sucessfully !");
                RequestDispatcher rd = request.getRequestDispatcher("ViewEvent.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        
        
        
        
        
        
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
