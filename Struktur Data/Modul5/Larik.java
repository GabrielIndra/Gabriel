/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author 8.1 Enterprise
 */
public class Larik {

    public static void cetak(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
            System.out.print("");
        }
    }

    public static void BubbleSort(int[] n) {
        System.out.println("Bubble Sort: ");
        for (int iterasi = 1; iterasi < n.length; iterasi++) {
            for (int elemen = 0; elemen < n.length - iterasi; elemen++) {
                if (n[elemen] > n[elemen + 1]) {
                    int temp; //temporary
                    temp = n[elemen];
                    n[elemen] = n[elemen + 1];
                    n[elemen + 1] = temp;
                }
            }
        }
    }
    //        Algoritma buble sort
//	Algoritma ini digunakan untuk mengurutkan data dengan metode bubble sort.
//	Masukan berupa kumpulan data dalam larik.
//	Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
//Langkah 0	: Baca data ke dalam larik 
//Langkah 1	: Untuk iterasi = 1 sampai N-1 lakukan langkah 2 
//Langkah 2	: Untuk elemen = 0 sampai N-1-iterasi lakukan langkah 3
//Langkah 3	: Test apakah larik[elemen] > larik[elemen + 1]
//		  	   Jika ya, tukarkan nilai kedua elemen ini

    public static void SelectionSort(int[] n) {
        System.out.println("Selection Sort: ");
        for (int iterasi = 0; iterasi < n.length - 1; iterasi++) {
            int minIndek = iterasi;
            for (int elemen = iterasi + 1; elemen < n.length; elemen++) {
                if (n[elemen] < n[minIndek]) {
                    minIndek = elemen;
                }
            }
            int temp;
            temp = n[iterasi];
            n[iterasi] = n[minIndek];
            n[minIndek] = temp;
        }
    }
//        Algoritma selection sort
//	Algoritma ini digunakan untuk mengurutkan data dengan metode selection sort.
//	Masukan berupa kumpulan data dalam larik.
//	Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
//Langkah 0	: Baca data ke dalam larik 
//Langkah 1	: Untuk iterasi = 0 sampai N-2 lakukan langkah 2 sampai 5 
//Langkah 2	: Tentukan minIndex = iterasi; 
//Langkah 3	: Untuk elemen = iterasi + 1 sampai N-1 lakukan langkah 4
//Langkah 4	: Test apakah larik[elemen] < larik[minIndex ]
//		  	   Jika ya, minIndex = elemen
//Langkah 5	: Tukarkan nilai larik[iterasi] dengan larik[minIndex]

    public static void InsertionSort(int[] n) {
        System.out.println("Insertion Sort: ");
        for (int iterasi = 1; iterasi < n.length; iterasi++) {
            for (int elemen = iterasi; elemen <= 1; elemen++) {
                if (n[elemen] < n[elemen - 1]) {
                    int temp;
                    temp = n[elemen];
                    n[elemen] = n[elemen - 1];
                    n[elemen - 1] = temp;
                }
            }
        }
    }
    //        Algoritma insertion sort
//	Algoritma ini digunakan untuk mengurutkan data dengan metode insertion sort.
//	Masukan berupa kumpulan data dalam larik.
//	Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
//Langkah 0	: Baca data ke dalam larik 
//Langkah 1	: Untuk iterasi = 1 sampai N-1 lakukan langkah 2
//Langkah 2	: Untuk elemen = iterasi sampai 1 lakukan langkah 3
//Langkah 3	: Test apakah larik[elemen] < larik[elemen-1]
//		  	  Jika ya, tukarkan nilai larik[elemen] dengan larik[elemen-1]
}
