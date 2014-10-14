/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Matematika extends JFrame implements ActionListener {

    JLabel panjangLabel;
    JLabel luasLabel;
    JLabel kelilingLabel;
    JTextField panjangtext;
    JTextField luasField;
    JTextField kelilingField;
    JButton OkButton;

    public Matematika() {

        setLayout(null);
        setSize(400, 400);
        setTitle("Matematikaku");

        panjangLabel = new JLabel("Panjang Sisi");
        add(panjangLabel);
        panjangLabel.setBounds(20, 20, 100, 20);

        panjangtext = new JTextField(15);
        add(panjangtext);
        panjangtext.setBounds(150, 25, 125, 20);

        panjangtext.addActionListener(this); 
        
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String sisiString = panjangtext.getText();
//                float sisi = Float.parseFloat(sisiString);
//                float luas = sisi * sisi;
//                float keliling = 4 * sisi;
//                String luasString = String.valueOf(luas);
//                String kelilingString = String.valueOf(keliling);
//                luasField.setText(luasString);
//                kelilingField.setText(kelilingString);
//            }
//        });

        luasLabel = new JLabel("Luas");
        add(luasLabel);
        luasLabel.setBounds(20, 50, 150, 20);
        luasLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 8));

        luasField = new JTextField();
        add(luasField);
        luasField.setBounds(150, 50, 125, 20);
        luasField.setEditable(false);

        kelilingLabel = new JLabel("Keliling");
        add(kelilingLabel);
        kelilingLabel.setBounds(20, 80, 100, 20);
        kelilingLabel.setFont(new Font("Comic Sans MS", 10, 12));

        kelilingField = new JTextField();
        add(kelilingField);
        kelilingField.setBounds(150, 75, 125, 20);
        kelilingField.setEditable(false);

        OkButton = new JButton("Hitung");
        add(OkButton);
        OkButton.setBounds(150, 150, 100, 20);
        OkButton.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                String sisiString = panjangtext.getText();
                float sisi = Float.parseFloat(sisiString);
                float luas = sisi * sisi;
                float keliling = 4 * sisi;
                String luasString = String.valueOf(luas);
                String kelilingString = String.valueOf(keliling);
                luasField.setText(luasString);
                kelilingField.setText(kelilingString);
            }
        });

        OkButton = new JButton("OK");
        add(OkButton);
        OkButton.setBounds(150, 120, 100, 20);
        OkButton.addActionListener(new OkButtonHandler());

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private class OkButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);

        }
    }
}
