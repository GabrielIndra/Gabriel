package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author admin
 */
public class DataHandler {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid= "HR";
    String password= "135314075";
    
    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    public DataHandler(){
        
    }
    public void getDBConnection(){
        try{
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Connected");
        
        }catch (SQLException ex){
            System.out.println("Masih belum konek");
        }
    }
    
    public String getDBConnnection(){
        try{
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            return "Connected";
        
        }catch (SQLException ex){
           return "Masih belum konek";
        }
    }
    public void close(){
        try{
            conn.close();
        }catch (SQLException ex){
            System.out.println("Tidak bisa tutup koneksi");
        }
    }
}

