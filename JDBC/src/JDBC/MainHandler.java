/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;



/**
 *
 * @author admin
 */
public class MainHandler {
    public static void main(String[] args)  {
        DataHandler datahandler= new DataHandler();
        datahandler.getDBConnection();
        datahandler.close();
        
    }
}
