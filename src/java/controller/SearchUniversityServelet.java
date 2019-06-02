/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;

/**
 *
 * @author Kavindu Theekshana
 */
@WebServlet(name = "SearchUniversityServelet", urlPatterns = {"/SearchUniversityServelet"})
public class SearchUniversityServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String Query = "";
            
            if (req.getParameter("search") != null) {
                Query="SELECT * FROM users where user_role='University' && id="+req.getParameter("search");
            } else {
                Query="SELECT * FROM users where user_role='University'";

            }
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unifirst", "root", "");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(Query);
            
            JSONArray jsonarray=new JSONArray();
            
            while (rs.next()) {
                JsonObject jsonobject=new JsonObject();
                jsonobject.
                jsonobject.add("id", rs.getString("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Error" + e.getMessage());
        }

    }

}
