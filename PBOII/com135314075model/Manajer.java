/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;

/**
 *
 * @author 8.1 Enterprise
 */
public class Manajer extends Pekerja implements Penghasilan{
    public static int TUNJANGAN_ESELON=1000;
    private int eselon;

    public static int getTUNJANGAN_ESELON() {
        return TUNJANGAN_ESELON;
    }

    public static void setTUNJANGAN_ESELON(int TUNJANGAN_ESELON) {
        Manajer.TUNJANGAN_ESELON = TUNJANGAN_ESELON;
    }

    public int getEselon() {
        return eselon;
    }

    public void setEselon(int eselon) {
        this.eselon = eselon;
    }

    public Manajer(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan, int eselon ) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
        this.eselon = eselon;
    }
    
    @Override
    public int gaji() {
        return super.gaji()+(TUNJANGAN_ESELON*eselon);
    }
    
}
