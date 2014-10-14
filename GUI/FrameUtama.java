/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author HP
 */
public class FrameUtama extends JFrame {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int XPOS = 50;
    private static final int YPOS = 50;
    Container contaiPane;
    JMenuBar jmb;
    JMenu mfile;
    JMenu mHelp;
    JMenuItem miAddMhs;
    JMenuItem miAddMasy;
    JMenuItem miAddUKM;
    JMenuItem keluar;

    public FrameUtama(String title) {
        super(title);
        setSize(WIDTH, HEIGHT);
        setLocation(XPOS, XPOS);
        setResizable(true);
        //set menubar
        jmb = new JMenuBar();
        this.setJMenuBar(jmb);
        mfile = new JMenu("FILE");
        jmb.add(mfile);
        miAddMhs = new JMenuItem("Tambah Mahasiswa");
        mfile.add(miAddMhs);
        miAddMasy = new JMenuItem("Tmbah Masyarahat");
        mfile.add(miAddMasy);
        miAddUKM = new JMenuItem("Tambah UKm");
        mfile.add(miAddUKM);
        keluar=new JMenuItem("Keluar");
        mfile.add(keluar);
        
        miAddMhs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               DialogMhs dia=new DialogMhs();
               dia.setVisible(true);
            }
        });
        
        miAddMasy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                DialogMasy log=new DialogMasy();
                log.setVisible(true);
            }
        });
        
        miAddUKM.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                DialogUKM1 UKM=new DialogUKM1();
                UKM.setVisible(true);
            }
        });
        
        keluar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });
        
        setVisible(true);
    }
}
