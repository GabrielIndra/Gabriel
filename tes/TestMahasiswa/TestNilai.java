/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMahasiswa;

import Mahasiswa.Mahasiswa;
import Mahasiswa.Nilai;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestNilai {
    public static void main(String[] args) {
        Mahasiswa mahasiswa= new Mahasiswa ("Sumijo", "12321", "Bantul", "15September1990");
        Mahasiswa mahasiswa2= new Mahasiswa ("Sumoji", "12334", "WestProg", "15Oktober1990");
        Mahasiswa mahasiswa3= new Mahasiswa ("Simijo", "12312", "SouthMount", "15November1990");
        
        Nilai test= new Nilai(100, 70, mahasiswa);
        Nilai test2= new Nilai(90, 80, mahasiswa);
        Nilai test3= new Nilai(80, 65, mahasiswa);
        
        System.out.println("Nama= "+mahasiswa.getNama());
        System.out.println("NIM ="+ mahasiswa.getNim());
        System.out.println("Nilai UTS ="+test.getUTS());
        System.out.println("Nilai UAS ="+test.getUAS());
        System.out.println("");
        System.out.println("Nama= "+mahasiswa2.getNama());
        System.out.println("NIM ="+ mahasiswa2.getNim());
        System.out.println("Nilai UTS ="+test2.getUTS());
        System.out.println("Nilai UAS ="+test2.getUAS());
        System.out.println("");
        System.out.println("Nama= "+mahasiswa3.getNama());
        System.out.println("NIM ="+ mahasiswa3.getNim());
        System.out.println("Nilai UTS ="+test3.getUTS());
        System.out.println("Nilai UAS ="+test3.getUAS());
    }
}
