package Koneksi;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler21 {

    public static Connection getConnection() throws Exception {
        String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:orcl";
        String userid = "mhs135314062";
        String password = "mhs135314062";
        Connection conn = null;

        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn = ds.getConnection(userid, password);
        
        return conn;
    }
}
