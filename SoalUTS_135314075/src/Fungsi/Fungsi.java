/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import static Koneksi.DataHandler.getConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 8.1 Enterprise
 */
public class Fungsi {
    public static int Equery(String sql) throws Exception{
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        try{
            if (stmt.executeUpdate(sql)==1){
                return 1;
            }else{
                return 0;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return -1;
        }
    }
}
