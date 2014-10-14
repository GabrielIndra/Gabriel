/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;
import com135314075model.Marketing;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestMarketing {
    public static void main(String[] args) {
        
        Marketing test=new Marketing("In", "Sleman", "4 Agustus", "135314", 3);
        
        System.out.println("NAma= "+test.getNama());
        System.out.println("Nip= "+test.getNip());
        System.out.println("Tempat lahir= "+test.getTempatLahir());
        System.out.println("Gaji= "+test.GajiMarketing());
    }
}
