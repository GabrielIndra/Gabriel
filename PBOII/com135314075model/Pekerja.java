 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;


/**
 *
 * @author 8.1 Enterprise
 */
public class Pekerja extends Penduduk implements Penghasilan{
    public static int UPAH_POKOK=1000;
    private String nip;
    private int golongan;
    public Pekerja(){
    }
    public Pekerja(String nama, String tempatLahir, String tanggalLahir,String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public int getGolongan() {
        return golongan;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    @Override
    public int gaji() {
        return UPAH_POKOK*golongan;
    }
}
