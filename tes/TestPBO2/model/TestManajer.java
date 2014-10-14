package TestPBO2.model;

import PBO2.model.Manajer;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestManajer {
    public static void main(String[] args) {
        Manajer test= new Manajer("Pandu", "Sleman", "20Januari1990", "001", 4, 2);
        
        System.out.println("Manager= "+test.getNama());
        System.out.println("Tempat lahir= "+test.getTempatLahir());
        System.out.println("Tanggal lahir= "+test.getTanggalLahir());
        System.out.println("Nip= "+test.getNip());
        System.out.println("Golongan= "+test.getGolongan());
        System.out.println("Eselon= "+test.getEselon());
        System.out.println("Gaji= "+test.GajiManager());
    
    }
}
