package com.view;

import com.model.Pekerja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogPekerja extends JDialog{

    JLabel namaLabel, tempatLahirLabel, tanggalLahirLabel, nipLabel, golonganLabel;
    JTextField namaText, tempatText, tanggalText, nipText;
    JButton SimpanButton;
    JComboBox golonganBox;
    private final FrameUtama owner;

    public DialogPekerja(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.owner = owner;

        namaLabel = new JLabel("Nama");
        add(namaLabel);
        namaLabel.setBounds(20, 20, 100, 20);

        namaText = new JTextField(15);
        add(namaText);
        namaText.setBounds(150, 25, 100, 20);

        tempatLahirLabel = new JLabel("Tempat Lahir");
        add(tempatLahirLabel);
        tempatLahirLabel.setBounds(20, 50, 100, 20);

        tempatText = new JTextField(15);
        add(tempatText);
        tempatText.setBounds(150, 55, 100, 20);

        tanggalLahirLabel = new JLabel("Tanggal Lahir");
        add(tanggalLahirLabel);
        tanggalLahirLabel.setBounds(20, 80, 100, 20);

        tanggalText = new JTextField(15);
        add(tanggalText);
        tanggalText.setBounds(150, 85, 100, 20);

        nipLabel = new JLabel("NIP");
        add(nipLabel);
        nipLabel.setBounds(20, 110, 100, 20);

        nipText = new JTextField(15);
        add(nipText);
        nipText.setBounds(150, 115, 100, 20);

        golonganLabel = new JLabel("Golongan");
        add(golonganLabel);
        golonganLabel.setBounds(20, 140, 100, 20);

        String gol[] = {"1", "2", "3", "4"};
        golonganBox = new JComboBox(gol);
        add(golonganBox);
        golonganBox.setBounds(150, 145, 100, 20);

        SimpanButton = new JButton("Simpan");
        add(SimpanButton);
        SimpanButton.setBounds(200, 200, 100, 20);
        SimpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "Sudah Disimpan");
                    Pekerja pek = new Pekerja();
                    pek.setNama(namaText.getText());
                    pek.setTempatLahir(tempatText.getText());
                    pek.setTanggalLahir(tanggalText.getText());
                    pek.setNip(nipText.getText());
                    owner.perusahaan.tambahPekerja(pek);
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, x.getMessage());
                } }
        });
        setSize(400, 400);
        setLocation(300, 300);
        setLayout(null);
        setTitle("Edit Pekerja");
        setVisible(true);
    }
}
