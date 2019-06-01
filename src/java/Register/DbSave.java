/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import Model.AcadamicCalander;
import static Register.DBConnection.stat;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Addmember;
import Model.AddEvent;
import Model.AddPost;
import Model.AddProblem;
import Model.AddQueries;
import Model.Comment;
import Model.UpdateProfilePic;
import Model.RequestLecture;
import Model.UpdatePassword;
import Model.UpdateProfileDetails;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;

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
       int ststus=2;
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
      
      
      
      
        public boolean  AddPost(AddPost universityaddpost) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `post` (`title`, `image`, `postbody`, `universityID`) VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, universityaddpost.getTitle());
            pst.setString(2, universityaddpost.getImage());
            pst.setString(3, universityaddpost.getPostbody());
            pst.setString(4, universityaddpost.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
         public boolean  AddAcadamicCalander(AcadamicCalander acadamiccalander) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `acadamiccalander` (`title`, `start`, `end`,`universityID`) VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, acadamiccalander.getTitle());
            pst.setString(2, acadamiccalander.getStart());
            pst.setString(3, acadamiccalander.getEnd());
            pst.setString(4, acadamiccalander.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
        
             public boolean  AddComment(Comment comments) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `comments` (`comment`, `postid`, `universityid`) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, comments.getComment());
            pst.setString(2, comments.getPostid());
            pst.setString(3, comments.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
             
             
             
        
          public boolean  AddQueries(AddQueries addqueries) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `queries` (`queries`, `image`, `description`, `universityID`) VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, addqueries.getQueries());
            pst.setString(2, addqueries.getImage());
            pst.setString(3, addqueries.getDescription());
            pst.setString(4, addqueries.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
        
          public boolean  AddProblem(AddProblem addproblem) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `problem` (`title`, `description`, `universityID`) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, addproblem.getTitle());
            pst.setString(2, addproblem.getPostbody());
            pst.setString(3, addproblem.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
          
          
          
        
       public boolean  UpdatePost(AddPost universityaddpost) throws SQLException{
       con = DBConnection.getConnection();
       String id = universityaddpost.getId();
       String q = "UPDATE `post` SET `title`=?,`postbody`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, universityaddpost.getTitle());
            pst.setString(2, universityaddpost.getPostbody());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
       
       
        public boolean  UpdateProfilePic(UpdateProfilePic updateprofilepic) throws SQLException{
       con = DBConnection.getConnection();
       String id = updateprofilepic.getUniversityID();
            System.out.println(updateprofilepic.getImage());
       String q = "UPDATE `users` SET `profilepic`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, updateprofilepic.getImage());
//            HttpSession session=request.getSession(true);
//            session .setAttribute("profilepic", updateprofilepic.getImage());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
        
       public boolean  UpdatePassword(UpdatePassword updatepassword) throws SQLException{
       con = DBConnection.getConnection();
       String id = updatepassword.getUniversityID();
       String q = "UPDATE `users` SET `password`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, updatepassword.getPassword());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
       
            public boolean  UpdateProfileDetails(UpdateProfileDetails updateprofiledetails) throws SQLException{
       con = DBConnection.getConnection();
       String id = updateprofiledetails.getUniversityID();
       String q = "UPDATE `users` SET `name`=?,`address`=?,`email`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, updateprofiledetails.getUsername());
            pst.setString(2, updateprofiledetails.getAddress());
            pst.setString(3, updateprofiledetails.getEmail());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
       
       
       
        public boolean  UpdateQueries(AddQueries addqueries) throws SQLException{
       con = DBConnection.getConnection();
       String id = addqueries.getId();
       String q = "UPDATE `queries` SET `queries`=?,`description`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, addqueries.getQueries());
            pst.setString(2, addqueries.getDescription());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
        
        
       
          public boolean  UpdateEvent(AddEvent universityaddevent) throws SQLException{
       con = DBConnection.getConnection();
       String id = universityaddevent.getId();
       String q = "UPDATE `events` SET `title`=?,`date`=?,`time`=?,`type`=?,`venue`=?,`description`=? WHERE `id`='"+id+"'";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, universityaddevent.getTitle());
            pst.setString(2, universityaddevent.getDate());
            pst.setString(3, universityaddevent.getTime());
            pst.setString(4, universityaddevent.getType());
            pst.setString(5, universityaddevent.getVenue());
            pst.setString(6, universityaddevent.getDescription());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

        
        public boolean  AddEvent(AddEvent universityaddevent) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `events`(`title`, `date`, `time`, `type`, `venue`, `description`, `image`, `universityID`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, universityaddevent.getTitle());
            pst.setString(2, universityaddevent.getDate());
            pst.setString(3, universityaddevent.getTime());
            pst.setString(4, universityaddevent.getType());
            pst.setString(5, universityaddevent.getVenue());
            pst.setString(6, universityaddevent.getDescription());
            pst.setString(7, universityaddevent.getImage());
            pst.setString(8, universityaddevent.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
        
         public boolean  AddSpecialEvent(AddEvent universityaddevent) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `events`(`title`, `date`, `time`, `type`, `venue`, `description`, `image`, `special`,`universityID`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, universityaddevent.getTitle());
            pst.setString(2, universityaddevent.getDate());
            pst.setString(3, universityaddevent.getTime());
            pst.setString(4, universityaddevent.getType());
            pst.setString(5, universityaddevent.getVenue());
            pst.setString(6, universityaddevent.getDescription());
            pst.setString(7, universityaddevent.getImage());
            pst.setString(8, universityaddevent.getTargetaudience());
            pst.setString(9, universityaddevent.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
         
         
        public boolean  RequestLecture(RequestLecture requestlecture) throws SQLException{
        con = DBConnection.getConnection();
        String q = "INSERT INTO `requestlecture`(`subject`, `date`, `time`, `venue`, `description`, `universityID`) VALUES (?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, requestlecture.getSubject());
            pst.setString(2, requestlecture.getDate());
            pst.setString(3, requestlecture.getTime());
            pst.setString(4, requestlecture.getVenue());
            pst.setString(5, requestlecture.getDescription());
            pst.setString(6, requestlecture.getUniversityID());

            int i = pst.executeUpdate();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
}
