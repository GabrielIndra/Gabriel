/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class DimensiDua extends JDialog implements ActionListener {

    Container containpane;
    JLabel sisiLabel, kelilingLabel, luasLabel1, luasLabel2, alasLabel, tinggiLabel;
    JTextField sisiText, alasText, tinggiText, luasText1, luasText2, kelilingText;
    JButton HitungButton1, HitungButton2, clearButton1, exitButton;
    JPanel panel1, panel2;
    
    public static void main(String[] args) {
        DimensiDua tes= new DimensiDua();
        tes.setVisible(true);
    }

    public DimensiDua() {
        containpane = getContentPane();
        setSize(400, 400);
        setLocation(150, 200);
        setLayout(new GridLayout(1, 2));
        setTitle("Bujur Sangkar dan Segitiga");
        setResizable(false);

        panel1 = new JPanel(new GridLayout(4, 2));

        sisiLabel = new JLabel("Sisi");
        panel1.add(sisiLabel);

        sisiText = new JTextField(15);
        panel1.add(sisiText);

        luasLabel1 = new JLabel("Luas");
        panel1.add(luasLabel1);

        luasText1 = new JTextField();
        panel1.add(luasText1);
        luasText1.setEditable(false);

        kelilingLabel = new JLabel("Keliling");
        panel1.add(kelilingLabel);

        kelilingText = new JTextField();
        panel1.add(kelilingText);
        kelilingText.setEditable(false);

        HitungButton1 = new JButton("Hitung");
        panel1.add(HitungButton1);
        HitungButton1.addActionListener(this);

        panel2 = new JPanel(new GridLayout(4, 2));
        alasLabel = new JLabel("Alas");
        panel2.add(alasLabel);

        alasText = new JTextField(15);
        panel2.add(alasText);

        tinggiLabel = new JLabel("Tinggi");
        panel2.add(tinggiLabel);

        tinggiText = new JTextField(15);
        panel2.add(tinggiText);

        luasLabel2 = new JLabel("Luas");
        panel2.add(luasLabel2);

        luasText2 = new JTextField(15);
        panel2.add(luasText2);
        luasText2.setEditable(false);

        clearButton1 = new JButton("Clear");
        panel1.add(clearButton1);
        clearButton1.addActionListener(this);

        exitButton = new JButton("EXIT");
        panel2.add(exitButton);
        exitButton.addActionListener(this);

        containpane.add(panel1);
        containpane.add(panel2);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
 

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == HitungButton1) {
            String sisiString = sisiText.getText();
            float sisi = Float.parseFloat(sisiString);
            String alasString = alasText.getText();
            String tinggiString = tinggiText.getText();
            float alas = Float.parseFloat(alasString);
            float tinggi = Float.parseFloat(tinggiString);
            float luas1 = sisi * sisi;
            float luas2 = (alas * tinggi) / 2;
            float keliling = 4 * sisi;
            String luas1String = String.valueOf(luas1);
            String luas2String = String.valueOf(luas2);
            String kelilingString = String.valueOf(keliling);
            luasText1.setText(luas1String);
            luasText2.setText(luas2String);
            kelilingText.setText(kelilingString);
        } else if (e.getSource() == clearButton1) {
            sisiText.setText("");
            alasText.setText("");
            tinggiText.setText("");
            luasText1.setText("");
            luasText2.setText("");
            kelilingText.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}
