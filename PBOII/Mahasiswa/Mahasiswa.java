/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author 8.1 Enterprise
 */
public class Mahasiswa extends Penduduk{
    private String nim;

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nama, String nim, String tempatLahir, String tanggalLahir) {
        super(nama, tempatLahir, tanggalLahir);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
}
