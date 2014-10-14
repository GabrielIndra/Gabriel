/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.GUI135314075.modul5;

import java.awt.FlowLayout;
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
    
    PerusahaanList perusahaan;
    JFrame frame;
    JMenuBar menuBar;
    JMenu pekerjaMenu;
    JMenu helpMenu;
    JMenuItem editPekerjaMenuItem;
    JMenuItem exitMenuItem;
    

    public FrameUtama() {
        setLayout(new FlowLayout());

        menuBar= new JMenuBar();
        setJMenuBar(menuBar);
        
        pekerjaMenu= new JMenu("Pekerja");
        add(pekerjaMenu);
        menuBar.add(pekerjaMenu);
        
        helpMenu=new JMenu("Help");
        add(helpMenu);
        menuBar.add(helpMenu);
        
        editPekerjaMenuItem= new JMenuItem("Edit Pekerja");
        pekerjaMenu.add(editPekerjaMenuItem);
        editPekerjaMenuItem.addActionListener(this);
        
        exitMenuItem = new JMenuItem("Exit");
        pekerjaMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(this);
        
        setVisible(true);
        setSize(400, 400);
        setTitle("PT XYZ");
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
          System.exit(0);
      }
      else if(e.getSource()==editPekerjaMenuItem){
          DialogPekerja dp= new DialogPekerja(this, true);
      }
      
      
    }
}
