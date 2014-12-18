/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class TestListEmp {

    public static void main(String[] args) throws SQLException {
        ListEmp le = new ListEmp();
        ResultSet rset = le.getAllEmployees();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3)
                    + " " + rset.getString(4) + " " + rset.getString(5) + " " + rset.getString(6)
                    + " " + rset.getString(7) + " " + rset.getString(8));
        }
        le.conn.close();
    }
}
