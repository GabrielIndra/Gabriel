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

/**
 *
 * @author 8.1 Enterprise
 */
public class Soal5 extends JFrame implements ActionListener {

    private JButton clickButton;
    private JLabel counterLAbel;
    private int numberOfClik;
    
    public Soal5(){
        clickButton= new JButton("I'm Swing Button");
        counterLAbel= new JLabel("Number of button click");
        numberOfClik=0;
        this.setLayout(new FlowLayout());
        this.add(clickButton);
        this.add(counterLAbel);
        this.setTitle("Swing");
        this.setSize(300, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public int getNumberOfClick(){
        return numberOfClik;
    }
    public void setNumberOfClick(int number){
        this.numberOfClik = number;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getActionCommand().equals("I'm Swing Button")){
         numberOfClik++;
         counterLAbel.setText(" number of button click "+numberOfClik);
     }
     
    }
    
}
