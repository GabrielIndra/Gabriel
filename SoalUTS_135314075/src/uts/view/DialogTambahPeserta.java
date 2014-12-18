/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import uts.model.KelasKuliah;
import uts.model.Mahasiswa;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogTambahPeserta extends JDialog {

    JLabel kelasLabel;
    JLabel nimLabel;
    JTextField TextField;
    JComboBox kelasCombo;
    JComboBox mahasiswaCombo;
    String[] arrayKelas;
    String[] arrayMahasiswa;
    String[] Kolom = {"Kelas", "NIM"};
    JButton simpan;
    private final FrameUtama owner;

    public DialogTambahPeserta(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.setSize(500, 500);
        this.setTitle("Tambah Peserta Kelas");
        this.getContentPane().setLayout(null);

        kelasLabel = new JLabel("Kelas");
        this.getContentPane().add(kelasLabel);
        kelasLabel.setBounds(20, 50, 100, 20);

        nimLabel = new JLabel("NIM");
        this.getContentPane().add(nimLabel);
        nimLabel.setBounds(200, 50, 100, 20);

        arrayKelas = new String[KelasKuliah.DAFTAR_KELAS_KULIAH.size()];
        for (int i = 0; i < KelasKuliah.DAFTAR_KELAS_KULIAH.size(); i++) {
            arrayKelas[i] = KelasKuliah.DAFTAR_KELAS_KULIAH.get(i).getKodeKuliah();
        }
        kelasCombo = new JComboBox(arrayKelas);
        this.getContentPane().add(kelasCombo);
        kelasCombo.setBounds(75, 50, 100, 20);

        arrayMahasiswa = new String[Mahasiswa.DAFTAR_MAHASISWA.size()];
        for (int i = 0; i < Mahasiswa.DAFTAR_MAHASISWA.size(); i++) {
            arrayMahasiswa[i] = Mahasiswa.DAFTAR_MAHASISWA.get(i).getNim();
        }
        mahasiswaCombo = new JComboBox(arrayMahasiswa);
        this.getContentPane().add(mahasiswaCombo);
        mahasiswaCombo.setBounds(250, 50, 100, 20);
        
        TextField = new JTextField();
        this.getContentPane().add(TextField);
        TextField.setBounds(20, 200, 400, 200);
        TextField.setEditable(false);

        simpan = new JButton("Tambah");
        this.getContentPane().add(simpan);
        simpan.setBounds(125, 100, 100, 40);

        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = (String) mahasiswaCombo.getSelectedItem();
                String y = (String) kelasCombo.getSelectedItem();
                TextField.setText(x+"\t\t"+y);
            }
        });
 
        this.setVisible(true);
        this.owner = owner;
    }
}
