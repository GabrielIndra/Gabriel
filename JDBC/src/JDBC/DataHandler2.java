/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class DataHandler2 {

    public static Connection getConnection() throws Exception {
        Connection conn;
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "HR";
        String password = "135314075";

        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(jdbcUrl, userid, password);
        System.out.println("Koneksi Ok");
        return conn;
    }
}
