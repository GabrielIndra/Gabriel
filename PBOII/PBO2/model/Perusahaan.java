package PBO2.model;
public class Perusahaan {
    public static int JUMLAH_MAKSIMAL_PEKERJA=10;
    private Pekerja daftarPekerja[]=new Pekerja[JUMLAH_MAKSIMAL_PEKERJA];
    private int jumlahPekerja=0;
    
    public Perusahaan(){
    }
    public Pekerja[] getDaftarPekerja() {
        return daftarPekerja;
    }
    public void setDaftarPekerja(Pekerja[] daftarPekerja) {
        this.daftarPekerja = daftarPekerja;
    }
    public int getJumlahPekerja() {
        return jumlahPekerja;
    }
    public void setJumlahPekerja(int jumlahPekerja) {
        this.jumlahPekerja = jumlahPekerja;
    }
    public void TambahPekerja(Pekerja pekerja){
        if(jumlahPekerja<JUMLAH_MAKSIMAL_PEKERJA){
            daftarPekerja[jumlahPekerja]=pekerja;
            jumlahPekerja++;
        }
        else{
            System.out.println("Kuota Penuh");
        }
    } 
    
    public int TotalGaji(){
        int total=0;
        
        for (int i = 0; i < getJumlahPekerja(); i++) {
        total= total+daftarPekerja[i].Gaji();    
        }
        return total;
    }
} 