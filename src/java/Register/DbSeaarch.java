package Register;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.SearchMember;
import Model.UniversitySearchPost;
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
    
     private UniversitySearchPost extractPostSearch(ResultSet rs) throws SQLException {
        UniversitySearchPost universitysearchpost = new UniversitySearchPost();

        universitysearchpost.setTitle(rs.getString("title"));
        universitysearchpost.setPostbody(rs.getString("postbody"));


        return universitysearchpost;
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
    
     public ArrayList<UniversitySearchPost> getAllPosts(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM post where universityID ='"+universityID+"'";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<UniversitySearchPost> universitysearchPost = new ArrayList<>();
            while (rs.next()) {
                UniversitySearchPost sm = extractPostSearch(rs);
                universitysearchPost.add(sm);
            }
            return universitysearchPost;

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
