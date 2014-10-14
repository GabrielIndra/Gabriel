/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMahasiswa;

import Mahasiswa.Mahasiswa;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa test1= new Mahasiswa("Raminten", "123457", "Jogja City", "29Februari2012");
        System.out.println("Nama= "+test1.getNama());
        System.out.println("NIM= "+test1.getNim());
        System.out.println("Alamat= "+test1.getTempatLahir());
        System.out.println("Tanggal lahir= "+test1.getTanggalLahir());
        System.out.println(" ");
        Mahasiswa test2= new Mahasiswa("Paijo", "123432", "Jawa", "1Muharam");
        System.out.println("Nama= "+test2.getNama());
        System.out.println("NIM= "+test2.getNim());
        System.out.println("Alamat= "+test2.getTempatLahir());
        System.out.println("Tanggal lahir= "+test2.getTanggalLahir());
        
    }
}
