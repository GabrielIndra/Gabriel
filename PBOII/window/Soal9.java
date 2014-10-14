/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Soal9 extends JFrame{
    private JLabel lengthLabel;
    private JTextField lengthField;
    private JLabel widthLabel;
    private JTextField widthField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private GridLayout layout;
    
    public Soal9(){
        super("Simple GUI");
        layout= new GridLayout(3, 2);
        this.setLayout(layout);
        
        lengthLabel= new JLabel("Length");
        lengthField= new JTextField(15);
        widthLabel= new JLabel("Width");
        widthField= new JTextField(15);
        calculateButton= new JButton("Calculate");
        resultLabel= new JLabel("Result: ");
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(calculateButton);
        add(resultLabel);
        
        
    }
}
