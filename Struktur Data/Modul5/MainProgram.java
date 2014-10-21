/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author 8.1 Enterprise
 */
public class MainProgram {
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
    }
}
