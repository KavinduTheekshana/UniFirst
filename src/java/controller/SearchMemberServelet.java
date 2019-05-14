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


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
