/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author 8.1 Enterprise
 */
public class Nilai {
 private int UTS, UAS;
 private Mahasiswa mahasiswa;

    public Nilai(int UTS, int UAS, Mahasiswa mahasiswa) {
        this.UTS = UTS;
        this.UAS = UAS;
        this.mahasiswa = mahasiswa;
    }

    public int getUTS() {
        return UTS;
    }

    public void setUTS(int UTS) {
        this.UTS = UTS;
    }

    public int getUAS() {
        return UAS;
    }

    public void setUAS(int UAS) {
        this.UAS = UAS;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
 
}
