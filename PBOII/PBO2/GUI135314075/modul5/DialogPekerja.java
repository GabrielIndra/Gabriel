/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.GUI135314075.modul5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogPekerja extends JDialog implements ActionListener {

    JDialog dialog;
    JLabel namaLabel;
    JLabel tempatLahirLabel;
    JLabel tanggalLahirLabel;
    JLabel nipLabel, golonganLabel;
    JTextField namaField;
    JTextField tempatField, tanggalField, nipField;
    JComboBox golonganCombo;
    JButton SimpanButton;
    private final FrameUtama owner;

    /**
     *
     */
    public DialogPekerja(FrameUtama owner, boolean modal) {

        super(owner, modal);
        this.owner = owner;
        setLayout(null);

        setSize(400, 400);

        namaLabel = new JLabel("Nama");
        add(namaLabel);
        namaLabel.setBounds(20, 20, 100, 20);

        namaField = new JTextField(15);
        add(namaField);
        namaField.setBounds(150, 25, 100, 20);

        tempatLahirLabel = new JLabel("Tempat Lahir");
        add(tempatLahirLabel);
        tempatLahirLabel.setBounds(20, 50, 100, 20);

        tempatField = new JTextField(15);
        add(tempatField);
        tempatField.setBounds(150, 55, 100, 20);

        tanggalLahirLabel = new JLabel("Tanggal Lahir");
        add(tanggalLahirLabel);
        tanggalLahirLabel.setBounds(20, 80, 100, 20);

        tanggalField = new JTextField(15);
        add(tanggalField);
        tanggalField.setBounds(150, 85, 100, 20);

        nipLabel = new JLabel("NIP");
        add(nipLabel);
        nipLabel.setBounds(20, 110, 100, 20);

        nipField = new JTextField(15);
        add(nipField);
        nipField.setBounds(150, 115, 100, 20);

        golonganLabel = new JLabel("Golongan");
        add(golonganLabel);
        golonganLabel.setBounds(20, 140, 100, 20);

        String labelGolongan[] = {"1", "2", "3", "4"};
        golonganCombo = new JComboBox(labelGolongan);
        add(golonganCombo);
        golonganCombo.setBounds(150, 145, 100, 20);

        SimpanButton = new JButton("Simpan");
        add(SimpanButton);
        SimpanButton.setBounds(150, 200, 100, 20);
        SimpanButton.addActionListener(this);

        setTitle("Pekerja");
        setVisible(true);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Sudah Ditambah");
        Pekerja pek = new Pekerja();
        pek.setNama(namaField.getText());
        pek.setTempatLahir(tempatField.getText());
        pek.setTanggalLahir(tanggalField.getText());
        pek.setNip(nipField.getText());
        owner.getPerusahaan().tambahPekerja(pek);

    }
}
