/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author 8.1 Enterprise
 */
public class Mahasiswa extends Penduduk{
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String tempatLahir, String tanggalLahir) {
        super(nama, tempatLahir, tanggalLahir);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
  
    public double hitIuran(){
        return Double.parseDouble(nim)/10000;
    }
}
