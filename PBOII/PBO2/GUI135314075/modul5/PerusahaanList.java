/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.GUI135314075.modul5;

import java.util.ArrayList;

/**
 *
 * @author 8.1 Enterprise
 */
public class PerusahaanList {
    private ArrayList<Pekerja> ListPekerja= new ArrayList<Pekerja>();
    
    public void tambahPekerja(Pekerja pekerja){
        ListPekerja.add(pekerja);
    }
    public ArrayList<Pekerja> getListPekerja() {
        return ListPekerja;
    }
    public void setListPekerja(ArrayList<Pekerja> ListPekerja) {
        this.ListPekerja = ListPekerja;
    }
    
    public int gajiTotal() {
        int total=0;
        for (int i = 0; i <getListPekerja().size() ; i++) {
            total= total+ ListPekerja.get(i).gaji();
        }
        return total;
    }
    }

