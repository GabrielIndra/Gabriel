/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 8.1 Enterprise
 */
public class FrameUtama extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuPublikasi, menuAnggota;
    private JMenuItem menuTambahPublikasi, menuTambahAnggota;

    public FrameUtama() {
        inisialisai();
    }

    public void inisialisai() {
        menuBar = new JMenuBar();
        menuPublikasi = new JMenu("Publikasi");
        menuAnggota = new JMenu("Anggota");
        menuTambahPublikasi = new JMenuItem("Tambah Publikasi");
        menuTambahAnggota = new JMenuItem("Tambah Anggota");
        menuPublikasi.add(menuTambahPublikasi);
        menuAnggota.add(menuTambahAnggota);
        menuBar.add(menuPublikasi);
        menuBar.add(menuAnggota);
        
        menuPublikasi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
         tambahPublikasiAction();
            }
            
            public void tambahPublikasiAction(){
               //PanelTambahPublikasi panelTambahPublikasi= new PanelTambahPulikasi();
               
                
            }
        });
    }

    private static class PanelTambahPublikasi {

        public PanelTambahPublikasi() {
        }
    }
}
