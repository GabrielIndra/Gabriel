package Modul4;

/**
 *
 * @author 8.1 Enterprise
 */
public class Larik {

    public static void cetak(Mahasiswa[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNama() + "\t");
            System.out.print(data[i].getNim() + "\t");
            System.out.print(data[i].getNilaiMahasiswa() + "\t");
            System.out.println(" ");
        }
    }
    public static int Sequential(Mahasiswa[] data, Mahasiswa cari) {
        for (int i = 0; i < data.length; i++) {
            if (((Comparable) data[i]).compareTo(cari) == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearch(Mahasiswa[] data, Mahasiswa cari) {
        int IndekAwal = 0;
        int IndekTengah;
        int IndekAkhir = data.length - 1;

        while (IndekAwal <= IndekAkhir) {
            IndekTengah = (IndekAwal + IndekAkhir) / 2;
            if (((Comparable) data[IndekTengah]).compareTo(cari) == 0) {
                return IndekTengah;
            } else if (((Comparable) data[IndekTengah]).compareTo(cari) > 0) {
                IndekAkhir = IndekTengah - 1;
            } else {
                IndekAwal = IndekTengah + 1;
            }
        }
        return -1;
    }
        public static int Interpolasi(Mahasiswa[] data, Mahasiswa cari) {
        int IndekAwal = 0;
        int IndekTengah;
        int IndekAkhir = data.length - 1;

        while (IndekAwal <= IndekAkhir) {
          
          IndekTengah = IndekAwal
                    + (((Mahasiswa) cari).getNim() - ((Mahasiswa) data[IndekAwal]).getNim())
                    * (IndekAkhir - IndekAwal)
                    / (((Mahasiswa) data[IndekAkhir]).getNim() - ((Mahasiswa) data[IndekAwal]).getNim());
            
            if (((Mahasiswa) data[IndekTengah]).compareTo(cari) == 0) {
                return IndekTengah;
            } else if (((Mahasiswa) data[IndekTengah]).compareTo(cari) > 0) {
                IndekAkhir = IndekTengah - 1;
            } else if (((Mahasiswa) data[IndekTengah]).compareTo(cari) < 0) {
                IndekAwal = IndekTengah + 1;
            }

        }
        return -1;
    }
}
