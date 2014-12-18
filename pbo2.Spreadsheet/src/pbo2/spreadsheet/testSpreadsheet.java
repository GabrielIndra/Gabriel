/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.spreadsheet;

/**
 *
 * @author admin
 */
public class testSpreadsheet {
    public static void main(String[] args) {    
//    Spreadsheet tes = new Spreadsheet();
        sel sel = new sel();
        sel.setText("=12+2");
        System.out.println(sel.process());
        
}}
