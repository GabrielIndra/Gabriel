/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class MainHandler2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
        Connection conn = DataHandler2.getConnection();
        Statement stmt = conn.createStatement();
        String query= "select * from employees";
        
        ResultSet rset= stmt.executeQuery(query);
        while (rset.next()){
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3)
                    + " " + rset.getString(4) + " " + rset.getString(5) + " " + rset.getString(6)
                    + " " + rset.getString(7) + " " + rset.getString(8));
        }
        }
    }

