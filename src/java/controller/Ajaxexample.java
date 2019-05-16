/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class Ajaxexample extends HttpServlet {
 
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
 
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
 
int n1 = Integer.parseInt(request.getParameter("n1"));
int n2 = Integer.parseInt(request.getParameter("n2"));
 
out.println(n1 + n2 + "");
 
}
}
