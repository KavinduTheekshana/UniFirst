/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavindu Theekshana
 */
public class temporyDB {
        static Connection c;

    private static void setConnection() throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("");
    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            setConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static Connection getDB() throws Exception {
        if (c == null) {
            setConnection();
        }
        return c;
    }

    public void ifexist() {
        try {
            ResultSet catalogs = getDB().getMetaData().getCatalogs();
            while (catalogs.next()) {
                System.out.println(catalogs.getString(0));
            }
        } catch (Exception ex) {
            Logger.getLogger(temporyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
