package PBO2.model;

import java.util.ArrayList;

/**
 *
 * @author 8.1 Enterprise
 */
public class PerusahaanList {

    private ArrayList<Pekerja> ListPekerja = new ArrayList<Pekerja>();

    public void tambahPekerja(Pekerja pekerja) {
        ListPekerja.add(pekerja);
    }

    public ArrayList<Pekerja> getListPekerja() {
        return ListPekerja;
    }

    public void setListPekerja(ArrayList<Pekerja> ListPekerja) {
        this.ListPekerja = ListPekerja;
    }

    public int totalGaji() {
        int total = 0;
        for (int i = 0; i < getListPekerja().size(); i++) {
            total = total + ListPekerja.get(i).Gaji();
        }
        return total;
    }

    public void hapusPekerja(Pekerja pekerja) {
        if (constain(pekerja)) {
            ListPekerja.remove(pekerja);
            System.out.println("Sudah diremove");
        } else {
            System.out.println("Pekerja tidak ada dalam daftar");
        }

    }

    public boolean constain(Pekerja pekerja) {
        if (ListPekerja.isEmpty()) {
            return false;
        } else {
            return ListPekerja.contains(pekerja);
        }
    }
}