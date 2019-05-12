/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.UniversityAddEvent;
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
    UniversityAddEvent universityaddevent = new UniversityAddEvent();
    DbSave dbsave = new DbSave();

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
            out.println("<title>Servlet UpdateEventServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateEventServelet at " + request.getContextPath() + "</h1>");
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
                RequestDispatcher rd = request.getRequestDispatcher("UniversityViewEvent.jsp");
                rd.forward(request, response);  
            
        } catch (Exception e) {
            Logger.getLogger(AddMemberServelet.class.getName()).log(Level.SEVERE, null, e);
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
