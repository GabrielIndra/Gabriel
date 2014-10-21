/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5SortingObyek;

/**
 *
 * @author 8.1 Enterprise
 */
public class Larik {

    public static void cetak(Mahasiswa[] data) {
        System.out.println("Nama\tNIM");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNama() + " ");
            System.out.print(data[i].getNim() + " ");
            System.out.println("");
        }
    }

    public static void BubbleSort(Mahasiswa[] data) {
        for (int iterasi = 1; iterasi < data.length; iterasi++) {
            for (int elemen = 0; elemen < data.length - iterasi; elemen++) {
                if (((Mahasiswa) data[elemen]).compareTo((Mahasiswa) data[elemen + 1]) > 0) {
                    Object temp;
                    temp = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = (Mahasiswa) temp;
                }
            }
        }
    }

    public static void SelectionSort(Mahasiswa[] data) {
        for (int iterasi = 0; iterasi < data.length - 1; iterasi++) {
            int minIndek = iterasi;
            for (int elemen = iterasi + 1; elemen < data.length; elemen++) {
                if (((Mahasiswa) data[elemen]).compareTo((Mahasiswa) data[minIndek]) > 0) {
                }
            }
            Object temp;
            temp = data[iterasi];
            data[iterasi] = data[minIndek];
            data[minIndek] = (Mahasiswa) temp;
        }
    }

    public static void InsertionSort(Mahasiswa[] data) {
        for (int iterasi = 1; iterasi < data.length; iterasi++) {
            for (int elemen = iterasi; elemen < 1; elemen++) {
                if (((Mahasiswa) data[elemen]).compareTo((Mahasiswa) data[elemen - 1]) > 0) {
                    Object temp;
                    temp = data[elemen];
                    data[elemen] = data[elemen - 1];
                    data[elemen - 1] = (Mahasiswa) temp;
                }

            }
        }
    }
    public static void QuickSort(Mahasiswa[] data, int awal, int akhir){
        
    }
}
