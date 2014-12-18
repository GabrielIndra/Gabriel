/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.view;

import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import uts.model.KelasKuliah;


/**
 *
 * @author 8.1 Enterprise
 */
public class DialogTambahKelas extends JDialog {

    JLabel kodeKelasLabel, semesterLabel, TALabel;
    JTextField kelasField;
    JComboBox tahunCombo;
    JRadioButton genap, gasal;
    JButton simpan;
    
    private final FrameUtama owner;

    public DialogTambahKelas(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.setSize(400, 400);
        this.setLocation(250, 250);
        this.setTitle("Form Tambah Kelas");
        this.getContentPane().setLayout(null);

        kodeKelasLabel = new JLabel("Kode Kelas");
        this.getContentPane().add(kodeKelasLabel);
        kodeKelasLabel.setBounds(50, 50, 100, 20);

        kelasField = new JTextField(15);
        this.getContentPane().add(kelasField);
        kelasField.setBounds(150, 55, 125, 20);

        semesterLabel = new JLabel("Semester");
        this.getContentPane().add(semesterLabel);
        semesterLabel.setBounds(50, 80, 100, 20);

        ButtonGroup bg = new ButtonGroup();
        genap = new JRadioButton("Genap");
        this.getContentPane().add(genap);
        genap.setBounds(280, 80, 130, 20);
        gasal = new JRadioButton("Gasal");
        this.getContentPane().add(gasal);
        gasal.setBounds(150, 80, 100, 20);
        bg = new ButtonGroup();
        bg.add(genap);
        bg.add(gasal);
        genap.setEnabled(true);
        gasal.setEnabled(true);

        TALabel = new JLabel("Tahun Akademik");
        this.getContentPane().add(TALabel);
        TALabel.setBounds(50, 110, 100, 20);
        
        String tahun[] = {"2012/2013", "2013/2014", "2014/2015"};
        tahunCombo = new JComboBox(tahun);
        this.getContentPane().add(tahunCombo);
        tahunCombo.setBounds(150, 110, 100, 20);
       
        simpan = new JButton("Tambah");
        this.getContentPane().add(simpan);
        simpan.setBounds(200, 200, 100, 20);

        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KelasKuliah kelas = new KelasKuliah();
                try {
                    JOptionPane.showMessageDialog(null, "Sudah Ditambah");
                    kelas.setKodeKuliah(kelasField.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                if (e.getSource() instanceof JRadioButton) {
                    JRadioButton radioButton = (JRadioButton) e.getSource();
                    if (radioButton.isSelected()) {
                        kelas.setSemester(radioButton.getText());
                    }
                }
                String x = String.valueOf(tahunCombo.getSelectedItem());
                kelas.setTahunAkademik(x);
                KelasKuliah.tambahKelas(kelas);
                kelasField.setText(" ");
                
            }
        });

        this.setVisible(true);
        this.owner = owner;
    }
}
