/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HP
 */
public class Mahasiswa extends Penduduk{
    private String Nim;
    public String getNim() {
        return Nim;}
    public void setNim(String Nim) {
        this.Nim = Nim;}
    public Mahasiswa() { }
    public Mahasiswa(String dataNim, String dataNama, String dataTTl) {
        this.Nim = dataNim;
        this.nama = dataNama;
        this.TTL = dataTTl;}
    @Override
    double HitungIuran() {
        return Double.parseDouble(Nim)/10000;
        
    }
}
