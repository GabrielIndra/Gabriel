/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5SortingObyek;

/**
 *
 * @author 8.1 Enterprise
 */
public class Mahasiswa implements Comparable<Object>{
    private String nim, nama;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
       return nama.compareTo(((Mahasiswa)o).nama);
    }
    
}
