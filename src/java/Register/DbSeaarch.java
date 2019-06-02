package Register;

import Model.AcadamicCalander;
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
import Model.Comment;
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
        searchmember.setProfilepic(rs.getString("profilepic"));
        searchmember.setAddress(rs.getString("address"));
        searchmember.setEmail(rs.getString("email"));
        searchmember.setId(rs.getString("id"));
        searchmember.setStstus(rs.getString("ststus"));

        return searchmember;
    }
    
    
      private AcadamicCalander extractCalanderSearch(ResultSet rs) throws SQLException {
        AcadamicCalander acadamiccalander = new AcadamicCalander();

        acadamiccalander.setTitle(rs.getString("title"));
        acadamiccalander.setStart(rs.getString("start"));
        acadamiccalander.setEnd(rs.getString("end"));
        acadamiccalander.setUniversityID(rs.getString("universityID"));
        acadamiccalander.setId(rs.getString("id"));

        return acadamiccalander;
    }
      
      
      
    
     private SearchPost extractPostSearch(ResultSet rs) throws SQLException {
        SearchPost universitysearchpost = new SearchPost();

        universitysearchpost.setTitle(rs.getString("title"));
        universitysearchpost.setImage(rs.getString("image")); 
        universitysearchpost.setPostbody(rs.getString("postbody"));
        universitysearchpost.setId(rs.getString("id"));


        return universitysearchpost;
    }
     
      private SearchPost extractPostSearchPublic(ResultSet rs) throws SQLException {
        SearchPost universitysearchpost = new SearchPost();

        universitysearchpost.setTitle(rs.getString("title"));
        universitysearchpost.setImage(rs.getString("image")); 
        universitysearchpost.setPostbody(rs.getString("postbody"));
        universitysearchpost.setId(rs.getString("id"));
        universitysearchpost.setPublisher(rs.getString("name"));


        return universitysearchpost;
    }
     
     private Comment extractCommentSearch(ResultSet rs) throws SQLException {
        Comment comment = new Comment();

        comment.setComment(rs.getString("comment")); 
        comment.setProfilepic(rs.getString("profilepic"));



        return comment;
    }
     
     private AddQueries extractQueriesSearch(ResultSet rs) throws SQLException {
        AddQueries addqueries = new AddQueries();

        addqueries.setQueries(rs.getString("queries"));
        addqueries.setImage(rs.getString("image")); 
        addqueries.setDescription(rs.getString("description"));
        addqueries.setId(rs.getString("id"));


        return addqueries;
    }
     
     
     private AddQueries extractQueriesSearchPublic(ResultSet rs) throws SQLException {
        AddQueries addqueries = new AddQueries();

        addqueries.setQueries(rs.getString("queries"));
        addqueries.setImage(rs.getString("image")); 
        addqueries.setDescription(rs.getString("description"));
        addqueries.setId(rs.getString("id"));
        addqueries.setPublisher(rs.getString("name"));
        return addqueries;
    }
     
     private AddProblem extractProblemSearch(ResultSet rs) throws SQLException {
        AddProblem addproblem = new AddProblem();

        addproblem.setTitle(rs.getString("title"));
        addproblem.setPostbody(rs.getString("description"));
        addproblem.setId(rs.getString("id"));


        return addproblem;
    }
     
     private AddProblem extractProblemSearchPublic(ResultSet rs) throws SQLException {
        AddProblem addproblem = new AddProblem();

        addproblem.setTitle(rs.getString("title"));
        addproblem.setPostbody(rs.getString("description"));
        addproblem.setId(rs.getString("id"));
        addproblem.setPublisher(rs.getString("name"));


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
       
        private AddEvent extractEventSearchPublic(ResultSet rs) throws SQLException {
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
        universityaddevent.setPublisher(rs.getString("name"));
        



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
        
        
              private RequestLecture extractRequestSearchPublic(ResultSet rs) throws SQLException {
        RequestLecture requestlecture = new RequestLecture();

        requestlecture.setId(rs.getString("id"));
        requestlecture.setSubject(rs.getString("subject"));
        requestlecture.setVenue(rs.getString("venue"));
        requestlecture.setDate(rs.getString("date"));
        requestlecture.setTime(rs.getString("time"));
        requestlecture.setDescription(rs.getString("description"));
        requestlecture.setPublisher(rs.getString("name"));
        



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
    
     public ArrayList<SearchMember> getLastFiveMembers(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM users where user_role='Student' AND universityID ='"+universityID+"' order by id desc limit 5";

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
    
    
     public ArrayList<AcadamicCalander> ManageCalander(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM acadamiccalander where universityID ='"+universityID+"'";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AcadamicCalander> acadamiccalander = new ArrayList<>();
            while (rs.next()) {
                AcadamicCalander sm = extractCalanderSearch(rs);
                acadamiccalander.add(sm);
            }
            return acadamiccalander;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
     
     
    
     public ArrayList<SearchPost> getAllPosts(String universityID) throws SQLException {
        con = DBConnection.getConnection();
         System.out.println(universityID);
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
     
     public ArrayList<SearchPost> getAllPostsWithoutWhere() throws SQLException {
        con = DBConnection.getConnection();
//        String q = "SELECT * FROM post Order By id DESC";
        String q = "SELECT post.id,post.title,post.image,post.postbody,users.name FROM post INNER JOIN users ON post.universityID=users.id Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<SearchPost> universitysearchPost = new ArrayList<>();
            while (rs.next()) {
                SearchPost sm = extractPostSearchPublic(rs);
                universitysearchPost.add(sm);
            }
            return universitysearchPost;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
 
     
      public ArrayList<Comment> getAllcomment(String x) throws SQLException {
        con = DBConnection.getConnection();
//      String q = "SELECT comments.comment,users.profilepic From comments INNER JOIN users ON comments.universityID=users.id";
        String q = "SELECT comments.comment,users.profilepic From users INNER JOIN comments ON comments.universityID=users.id where postid='"+x+"'";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<Comment> comment = new ArrayList<>();
            while (rs.next()) {
                Comment sm = extractCommentSearch(rs);
                comment.add(sm);
            }
            return comment;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
      
       public ResultSet getAllcomment2(String x) {

        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT comments.comment,users.profilepic From users INNER JOIN comments ON comments.universityID=users.id where postid='"+x+"'");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;

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
      
      
      public ArrayList<AddQueries> getLastFiveQueries(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM queries where universityID ='"+universityID+"' Order By id DESC limit 5";

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
      
      public ArrayList<AddQueries> getLastFiveQueriesAdmin(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM queries Order By id DESC limit 5";

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
      
      
       public ArrayList<AddQueries> getAllQueriesPublic(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT queries.id,queries.queries,queries.image,queries,description,users.name FROM queries INNER JOIN users ON queries.universityID=users.id Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddQueries> addqueries = new ArrayList<>();
            while (rs.next()) {
                AddQueries sm = extractQueriesSearchPublic(rs);
                addqueries.add(sm);
            }
            return addqueries;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
       
       
       
     
      public ArrayList<AddProblem> getAllProblemsPublic(String universityID) throws SQLException {
        con = DBConnection.getConnection();
//        String q = "SELECT * FROM problem Order By id DESC";
        String q = "SELECT problem.title,problem.id,problem.description,users.name FROM problem INNER JOIN users ON problem.UniversityID=users.id Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddProblem> addproblem = new ArrayList<>();
            while (rs.next()) {
                AddProblem sm = extractProblemSearchPublic(rs);
                addproblem.add(sm);
            }
            return addproblem;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
      
      
       public ArrayList<AddProblem> getAllProblems(String universityID) throws SQLException {
        con = DBConnection.getConnection();
//        String q = "SELECT * FROM problem Order By id DESC";
        String q = "SELECT problem.title,problem.id,problem.description,users.name FROM problem INNER JOIN users ON problem.UniversityID=users.id where problem.universityID = '"+universityID+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddProblem> addproblem = new ArrayList<>();
            while (rs.next()) {
                AddProblem sm = extractProblemSearchPublic(rs);
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
     
     
     
      public ArrayList<AddEvent> getLastFiveEvent(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM events where universityID ='"+universityID+"' Order By id DESC limit 5";

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
      
      
            public ArrayList<AddEvent> getLastFiveEventAdmin() throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT * FROM events Order By id DESC limit 5";

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
       
     public ArrayList<AddEvent> getAllEventPublic(String universityID) throws SQLException {
        con = DBConnection.getConnection();
//        String q = "SELECT * FROM events Order By id DESC";
        String q = "SELECT events.id,events.type,events.title,events.date,events.time,events.venue,events.description,events.image,events.special,users.name FROM events INNER JOIN users ON events.universityID=users.id Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddEvent> universityaddevent = new ArrayList<>();
            while (rs.next()) {
                AddEvent sm = extractEventSearchPublic(rs);
                universityaddevent.add(sm);
            }
            return universityaddevent;

        } catch (SQLException e) {
            Logger.getLogger(DbSeaarch.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }
     
     
        public ArrayList<AddEvent> getSpecialEventPublic(String name) throws SQLException {
        con = DBConnection.getConnection();
//        String q = "SELECT * FROM events Order By id DESC";
        String q = "SELECT events.id,events.type,events.title,events.date,events.time,events.venue,events.description,events.image,events.special,users.name FROM events INNER JOIN users ON events.universityID=users.id WHERE special='"+name+"' Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<AddEvent> universityaddevent = new ArrayList<>();
            while (rs.next()) {
                AddEvent sm = extractEventSearchPublic(rs);
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
        
        public ArrayList<RequestLecture> getAllRequestPublic(String universityID) throws SQLException {
        con = DBConnection.getConnection();
        String q = "SELECT requestlecture.id,requestlecture.subject,requestlecture.date,requestlecture.time,requestlecture.venue,requestlecture.description,users.name FROM requestlecture INNER JOIN users ON requestlecture.UniversityID=users.id Order By id DESC";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<RequestLecture> requestlecture = new ArrayList<>();
            while (rs.next()) {
                RequestLecture sm = extractRequestSearchPublic(rs);
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
    
    public static String UniversityCalanderDelete(String id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String q = "DELETE FROM `acadamiccalander` WHERE `id` ='"+id+"'";
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
