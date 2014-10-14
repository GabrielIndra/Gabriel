/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HP
 */
public abstract class Penduduk {
    
    public String nama;
    public String TTL;
    public String getNama() {
        return nama;}
    public void setNama(String nama) {
        this.nama = nama;}
    public String getTTL() {
        return TTL;}
    public void setTTL(String TTL) {
        this.TTL = TTL;}
    public Penduduk(){}
    public Penduduk (String dataNama, String dataTTL){
        this.nama=dataNama;
        this.TTL=dataTTL;}
     abstract double HitungIuran();
}
