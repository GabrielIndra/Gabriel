/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Sidomuncul {
    JFrame frame;
    JLabel helloLabel;
    JLabel golLabel;
    JTextField HelloTextField;
    JTextField golonganTextField;
    
    JButton okButton;
    
    public Sidomuncul(){
    frame =new JFrame();
    frame.setLayout(null);
    
    helloLabel = new JLabel("NAMA");
        //helloLabel.setLocation(10, 20);
        frame.add(helloLabel);
        helloLabel.setBounds(20, 20, 100, 20);
        
        HelloTextField = new JTextField(15);
        //HelloTextField.setLocation(10, 50);
        frame.add(HelloTextField);
        HelloTextField.setBounds(124, 25, 100, 15);
        
        golLabel = new JLabel("Golongan");
        //golLabel.setLocation(10, 20);
        frame.add(golLabel);
        golLabel.setBounds(20, 50, 100, 20);
        
        golonganTextField= new JTextField(15);
        frame.add(golonganTextField);
        golonganTextField.setBounds(124, 50, 100, 20);
        

        okButton =new JButton("OK");
        frame.add(okButton);
        okButton.setBounds(100, 200, 100, 20);
        
       frame.setVisible(true);
       frame.setSize(300, 500);
       frame.setTitle("PT SIDOMUNCUL");
}
}
