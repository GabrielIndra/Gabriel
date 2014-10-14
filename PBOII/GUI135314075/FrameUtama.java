/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI135314075;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 8.1 Enterprise
 */
public class FrameUtama extends JFrame {

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
        
        exitMenuItem = new JMenuItem("Exit");
        pekerjaMenu.add(exitMenuItem);
        
        setVisible(true);
        setSize(400, 400);
        setTitle("PT XYZ");

    }

}
