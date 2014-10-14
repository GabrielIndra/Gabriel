/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Windows extends JFrame implements ActionListener {

    //JFrame frame;
    JMenu gameMenu;
    JMenuBar menuBar;
    JMenu helpMenu;
    JMenuItem exitMenuItem;
    JMenu settingMenu;
    JLabel helloLabel;
    JTextField HelloTextField;
    JButton okButton;
    
    public Windows() {

        setLayout(new FlowLayout());

        //inisiasi menubar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //inisialisasi game menu
        gameMenu = new JMenu("Game");
        add(gameMenu);
        menuBar.add(gameMenu);
        
        helpMenu = new JMenu("Help");
        add(helpMenu);
        menuBar.add(helpMenu);
        
        settingMenu = new JMenu("Setting");
        gameMenu.add(settingMenu);
        //insialisasi exit menu item

        exitMenuItem = new JMenuItem("Exit");
        gameMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             System.exit(0);
            }
        });
               
        helloLabel = new JLabel("Hello");
        //helloLabel.setLocation(10, 20);
        add(helloLabel);
        
        HelloTextField = new JTextField(15);
        //elloTextField.setLocation(10, 50);
        add(HelloTextField);
        HelloTextField.addActionListener(this);//menambah action listener

        okButton = new JButton("OK");
        add(okButton);
        okButton.addActionListener(new OkButtonHandler());
        
        setVisible(true);
        setSize(300, 500);
        setTitle("WindowsKu");
    }
    private class OkButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null, "OKAY");
        }
        
    }
    @Override//menambah method action
    public void actionPerformed(ActionEvent e) {
        //System.exit(0); untuk langsung exit ketika press enter
        JOptionPane.showMessageDialog(null, "hay");
    }
}