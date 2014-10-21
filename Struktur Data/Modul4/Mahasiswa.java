package Modul4;

/**
 *
 * @author 8.1 Enterprise
 */
public class Mahasiswa implements Comparable<Object>{
    private int nim;
    private String nama;
    private String nilaiMahasiswa;

    public Mahasiswa(){
        
    }
    public Mahasiswa(String nama, int nim, String nilaiMahasiswa) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }
    public void setNilaiMahasiswa(String nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }
    @Override
    public int compareTo(Object o) {
          if (nim==((Mahasiswa)o).nim) {
            return 0;
        }
        else if(nim > ((Mahasiswa)o).nim){
            return 1;
        }
        else{
            return -1;
        }
    }
 
}
