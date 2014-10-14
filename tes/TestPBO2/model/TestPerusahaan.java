package TestPBO2.model;

import PBO2.model.Pekerja;
import PBO2.model.Perusahaan;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPerusahaan {

    public static void main(String[] args) {
        Perusahaan test = new Perusahaan();

        Pekerja test1 = new Pekerja("Pandu", "Sleman", "20Januari1990", "001", 1);
        Pekerja test2 = new Pekerja("Kris", "Bantul", "5Juni1990", "002", 2);
        Pekerja test3 = new Pekerja("Kaskas", "WestProg", "20Januari1995", "003", 3);
        Pekerja test4 = new Pekerja("Ada", "Jogja", "20Mei1987", "004", 4);
        Pekerja test5 = new Pekerja("Guide", "SouthMountain", "5Mei2012", "005", 1);
        Pekerja test6 = new Pekerja("Yes", "Bantulan", "2Januari1993", "006", 3);
        Pekerja test7 = new Pekerja("Yui", "Jateng", "2Agustus1990", "007", 2);
        Pekerja test8 = new Pekerja("Inge", "Grogol", "3Januari1990", "008", 2);
        Pekerja test9 = new Pekerja("Inne", "Jatim", "4Juli1990", "090", 1);
        Pekerja test10 = new Pekerja("Jelis", "Jabar", "5Agustus1990", "010", 4);
        
        test.TambahPekerja(test1);
        test.TambahPekerja(test2);
        test.TambahPekerja(test3);
        test.TambahPekerja(test4);
        test.TambahPekerja(test5);
        
        test.TambahPekerja(test6);
        test.TambahPekerja(test7);
        test.TambahPekerja(test8);
        test.TambahPekerja(test9);
        test.TambahPekerja(test10);

        for (int i = 0; i < test.getJumlahPekerja(); i++) {
            
            System.out.println((i + 1) + "." + "Nama = " + test.getDaftarPekerja()[i].getNama());
            System.out.println("NIP            = " + test.getDaftarPekerja()[i].getNip());
            System.out.println("Tempat Lahir   = " + test.getDaftarPekerja()[i].getTempatLahir());
            System.out.println("Gaji           = " + test.getDaftarPekerja()[i].Gaji());
            System.out.println(" ");
            
        }
        System.out.println("Total gaji= " + test.TotalGaji());
        System.out.println("JUmlah pekerja= "+test.getJumlahPekerja());

    }
}
