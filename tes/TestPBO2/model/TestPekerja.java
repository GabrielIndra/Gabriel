package TestPBO2.model;
import PBO2.model.Pekerja;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestPekerja {
    public static void main(String[] args) {
        Pekerja test= new Pekerja("Pandu", "Sleman", "20Januari1990", "001", 1);
        System.out.println("Nama Pekerja= "+test.getNama());
        System.out.println("Tempat lahir= "+test.getTempatLahir());
        System.out.println("Tanggal lahir= "+test.getTanggalLahir());
        System.out.println("Nip pekerja= "+test.getNip());
        System.out.println("Golongan= "+test.getGolongan());
        System.out.println("Gaji= "+test.Gaji());
        System.out.println("");
        
        Pekerja test1= new Pekerja("Ndulek", "Jogja", "15Mei2014", "002", 2);
        System.out.println("Nama Pekerja= "+test1.getNama());
        System.out.println("Tempat lahir= "+test1.getTempatLahir());
        System.out.println("Tanggal lahir= "+test1.getTanggalLahir());
        System.out.println("Nip pekerja= "+test1.getNip());
        System.out.println("Golongan= "+test1.getGolongan());
        System.out.println("Gaji= "+test1.Gaji());  
    }
}
