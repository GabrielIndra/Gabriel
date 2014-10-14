/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;
import com135314075model.Penduduk;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPenduduk {
    public static void main(String[] args) {
        PBO2.model.Penduduk test= new PBO2.model.Penduduk("Pandu", "Sleman", "20Januari1990");
        System.out.println("Nama Penduduk= "+test.getNama());
        System.out.println("Tempat Lahir= "+test.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test.getTanggalLahir());
        System.out.println("");
        PBO2.model.Penduduk test1= new PBO2.model.Penduduk("Joseph", "Bali", "20Maret1990");
        System.out.println("Nama Penduduk= "+test1.getNama());
        System.out.println("Tempat Lahir= "+test1.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test1.getTanggalLahir());
        System.out.println("");
        PBO2.model.Penduduk test2= new PBO2.model.Penduduk("Vinsen", "Jogja", "20JApril1990");
        System.out.println("Nama Penduduk= "+test2.getNama());
        System.out.println("Tempat Lahir= "+test2.getTempatLahir());
        System.out.println("Tanggal Lahir= "+test2.getTanggalLahir());
    }
}
