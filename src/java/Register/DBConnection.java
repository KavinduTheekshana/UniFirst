/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavindu Theekshana
 */
public class DBConnection {
    
    
    static Connection conn;
    static Statement stat;
    
    public static Statement getStatementConnection(){
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/unifirst";
        try {
            Class.forName(driver);            
            conn=DriverManager.getConnection(url,"root","");
            stat = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stat;
    }
    
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
    public static Connection getConnection() throws SQLException{
         Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unifirst","root","");
            
    } catch (Exception ex) {

        Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
    }
    
    
    
    
    
 
   
    
//    public void signup(String name,String address,String type,String email,String password) {
//        String query="INSERT INTO `users`(`name`, `address`, `type`, `email`, `password`) VALUES ('"+name+"','"+address+"','"+type+"','"+email+"','"+password+"')";
////        connectToDb();
//    try {
//        stat.executeUpdate(query);
//    } catch (SQLException ex) {
//        Logger.getLogger(LoginSignup.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    }
    

    
}
