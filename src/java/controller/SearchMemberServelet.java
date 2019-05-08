/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.SearchMember;
import Register.DbSeaarch;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "SearchMemberServelet", urlPatterns = {"/SearchMemberServelet"})
public class SearchMemberServelet extends HttpServlet {
    DbSeaarch dbsearch = new DbSeaarch();

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
            out.println("<title>Servlet SearchMemberServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchMemberServelet at " + request.getContextPath() + "</h1>");
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
            
//        ArrayList<SearchMember> searchmember = new ArrayList<>();
//        if (request.getParameter("BtnType").equals("search")) {
//            String selection = request.getParameter("selection");
//            String searchText = request.getParameter("searchText");
//            try {
//                if (selection.equals("mainClassification")) {
//                    searchmember = dbsearch.getMemberByOneField(selection, searchText);
//                }
//                
//                request.setAttribute("books", searchmember);
//                request.getRequestDispatcher("/ViewMember.jsp").forward(request, response);
//            } catch (Exception ex) {
//                Logger.getLogger(SearchMemberServelet.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else if (request.getParameter("BtnType").equals("all")) {
//            try {
//                searchmember = dbsearch.getAllMembers();
//                request.setAttribute("books", searchmember);
//                request.getRequestDispatcher("/ViewMember.jsp").forward(request, response);
//            } catch (SQLException ex) {
//                Logger.getLogger(SearchMemberServelet.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
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
