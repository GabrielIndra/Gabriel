/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.model;

import java.util.ArrayList;

/**
 *
 * @author 8.1 Enterprise
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    public static ArrayList<Mahasiswa> DAFTAR_MAHASISWA = new ArrayList<Mahasiswa>();

    public Mahasiswa(String nim, String nama, String prodi) throws Exception {
        setNim(nim);
        setNama(nama);
        setProdi(prodi);
    }

    public Mahasiswa() {
    }

    public static ArrayList<Mahasiswa> getDAFTAR_MAHASISWA() {
        return DAFTAR_MAHASISWA;
    }

    public static void setDAFTAR_MAHASISWA(ArrayList<Mahasiswa> DAFTAR_MAHASISWA) {
        Mahasiswa.DAFTAR_MAHASISWA = DAFTAR_MAHASISWA;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        String pola="[a-zA-Z ']*";
        if (nama.matches(pola))
            this.nama = nama;
        else{
            throw new Exception("Name Invalid!!");
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) throws Exception {
        String pola="[0-9]*";
        if (nim.matches(pola))
            this.nim = nim;
        else{
            throw new Exception("NIM hanya mengandung angka");
        }
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) throws Exception {
        String pola="[a-zA-Z0-9]*";
        if (prodi.matches(pola))
            this.prodi = prodi;
        else{
            throw new Exception("Prodi invalid name");
        }  
    }
    
    public static void tambahMahasiswa(Mahasiswa mahasiswa){
        DAFTAR_MAHASISWA.add(mahasiswa);
    }
}
