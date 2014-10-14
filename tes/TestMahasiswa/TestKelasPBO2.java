/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMahasiswa;

import Mahasiswa.KelasPBOII;
import Mahasiswa.Mahasiswa;
import Mahasiswa.Nilai;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestKelasPBO2 {

    public static void main(String[] args) {
        KelasPBOII test = new KelasPBOII();
        Mahasiswa test1 = new Mahasiswa("Suminten", "12344", "Selemania", "1 Suro");
        Mahasiswa test2 = new Mahasiswa("Sumijo", "12344", "Selemania", "1 Suro");
        Mahasiswa test3 = new Mahasiswa("Samijem", "12344", "Selemania", "1 Suro");
        Nilai biji1 = new Nilai(100, 70, test1);
        Nilai biji2 = new Nilai(60, 90, test2);
        Nilai biji3 = new Nilai(80, 100, test3);

        test.tambahMahasiswa(test1, biji1);
        test.tambahMahasiswa(test2, biji2);
        test.tambahMahasiswa(test3, biji3);

        for (int i = 0; i < test.getListMahasiswa().size(); i++) {
            System.out.println("Nama= " + test.getListMahasiswa().get(i).getNama());
            System.out.println("UTS= " + test.getListNilai().get(i).getUTS());
            System.out.println("UAS= " + test.getListNilai().get(i).getUAS());
            
            System.out.println(" ");

        }
        System.out.println("Rerata nilai= " + test.rerataNilai(test1, biji1));
        System.out.println("Rerata nilai= " + test.rerataNilai(test2, biji2));
        System.out.println("Rerata nilai= " + test.rerataNilai(test3, biji3));
        System.out.println("");
        test.constains(test1);
        test.constains(test2);
        test.hapusMahasiswa(test3);

        for (int i = 0; i < test.getListMahasiswa().size(); i++) {
            System.out.println(test.getListMahasiswa().get(i).getNama());
        }
    }
}
