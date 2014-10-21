/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7QuickSort;

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
//Langkah 1	: Untuk iterasi = 1 sampai N lakukan langkah 2 
//Langkah 2	: Untuk elemen = 0 sampai N-iterasi lakukan langkah 3
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
//Langkah 2	: Tentukan minInden = iterasi; 
//Langkah 3	: Untuk elemen = iterasi + 1 sampai N-1 lakukan langkah 4
//Langkah 4	: Test apakah larik[elemen] < larik[minInden ]
//		  	   Jika ya, minInden = elemen
//Langkah 5	: Tukarkan nilai larik[iterasi] dengan larik[minInden]

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

    public static void QuickSort(int[] n, int awal, int akhir) {

        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;

            while ((i <= akhir) && (n[i] <= n[awal])) {
                i++;
            }
            while ((j > awal) && (n[j] > n[awal])) {
                j--;
            }

            while (i < j) {
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;

                while ((i <= akhir) && (n[i] <= n[awal])) {
                    i++;
                }
                while ((j > awal) && (n[j] > n[awal])) {
                    j--;
                }
            }

            int temp = n[awal];
            n[awal] = n[j];
            n[j] = temp;

            Larik.QuickSort(n, awal, (j - 1));
            Larik.QuickSort(n, (j + 1), akhir);
        }
    }
}
