/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author 8.1 Enterprise
 */
public class DataHandler {
    public static Connection getConnection()throws Exception{
        String jdbcurl="jdbc:oracle:thin:@172.23.9.185:1521:orcl";
        String userid="mhs135314075";
        String paswd="mhs135314075";
        Connection conn = null;
        
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcurl);
        conn = ds.getConnection(userid, paswd);
        
        return conn;
        
    }
}
