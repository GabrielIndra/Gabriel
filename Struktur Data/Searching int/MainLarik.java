package ModulIII;
/**
 *
 * @author 8.1 Enterprise
 */
public class MainLarik {
    public static void main(String[] args) {
        int[] data = {200, 100, 70, 31, 29, 4, 17, 19, 45}; //langkah 0

        System.out.println("PENCARIAN SEQUENTIAL SEARCH");
        Larik.cetak(data);
        int kunci = 29; // langkah 1
        int a;
        a = Larik.SecuantialSearch(data, kunci);
        if (a >= 0) {
            System.out.println("Data " + kunci + " ditemukan di indeks ke:" + a);
        } else {
            System.out.println("Data " + kunci + " tidak ditemukan");
        }
        
        System.out.println("");
        
        System.out.println("PENCARIAN BINARY SEARCH");
        int[] data1 = {4, 17, 19, 29, 31, 45, 100, 200};
        Larik.cetak(data1);
        int cari = 100;
        a = Larik.BinarySearch(data1, cari);
        if (a >= 0) {
            System.out.println("Data " + cari + " ditemukan di indeks ke:" + a);
            
        } 
        else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
        System.out.println("");

        System.out.println("Pencarian Interpolation");

        int[] data2 = {35, 15, 60, 5, 75, 70, 40, 55, 50, 65, 25};
        Larik.cetak(data2);
        int golek = 65;
        a = Larik.interpolasiSort(data2, golek);

        if (a >= 0) {
            System.out.println("Data " + golek + " Ditemukan di indek ke " + a);
        } else {
            System.out.println("Data " + golek + " Tidak ketemu");
        }

        System.out.println(" ");
        System.out.println("Rata-rata " + Larik.hitungrerata(data) / data.length);
        System.out.println("Rata-rata " + Larik.hitungrerata(data1) / data1.length);
        Larik.nilai(data);

    }
}
