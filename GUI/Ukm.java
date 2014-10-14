/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HP
 */
public class Ukm {
    public static final int MaxAnggota = 20;
    private String namaUnit;
    private Mahasiswa sekretaris;
    private Mahasiswa ketua;
    private Penduduk[] anggota;
    private int jumlahAnggota;

    public Penduduk[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Mahasiswa[] anggota) {
        this.anggota = anggota;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }

    public Ukm() {
    }

    public Ukm(String dataNamaUnit) {
        this.namaUnit = dataNamaUnit;
        this.jumlahAnggota = 0;
        anggota = new Penduduk[MaxAnggota];
    }

    public Penduduk getAnggota(int urutan) {
        return anggota[urutan];
    }

    public void setAnggota(Penduduk anggota) {
        this.anggota[jumlahAnggota] = anggota;
        this.jumlahAnggota++;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }
    
}
