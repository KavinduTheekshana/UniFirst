/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import static Register.DBConnection.stat;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Addmember;
import java.sql.PreparedStatement;

/**
 *
 * @author Kavindu Theekshana
 */
public class DbSave {
    
    DBConnection conn = new DBConnection();
    Connection con = null;
    static Statement stat;
    PreparedStatement pst = null;
    
   public static void signup(String name,String address,String user_role,String email,String password){
       stat = DBConnection.getStatementConnection();
       int ststus=0;
       String query="INSERT INTO `users`(`name`, `address`, `user_role`, `email`, `password`,`ststus`) "
               + "VALUES ('"+name+"','"+address+"','"+user_role+"','"+email+"','"+password+"','"+ststus+"')";
       try {
           stat.executeUpdate(query);
       } catch (Exception e) {
           Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, e);
       }
   }
   
   public boolean  AddMember(Addmember addmember) throws SQLException{
       con = DBConnection.getConnection();
        String q = "INSERT INTO `users`(`name`, `address`, `user_role`,`universityID`, `email`, `password`,`ststus`) VALUES(?,?,?,?,?,?,?);";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, addmember.getUsername());
            pst.setString(2, addmember.getAddress());
            pst.setString(3, "Student");
            pst.setString(4, addmember.getUniversityID());
            pst.setString(5, addmember.getEmail());
            pst.setString(6, addmember.getPassword());
            pst.setString(7, "1");

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
       
       
       
       
//        stat = DBConnection.getStatementConnection();
//       int ststus=1;
//       String user_role="Student";
//       String query="INSERT INTO `users`(`name`, `address`, `user_role`, `email`, `password`,`ststus`) "
//               + "VALUES ('"+name+"','"+address+"','"+user_role+"','"+email+"','"+password+"','"+ststus+"')";
//       try {
//           stat.executeUpdate(query);
//       } catch (Exception e) {
//           Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, e);
//       }
    }
   
   
   
      public boolean  UpdateMember(Addmember addmember) throws SQLException{
       con = DBConnection.getConnection();
        String id = addmember.getId();
        String q = "UPDATE `users` SET `name`=?,`address`=?,`email`=?,`password`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, addmember.getUsername());
            pst.setString(2, addmember.getAddress());
            pst.setString(3, addmember.getEmail());
            pst.setString(4, addmember.getPassword());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    
}
