/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;
import com135314075model.Manajer;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestManajer {
    public static void main(String[] args) {
           Manajer test=new Manajer("In", "Sleman", "2April", "135314", 2, 2);
           
           System.out.println("Nama= "+test.getNama());
           System.out.println("Tempat lahir= "+test.getTempatLahir());
           System.out.println("Tanggal lahir= "+test.getTanggalLahir());
           System.out.println("NIP= "+test.getNip());
           System.out.println("Gaji= "+test.gaji());
    }
}
