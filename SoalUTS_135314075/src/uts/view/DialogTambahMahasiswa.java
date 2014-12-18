/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import uts.model.Mahasiswa;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogTambahMahasiswa extends JDialog {

    JLabel namaLabel, nimLabel, prodiLabel;
    JTextField namaText, nimText, prodiText;
    JButton simpan;
    private final FrameUtama owner;

    public DialogTambahMahasiswa(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.setSize(400, 400);
        this.setLocation(250, 250);
        this.setTitle("Form Tambah Mahasiswa");
        this.getContentPane().setLayout(null);

        nimLabel = new JLabel("NIM");
        this.getContentPane().add(nimLabel);
        nimLabel.setBounds(20, 50, 100, 20);

        nimText = new JTextField(15);
        this.getContentPane().add(nimText);
        nimText.setBounds(150, 55, 125, 20);

        namaLabel = new JLabel("Nama");
        this.getContentPane().add(namaLabel);
        namaLabel.setBounds(20, 80, 100, 20);

        namaText = new JTextField(50);
        this.getContentPane().add(namaText);
        namaText.setBounds(150, 80, 200, 20);

        prodiLabel = new JLabel("Prodi");
        this.getContentPane().add(prodiLabel);
        prodiLabel.setBounds(20, 110, 100, 20);

        prodiText = new JTextField(15);
        this.getContentPane().add(prodiText);
        prodiText.setBounds(150, 110, 200, 20);

        simpan = new JButton("Tambah");
        this.getContentPane().add(simpan);
        simpan.setBounds(200, 200, 100, 20);

        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mahasiswa mahasiswa = new Mahasiswa();
                try {
                    JOptionPane.showMessageDialog(null, "Sudah Ditambah");
                    mahasiswa.setNama(namaText.getText());
                    mahasiswa.setNim(nimText.getText());
                    mahasiswa.setProdi(prodiText.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                Mahasiswa.tambahMahasiswa(mahasiswa);
                namaText.setText(" ");
                nimText.setText(" ");
                prodiText.setText(" ");
            }
        });

        this.setVisible(true);
        this.owner = owner;
    }
}
