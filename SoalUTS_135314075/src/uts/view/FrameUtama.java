/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 8.1 Enterprise
 */
public class FrameUtama extends JFrame implements ActionListener{
JMenuBar menuBar;
JMenu mahasiswaMenu, kelasMenu, sistemMenu;
JMenuItem tambahMhsItem, tambahKelasItem, tambahPesertaKelasItem, exitMenuItem;
    
    public FrameUtama(){
        this.setTitle("Frame Utama");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        mahasiswaMenu = new JMenu("Mahasiswa");
        menuBar.add(mahasiswaMenu);
        
        kelasMenu = new JMenu("Kelas");
        menuBar.add(kelasMenu);
        
        sistemMenu = new JMenu("Sistem");
        menuBar.add(sistemMenu);
        
        tambahMhsItem = new JMenuItem("Tambah Mahasiswa");
        mahasiswaMenu.add(tambahMhsItem);
        
        tambahKelasItem = new JMenuItem("Tambah Kelas");
        kelasMenu.add(tambahKelasItem);
        
        tambahPesertaKelasItem = new JMenuItem("Tambah Peserta Kelas");
        kelasMenu.add(tambahPesertaKelasItem);
        
        exitMenuItem = new JMenuItem("Exit");
        sistemMenu.add(exitMenuItem);
        
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
        tambahMhsItem.addActionListener(this);
        tambahKelasItem.addActionListener(this);
        tambahPesertaKelasItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tambahMhsItem){
            DialogTambahMahasiswa tambahMahasiswa = new DialogTambahMahasiswa(this, true);
        } 
        if(e.getSource() == tambahKelasItem){
            DialogTambahKelas tambahKelas = new DialogTambahKelas(this, true);
        }
        if(e.getSource() == tambahPesertaKelasItem){
            DialogTambahPeserta tambahPeserta = new DialogTambahPeserta(this, true); 
        }
        if(e.getSource() == exitMenuItem){
            System.exit(0);
        }
    }
    
    
}
