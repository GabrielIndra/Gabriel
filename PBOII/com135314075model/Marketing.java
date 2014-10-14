/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314075model;

/**
 *
 * @author 8.1 Enterprise
 */
public class Marketing extends Pekerja implements Penghasilan{
    public int TUNJANGAN_TRANSPORT=1000;

    public Marketing(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
    }

    public int getTUNJANGAN_TRANSPORT() {
        return TUNJANGAN_TRANSPORT;
    }

    public void setTUNJANGAN_TRANSPORT(int TUNJANGAN_TRANSPORT) {
        this.TUNJANGAN_TRANSPORT = TUNJANGAN_TRANSPORT;
    }
    public int GajiMarketing(){
        return super.gaji()+TUNJANGAN_TRANSPORT;
    }
}
