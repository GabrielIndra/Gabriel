package TestPackage;

import Stream.PerusahaanList;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestPekerja2{
    public static void main(String[] args) throws Exception {
        PerusahaanList.bacaSimpanFile();
        for (int i = 0; i < PerusahaanList.listPekerja.size(); i++) {
            System.out.println("NIP: "+PerusahaanList.listPekerja.get(i).getNip()+
                    " Nama: "+PerusahaanList.listPekerja.get(i).getNama()+
                    " Tanggal lahir: "+PerusahaanList.listPekerja.get(i).getTanggalLahir()+
                    " Tempat lahir: "+PerusahaanList.listPekerja.get(i).getTempatLahir()+
                    " Golongan: "+PerusahaanList.listPekerja.get(i).getGolongan()+"\n");
        }
        
    }
}
