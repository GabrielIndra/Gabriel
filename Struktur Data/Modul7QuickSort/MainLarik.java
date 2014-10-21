/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7QuickSort;

/**
 *
 * @author 8.1 Enterprise
 */
public class MainLarik {
    public static void main(String[] args) {
         int []n = {23, 45, 75, 89, 76, 22, 100, 1};
        System.out.println("Data sebelum urut= ");
        Larik.cetak(n);
        System.out.println("");
        
        Larik.BubbleSort(n);
        Larik.cetak(n);
        System.out.println("");
        
        Larik.SelectionSort(n);
        Larik.cetak(n);
        System.out.println("");
        
        Larik.InsertionSort(n);
        Larik.cetak(n);
        System.out.println("");
        
        System.out.println("Quick Sort");
        Larik.QuickSort(n, 0, n.length-1);
        Larik.cetak(n);
        System.out.println("");
    }
}
