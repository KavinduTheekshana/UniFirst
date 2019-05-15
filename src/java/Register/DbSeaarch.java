package Register;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.SearchMember;
import Model.SearchPost;
import Model.AddProblem;
import Model.AddEvent;
import Model.AddQueries;
import Model.RequestLecture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Addmember;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.Serializable;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kavindu Theekshana
 */
public class DbSeaarch implements Serializable {

    Statement stmt;
    ResultSet rs = null;
    Connection con = null;
    PreparedStatement pst = null;


    public ResultSet searchLogin() {

        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("select * from users");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;

    }

    private SearchMember extractMemberSearch(ResultSet rs) throws SQLException {
        SearchMember searchmember = new SearchMember();

        searchmember.setUsername(rs.getString("name"));
        searchmember.setAddress(rs.getString("address"));
        searchmember.setEmail(rs.getString("email"));
        searchmember.setId(rs.getString("id"));
        searchmember.setStstus(rs.getString("ststus"));

        return searchmember;
    }
    
     private SearchPost extractPostSearch(ResultSet rs) throws SQLException {
        SearchPost universitysearchpost = new SearchPost();

        universitysearchpost.setTitle(rs.getString("title"));
        universitysearchpost.setImage(rs.getString("image")); 
        universitysearchpost.setPostbody(rs.getString("postbody"));
        universitysearchpost.setId(rs.getString("id"));


        return universitysearchpost;
    }
     
     private AddQueries extractQueriesSearch(ResultSet rs) throws SQLException {
        AddQueries addqueries = new AddQueries();

        addqueries.setQueries(rs.getString("queries"));
        addqueries.setImage(rs.getString("image")); 
        addqueries.setDescription(rs.getString("description"));
        addqueries.setId(rs.getString("id"));


        return addqueries;
    }
     
     private AddProblem extractProblemSearch(ResultSet rs) throws SQLException {
        AddProblem addproblem = new AddProblem();

        addproblem.setTitle(rs.getString("title"));
        addproblem.setPostbody(rs.getString("description"));
        addproblem.setId(rs.getString("id"));


        return addproblem;
    }
     
       private AddEvent extractEventSearch(ResultSet rs) throws SQLException {
        AddEvent universityaddevent = new AddEvent();

        universityaddevent.setId(rs.getString("id"));
        universityaddevent.setTitle(rs.getString("title"));
        universityaddevent.setVenue(rs.getString("venue"));
        universityaddevent.setDate(rs.getString("date"));
        universityaddevent.setTime(rs.getString("time"));
        universityaddevent.setType(rs.getString("type"));
        universityaddevent.setTargetaudience(rs.getString("special"));
        universityaddevent.setDescription(rs.getString("description"));
        universityaddevent.setImage(rs.getString("image"));
        



        return universityaddevent;
    }
       
       
        private RequestLecture extractRequestSearch(ResultSet rs) throws SQLException {
        RequestLecture requestlecture = new RequestLecture();

        requestlecture.setId(rs.getString("id"));
        requestlecture.setSubject(rs.getString("subject"));
        requestlecture.setVenue(rs.getString("venue"));
        requestlecture.setDate(rs.getString("date"));
        requestlecture.setTime(rs.getString("time"));
        requestlecture.setDescription(rs.getString("description"));
        



        return requestlecture;
    }
    public ArrayList<SearchMember> getMemberByOneField(String selection, String searchText) throws SQLException {
        con = DBConnection.getConnection();
        String query = "SELECT * FROM `users` WHERE " + selection + "=?";
        ArrayList<SearchMember> searchmember = new ArrayList<>();
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, searchText);

            rs = pst.executeQuery();

            while (rs.next()) {
//                SearchMember sm = extractMemberSearch(rs);
//                searchmember.add(sm);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return searchmember;
    }

    public ArrayList<SearchMember> getAllMembers(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM users where user_role='Student' AND universityID ='"+universityID+"'";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<SearchMember> searchmember = new ArrayList<>();
            while (rs.next()) {
                SearchMember sm = extractMemberSearch(rs);
                searchmember.add(sm);
            }
            return searchmember;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
    
     public ArrayList<SearchPost> getAllPosts(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM post where universityID ='"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<SearchPost> universitysearchPost = new ArrayList<>();
            while (rs.next()) {
                SearchPost sm = extractPostSearch(rs);
                universitysearchPost.add(sm);
            }
            return universitysearchPost;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
      public ArrayList<AddQueries> getAllQueries(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM queries where universityID ='"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddQueries> addqueries = new ArrayList<>();
            while (rs.next()) {
                AddQueries sm = extractQueriesSearch(rs);
                addqueries.add(sm);
            }
            return addqueries;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
      public ArrayList<AddProblem> getAllProblems(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM problem where universityID ='"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddProblem> addproblem = new ArrayList<>();
            while (rs.next()) {
                AddProblem sm = extractProblemSearch(rs);
                addproblem.add(sm);
            }
            return addproblem;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
      
      
      
     
     public ArrayList<AddEvent> getAllEvent(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM events where universityID ='"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddEvent> universityaddevent = new ArrayList<>();
            while (rs.next()) {
                AddEvent sm = extractEventSearch(rs);
                universityaddevent.add(sm);
            }
            return universityaddevent;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
        public ArrayList<RequestLecture> getAllRequest(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM requestlecture where universityID ='"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<RequestLecture> requestlecture = new ArrayList<>();
            while (rs.next()) {
                RequestLecture sm = extractRequestSearch(rs);
                requestlecture.add(sm);
            }
            return requestlecture;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
    
    
    

    public static String UniversityMemberDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `users` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
    
    public static String UniversityPostDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `post` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
    
     public static String RequestDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `requestlecture` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
     
      public static String QueriesDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `queries` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
    
     public static String UniversityEventDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `events` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
     
      public static String ProblemtDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `problem` WHERE `id` ='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Deleted";
    }
    
     public static String UniversityMemberBlock(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "UPDATE `users` SET `ststus`='0' WHERE `id`='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Updaed";
    }
     
     public static String UniversityMemberUnBlock(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "UPDATE `users` SET `ststus`='1' WHERE `id`='"+id+"'";
        PreparedStatement pst = conn.prepareStatement(q);
        pst.executeUpdate();
        return "Updaed";
    }
     
     public ResultSet UniversityMemberUpdate(String id) throws SQLException {

        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("select * from users where id='"+id+"'");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
        
    }
    
    
}
