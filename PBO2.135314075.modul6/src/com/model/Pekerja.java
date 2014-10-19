package com.model;

/**
 *
 * @author 8.1 Enterprise
 */
public class Pekerja extends Penduduk{
    public static int UPAH_POKOK=5000;
    private String nip;
    private int golongan;
    public Pekerja() {
    }

    public Pekerja(String nama, String nip, int golongan, String tempatLahir, String tanggalLahir, String noKTP) throws Exception {
        super(nama, tempatLahir, tanggalLahir, noKTP);
        this.nip = nip;
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) throws Exception{
        String pola="[0-9]*";
        if (nip.matches(pola))
        this.nip = nip;
        else{
            throw new Exception("NIP hanya mengandung angka");
        }
    }
    
    public int UpahGaji(){
        return UPAH_POKOK*golongan;
    }
    
}
