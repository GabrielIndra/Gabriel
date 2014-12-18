/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception2;

/**
 *
 * @author 8.1 Enterprise
 */
public class Penduduk {

    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private int noktp;

    public Penduduk() {
    }

    public Penduduk(String nama, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public int getNoktp() {
        return noktp;
    }

    public void setNoktp(int noktp) {
        this.noktp = noktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
