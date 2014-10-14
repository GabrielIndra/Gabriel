/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogMahasiswa extends JDialog implements ActionListener{
private JLabel nama, nim, tempatLahir;
private JTextField namaField, nimField, tempatField;
private JButton simpan, exit;
    public static void main(String[] args) {
        DialogMahasiswa tes= new DialogMahasiswa();
        tes.setVisible(true);
    }
public DialogMahasiswa(){
    setLayout(null);
    setSize(400, 400);
    nama= new JLabel("Nama");
    add(nama);
    nama.setBounds(20, 20, 100, 20);
    
    namaField= new JTextField(15);
    add(namaField);
    namaField.setBounds(100, 25, 125, 20);
    simpan= new JButton("Simpan");
    add(simpan);
    simpan.setBounds(150, 150, 100, 20);
    simpan.addActionListener(this);
    setTitle("Coba");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==simpan){
           
            namaField.setText(" ");
             
        }
    }
    
}
