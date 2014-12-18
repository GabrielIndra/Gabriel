package JDBC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class EmployeesGUI extends JFrame implements ActionListener {

    private JPanel namaPanel;
    private JTextField namaField;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    JPanel pa;
    
    public EmployeesGUI() {
        setBounds(135, 250, 705, 455);
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menuItem = new JMenuItem("Tabel");
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(menuItem);
        menuItem.addActionListener(this);
        
        JMenuItem koneksi = new JMenuItem("koneksi");
        menu.add(koneksi);
        koneksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataHandler cek = new DataHandler();
                JOptionPane.showMessageDialog(null, cek.getDBConnnection());
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem) {
            JIFEmp em = new JIFEmp("Test2");
            add(em);
            em.setClosable(true);
            em.setSize(250, 250);
            em.setVisible(true);
         }
    }
    
    public static void main(String[] args) {
        EmployeesGUI gu = new EmployeesGUI();
        gu.setVisible(true);
    }
}
