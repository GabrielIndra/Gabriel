/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;
import com135314075model.PerusahaanList;
import com135314075model.Pekerja;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPerusahaanList {
    public static void main(String[] args) {
        PerusahaanList PL= new PerusahaanList();
        
        Pekerja test1=new Pekerja("nama", "sleman", "1agustus", "13", 2);
        Pekerja test2=new Pekerja("jeneng", "sleman", "2agustus", "13", 3);
        Pekerja test3=new Pekerja("paraban", "sleman", "3agustus", "13", 4);
        
        PL.tambahPekerja(test1);
        PL.tambahPekerja(test2);
        PL.tambahPekerja(test3);
        
        for (int i = 0; i < PL.getListPekerja().size(); i++) {
            System.out.println("Nama Pekerja ke"+(i+1)+ " = "+PL.getListPekerja().get(i).getNama());    
            System.out.println("NIP \t\t = "+PL.getListPekerja().get(i).getNip());
            System.out.println("Asal pekerja \t = "+PL.getListPekerja().get(i).getTempatLahir());
            System.out.println(" ");
        
    }
        System.out.println("Gaji total pekerja= "+PL.gajiTotal());
    
}
}