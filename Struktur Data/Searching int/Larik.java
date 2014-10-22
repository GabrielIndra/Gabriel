package ModulIII;

import java.util.Arrays;

/**
 *
 * @author 8.1 Enterprise
 */
public class Larik {

    public static void cetak(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("\t" + data[i]);
        }
        System.out.println(" ");
    }

    public static int SecuantialSearch(int[] data, int cari) {
        int counter;
        for (counter = 0; counter < data.length; counter++) {
            if (data[counter] == cari) {
                return counter;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] data, int cari) {
        int IndekAwal;
        int IndekAkhir;
        int IndekTengah;

        IndekAwal = 0;
        IndekAkhir = data.length - 1;

        while (IndekAwal <= IndekAkhir) {
            IndekTengah = (IndekAwal + IndekAkhir) / 2;
            //System.out.println(IndekTengah);    
            if (cari == data[IndekTengah]) {
                return IndekTengah;
            } else if (cari < data[IndekTengah]) {
                IndekAkhir = IndekTengah - 1;
            } else {
                IndekAwal = IndekTengah + 1;
            }
        }
        return -1;//menandakan bahwa hasilnya benar. 
    }

    public static int interpolasiSort(int[] data, int cari) {
        Arrays.sort(data);
        int IndekAwal;
        int IndekAkhir;
        int IndekTengah;

        IndekAwal = 0;
        IndekAkhir = data.length - 1;

        while (IndekAwal <= IndekAkhir) {
            IndekTengah = (IndekAwal + ((cari - data[IndekAwal]) * (IndekAkhir - IndekAwal))
                    / (data[IndekAkhir] - data[IndekAwal]));

            if (cari == data[IndekTengah]) {
                return IndekTengah;
            } else if (cari < data[IndekTengah]) {
                IndekAkhir = IndekTengah - 1;
            } else {
                IndekAwal = IndekTengah + 1;
            }
        }
        return -1;
    }

    public static double hitungrerata(int[] data) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }

    public static void nilai(int[] data) {
        int max = data[0], min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            } else if (data[i] < min) {

                min = data[i];
            }
        }
        System.out.println("Terbesar= " + max);
        System.out.println("Terkecil= " + min);
    }
}
