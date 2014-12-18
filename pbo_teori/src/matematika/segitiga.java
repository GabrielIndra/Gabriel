package matematika;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class segitiga extends JFrame implements ActionListener{
    
    JLabel alasLabel,tinggiLabel,luasMenu, kelilingMenu;
    JTextField alasText,tinggiText, luasText, kelilingText;
    JButton luasButton,kelilingButton;
    public segitiga() {
    
        alasLabel = new JLabel("Alas");
        alasLabel.setBounds(50, 30, 70, 20);
        add(alasLabel);
        
        tinggiLabel = new JLabel("Tinggi");
        tinggiLabel.setBounds(50, 60, 70, 20);
        add(tinggiLabel);
        
        alasText = new JTextField();
        alasText.setBounds(130, 30, 150, 20);
        alasText.addActionListener(this);
        add(alasText);
        
        tinggiText = new JTextField();
        tinggiText.setBounds(130, 60, 150, 20);
        tinggiText.addActionListener(this);
        add(tinggiText);
        
        Font font1 = new Font("Arial Black", Font.PLAIN, 14);
        luasMenu = new JLabel("Luas");
        luasMenu.setBounds(50, 90, 70, 20);
        luasMenu.setFont(font1);
        add(luasMenu);
        
        luasText = new JTextField();
        luasText.setBounds(130, 90, 150, 20);
        luasText.setEnabled(false);
        add(luasText);
     
        luasButton = new JButton("Hitung");
        luasButton.setBounds(140, 140, 100, 30);
        luasButton.addActionListener(this);
        add(luasButton);
        
  this.setSize(400,250);
  this.setTitle("Segitiga");
  this.setLayout(null);
  this.setVisible(true);
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    @Override
    public void actionPerformed(ActionEvent e) {
                String alasString=alasText.getText();
                float alas=Float.parseFloat(alasString);
                String tinggiString=tinggiText.getText();
                float tinggi=Float.parseFloat(tinggiString);
                float luas=alas*tinggi/2;
                String luasString= String.valueOf(luas);
                luasText.setText(luasString);
               
    }
}
