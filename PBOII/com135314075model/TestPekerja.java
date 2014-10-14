/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;
import com135314075model.Pekerja;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPekerja {
    public static void main(String[] args) {
        Pekerja test=new Pekerja("Pandu", "Sleman", "20Januari1990", "001", 4);
        System.out.println("Nama= "+test.getNama());
        System.out.println("Tempat lahir= "+test.getTempatLahir());
        System.out.println("GAji= "+test.gaji());
    }
    
    
}
