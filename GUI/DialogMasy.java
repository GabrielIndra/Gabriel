/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class DialogMasy extends JDialog {

    Container paneDialog;

    public DialogMasy() {
        setSize(400, 200);
        setLocation(100, 100);
        paneDialog = getContentPane();
        paneDialog.setLayout(new GridLayout(4, 3));


        addComponent();
    }

    DialogMasy(String tambah_Masyarakat) {
    }

    public void addComponent() {

        JLabel label1 = new JLabel("Nama ");
        label1.setFont(new Font("Serif", Font.BOLD, 18));
        paneDialog.add(label1);
        final JTextField text1 = new JTextField(4);
        paneDialog.add(text1);

        JLabel label2 = new JLabel("NIP ");
        label2.setFont(new Font("Serif", Font.BOLD, 18));
        paneDialog.add(label2);
        final JTextField text2 = new JTextField(4);
        paneDialog.add(text2);

        JLabel label3 = new JLabel("TTL ");
        label3.setFont(new Font("Serif", Font.BOLD, 18));
        paneDialog.add(label3);
        final JTextField text3 = new JTextField(4);
        paneDialog.add(text3);

        JButton jpl1 = new JButton("Restar");
        JButton jpl2 = new JButton("Simpan");
        paneDialog.add(jpl1);
        paneDialog.add(jpl2);

        jpl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = text1.getText();
                String nip = text2.getText();
                String ttl = text3.getText();

                JOptionPane.showMessageDialog(null, "Welcome To Add Masyarakat\nNama :" + nama + "\nNim :" + nip + "\nTanggal Lahir : " + ttl);
            }
        });

        jpl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                text1.setText(null);
                text2.setText(null);
                text3.setText(null);
            }
        });

    }
}
