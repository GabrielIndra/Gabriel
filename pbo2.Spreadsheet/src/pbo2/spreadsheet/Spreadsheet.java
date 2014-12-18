/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.spreadsheet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class Spreadsheet extends JFrame{
    
 JLabel label1 , label2, label3,label4,label5;
 JLabel labelA, labelB, labelC,labelD,labelE;
 JTextField text1a,text1b,text1c,text1d,text1e;
 JTextField text2a,text2b,text2c,text2d,text2e;
 JTextField text3a,text3b,text3c,text3d,text3e;
 JTextField text4a,text4b,text4c,text4d,text4e;
 JTextField text5a,text5b,text5c,text5d,text5e;

    public Spreadsheet() {
        
        
        label1 = new JLabel("1");
        add(label1);
        label1.setBounds(10, 30, 20, 10);
        
        label2 = new JLabel("2");
        add(label2);
        label2.setBounds(10, 80, 20, 10);
        
        label3 = new JLabel("3");
        add(label3);
        label3.setBounds(10, 130, 20, 10);
        
        label4 = new JLabel("4");
        add(label4);
        label4.setBounds(10, 180, 20, 10);
        
        label5 = new JLabel("5");
        add(label5);
        label5.setBounds(10, 230, 20, 10);
        
        
        labelA = new JLabel("A");
        add(labelA);
        labelA.setBounds(30, 10, 20, 10);
        
        labelB = new JLabel("B");
        add(labelB);
        labelB.setBounds(80, 10, 20, 10);
        
        labelC = new JLabel("C");
        add(labelC);
        labelC.setBounds(130, 10, 20, 10);
        
        labelD = new JLabel("D");
        add(labelD);
        labelD.setBounds(180, 10, 20, 10);
        
        setVisible(true);
        setSize(400, 400);
        setTitle("Spreadsheet");
        
    }
 
 
}
