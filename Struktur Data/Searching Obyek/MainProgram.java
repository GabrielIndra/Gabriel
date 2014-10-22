package Modul4;

import java.util.Arrays;

/**
 *
 * @author 8.1 Enterprise
 */
public class MainProgram {

    public static void main(String[] args) {
        Mahasiswa[] data = new Mahasiswa[5];
        data[0] = new Mahasiswa("Banana", 123, "100");
        data[1] = new Mahasiswa("Split", 133, "90");
        data[2] = new Mahasiswa("Coklat", 120, "50");
        data[3] = new Mahasiswa("Susu", 125, "800");
        data[4] = new Mahasiswa("Mengkal", 223, "20");
        Arrays.sort(data);

        System.out.println("Data mahasiswa");
        System.out.println("Nama\tNIM\tNilai");
        Larik.cetak(data);
        System.out.println(" ");
        System.out.println("Pencarian Sekuensial");
        System.out.println("Nama\tNIM\tNilai");
        Larik.cetak(data);
        Mahasiswa cari = new Mahasiswa();
        cari.setNim(120);

        int hasil = Larik.Sequential(data, cari);
        if (hasil >= 0) {
            System.out.println("NIM yang dicari adalah= " + cari.getNim());
            System.out.println("Nama mahasiswa tersebut adalah= " + data[hasil].getNama());
            System.out.println("Ditemukan di indeks ke " + hasil);
            System.out.println("Nilai mahasiswa tersebut adalah= " + data[hasil].getNilaiMahasiswa());
        } else {
            System.out.println("Tidak ketemu");
        }
        System.out.println(" ");
        System.out.println("Pencarian Binary");
        System.out.println("Nama\tNIM\tNilai");
        Larik.cetak(data);
        cari.setNim(67);
        int hasil2 = Larik.BinarySearch(data, cari);
        if (hasil2 >= 0) {
            System.out.println("NIM yang dicari adalah= " + cari.getNim());
            System.out.println("Nama mahasiswa tersebut adalah= " + data[hasil2].getNama());
            System.out.println("Ditemukan di indeks ke " + hasil2);
            System.out.println("Nilai mahasiswa tersebut adalah= " + data[hasil2].getNilaiMahasiswa());

        } else {
            System.out.println("Nim yang dicari adalah= " + cari.getNim());
            System.out.println("Tidak ketemu");
        }
        System.out.println(" ");

        System.out.println("Pencarian Interpolasi ");
        Larik.cetak(data);
        cari.setNim(100);
        int hasil3 = Larik.Interpolasi(data, cari);
        if (hasil3 >= 0) {
            System.out.println("NIM yang dicari adalah= " + cari.getNim());
            System.out.println("Nama mahasiswa tersebut adalah= " + data[hasil3].getNama());
            System.out.println("Ditemukan di indeks ke " + hasil3);
            System.out.println("Nilai mahasiswa tersebut adalah= " + data[hasil3].getNilaiMahasiswa());
        } else {
            System.out.println("NIM yang dicari adalah= " + cari.getNim());
            System.out.println("Tidak ketemu");
        }
    }
}
