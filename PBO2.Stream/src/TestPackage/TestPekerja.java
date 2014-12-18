package TestPackage;

import Stream.Pekerja;
import Stream.PerusahaanList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestPekerja {
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Pekerja tes= new Pekerja("Paijo", "002", "Sleman", "2-2-22", 2);
        Pekerja tes1= new Pekerja();
        tes1.setNama("Paijem");
        tes1.setNip("001");
        tes1.setTempatLahir("Bantul");
        tes1.setTanggalLahir("2-2-02");
        tes1.setGolongan(2);
        
        Pekerja tes3 = new Pekerja ("Kris", "008", "Bantul", "8-3-95", 1); 
        
        PerusahaanList.tambahPekerja(tes);
        PerusahaanList.tambahPekerja(tes1);
        PerusahaanList.tambahPekerja(tes3);
        PerusahaanList.simpanFilePekerja();
        PerusahaanList.SimpanFile();
    }
}
