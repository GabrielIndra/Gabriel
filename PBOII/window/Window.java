/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Window {
    private JFrame frame;
    private JMenuBar menubar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem exitMenuItem;
    private JLabel sisiLabel;
    private JTextField sisiTextField;
    private JButton OkButton;
    
    public Window(){
        frame = new JFrame();
        frame.setLayout(null);
        
        menubar= new JMenuBar();
        frame.setJMenuBar(menubar);
        
        fileMenu= new JMenu("File");
        menubar.add(fileMenu);
        
        helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        
        sisiLabel= new JLabel("Sisi");
        sisiLabel.setBounds(10, 20, 40, 20);
        frame.add(sisiLabel);
        
        sisiTextField= new JTextField(15);
        sisiTextField.setBounds(70, 20, 200, 20);
        frame.add(sisiTextField);
        
        OkButton = new JButton("OK");
        OkButton.setBounds(70, 50, 100, 30);
        frame.add(OkButton);
        
        frame.setVisible(true);
        frame.setSize(300, 500);
        frame.setTitle("Windowsku ");
    }
}
