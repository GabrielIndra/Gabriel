/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.model.Message;
import javax.swing.JOptionPane;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestMessage {

    public static void main(String[] args) {
        boolean validTo = true;
        Message mess = new Message();
        while (validTo) {
            try {
                mess.setTo(JOptionPane.showInputDialog("Masukkan alamat email tujuan : "));
                mess.setSubject(JOptionPane.showInputDialog("Masukkan subyek email (<11 kata) :"));
                mess.setMessage(JOptionPane.showInputDialog("Masukkan pesan email(<50 kata) :"));
                JOptionPane.showMessageDialog(null, mess.getResume());
                validTo = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
