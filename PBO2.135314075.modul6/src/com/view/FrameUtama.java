package com.view;

import com.model.PerusahaanList;
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
class FrameUtama extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu pekerjaMenu, helpMenu;
    JMenuItem editPekerjaMenuItem;
    JMenuItem exitMenuItem;
    PerusahaanList perusahaan;
    public FrameUtama() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        pekerjaMenu = new JMenu("Pekerja");
        menuBar.add(pekerjaMenu);

        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        editPekerjaMenuItem = new JMenuItem("Edit Pekerja");
        pekerjaMenu.add(editPekerjaMenuItem);
        editPekerjaMenuItem.addActionListener(this);

        exitMenuItem = new JMenuItem("Exit");
        pekerjaMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(this);

        setSize(400, 400);
        setTitle("PT XYZ");
        setLayout(null);
        setVisible(true);
        perusahaan = new PerusahaanList();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public PerusahaanList getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(PerusahaanList perusahaan) {
        this.perusahaan = perusahaan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitMenuItem){
          System.exit(0);}
      else if(e.getSource()==editPekerjaMenuItem){
         DialogPekerja dp = new DialogPekerja(this, true);
    }
}

}
