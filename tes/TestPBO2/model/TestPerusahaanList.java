package TestPBO2.model;
import PBO2.model.Pekerja;
import PBO2.model.PerusahaanList;
/**
 *
 * @author 8.1 Enterprise
 */
public class TestPerusahaanList {
    public static void main(String[] args) {
        PerusahaanList PL=new PerusahaanList();
  
        Pekerja test1 = new Pekerja("Pandu", "Sleman", "20Januari1990", "001", 1);
        Pekerja test2 = new Pekerja("Kris", "Bantul", "5Juni1990", "002", 2);
        Pekerja test3 = new Pekerja("Kaskas", "WestProg", "20Januari1995", "003", 3);
        PL.tambahPekerja(test1);
        PL.tambahPekerja(test2);
        PL.tambahPekerja(test3);
        for (int i = 0; i < PL.getListPekerja().size(); i++) {
            System.out.println("Nama Pekerja ke"+(i+1)+ " = "+PL.getListPekerja().get(i).getNama());    
            System.out.println("NIP \t\t = "+PL.getListPekerja().get(i).getNip());
            System.out.println("Asal pekerja \t = "+PL.getListPekerja().get(i).getTempatLahir());
            System.out.println(" ");
        }
        System.out.println("Gaji total pekerja= "+PL.totalGaji());
        System.out.println(PL.constain(test1));
        System.out.println(PL.constain(test2));
        PL.hapusPekerja(test3);
        for (int i = 0; i < PL.getListPekerja().size(); i++) {
            System.out.println(PL.getListPekerja().get(i).getNama());
        }
    }
}