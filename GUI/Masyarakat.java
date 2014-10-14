/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HP
 */
public class Masyarakat extends Penduduk{
    private String nim;
    public String getNim() {
        return nim;}
    public void setNim(String nim) {
        this.nim = nim; }
    public Masyarakat(){}
    public Masyarakat(String dataNim,String dataNama,String dataTTL ){
        this.nim=dataNim;
        this.nama= dataNama;
        this.TTL=dataTTL;}
    @Override
    double HitungIuran() {
        return Double.parseDouble(nim)*100;
    }
}
