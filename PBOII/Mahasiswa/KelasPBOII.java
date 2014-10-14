/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

import java.util.ArrayList;

/**
 *
 * @author 8.1 Enterprise
 */
public class KelasPBOII implements Pengajaran {
private ArrayList <Mahasiswa> listMahasiswa= new ArrayList<Mahasiswa>();
private ArrayList <Nilai> listNilai= new ArrayList<Nilai>();

    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public ArrayList<Nilai> getListNilai() {
        return listNilai;
    }

    public void setListNilai(ArrayList<Nilai> listNilai) {
        this.listNilai = listNilai;
    }

    public void setListMahasiswa(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    @Override
    public int rerataNilai(Mahasiswa mhs, Nilai nilai) {
      int rata= ((nilai.getUTS()+nilai.getUAS())/2);
        return rata;
    }
    @Override
    public void tambahMahasiswa(Mahasiswa mhs, Nilai nilai) {
    listMahasiswa.add(mhs);
//    Nilai tempNilai= new Nilai(100, 100, mhs);
//    tempNilai.setMahasiswa(mhs);
    listNilai.add(nilai);
    }
    
    public void hapusMahasiswa(Mahasiswa mhs){
        if (constains (mhs)){
            listMahasiswa.remove(mhs);
            System.out.println("Sudah dihapus");
        }
        else {
            System.out.println("tidak terdaftar");
        }
    }
    public boolean constains(Mahasiswa mhs){
        if(listMahasiswa.isEmpty()){
            return false;
        }
        else {
            return listMahasiswa.contains(mhs);
    }
}

    
    
    
}