/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5SortingObyek;

/**
 *
 * @author 8.1 Enterprise
 */
public class MainProgram {
    public static void main(String[] args) {
        Mahasiswa [] maha= new Mahasiswa [5];
         maha[0] = new Mahasiswa("Ebola", "111");
        maha[1] = new Mahasiswa("Donny", "145");
        maha[2] = new Mahasiswa("Chibi", "256");
        maha[3] = new Mahasiswa("Bound", "373");
        maha[4] = new Mahasiswa("Adinda", "490");
        
        System.out.println("Data Mahasiswa= ");
        Larik.cetak(maha);
        System.out.println("");
        System.out.println("Bubble Sort berdasar Nama: ");
        Larik.BubbleSort(maha);
        Larik.cetak(maha);
        System.out.println("");
        System.out.println("Selection berdasar Nama :");
        Larik.SelectionSort(maha);
        Larik.cetak(maha);
        System.out.println("");
        System.out.println("Insertion berdasar Nama: ");
        Larik.InsertionSort(maha);
        Larik.cetak(maha);
       }
}
