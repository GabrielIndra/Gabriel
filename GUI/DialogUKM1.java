/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class DialogUKM1  extends JDialog{
    Container containtPane ;
    JComboBox jabatanketua, jabatansekre;
    JTextField nama_unit, daftar_juara;
    JList anggota;
    JLabel nama_unitLabel, daftar_juaraLabel, jabatanlabel, jabatanseklabel,anggotalabel;
    String[] anggota_ang={"Anda","Dia","Kamu","Dina", "Dino", "Sinta","Dita","Sefa","Mimi", "Pandu",
                            "Nata","Dewi","Dimas","Ave","Nita","Kevin"};
    String[] jabatan_ket={"Dika","Santi","Appo"};
    String[] jabatan_sek={"Alin", "Lina", "Muvi","Melinda"};
    JButton simpan;
    public DialogUKM1(){
        setSize(400,200);
        setLocation(100, 100);
        containtPane = getContentPane();
        containtPane.setLayout(new BorderLayout());
        containtPane.setLayout(new FlowLayout());
        
        
   addComp();
        
    }
    private void addComp() {
        nama_unitLabel=new JLabel("Unit UKM : ");
        containtPane.add(nama_unitLabel);
        nama_unit=new JTextField(6);
        containtPane.add(nama_unit);
        jabatanlabel=new JLabel("Ketua");
        containtPane.add(jabatanlabel);
        jabatanketua=new JComboBox(jabatan_ket);
        containtPane.add(jabatanketua);
        jabatanseklabel=new JLabel("Sekertaris");
        containtPane.add(jabatanseklabel);
        jabatansekre=new JComboBox(jabatan_sek);
        containtPane.add(jabatansekre);
        anggotalabel=new JLabel("Anggota");
        containtPane.add(anggotalabel);
        anggota=new JList(anggota_ang);
        containtPane.add(new JScrollPane(anggota));
        daftar_juaraLabel=new JLabel("Juara");
        containtPane.add(daftar_juaraLabel);
        daftar_juara=new JTextField(10);
        containtPane.add(daftar_juara);
        simpan=new JButton("Simpan");
        containtPane.add(simpan);

         simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String unit = nama_unit.getText();
                String ketua = (String) jabatanketua.getSelectedItem();
                String Sekertariat = (String) jabatansekre.getSelectedItem();
                String juara=daftar_juara.getText();
                Object[] anggota_pilih=anggota.getSelectedValues();

                JOptionPane.showMessageDialog(null, "Welcome To ADD UKM \n UNIT : " + unit + "\nKetua : " 
                        + ketua + "\n Sekertaris : " +Sekertariat +"\n Juara : "+juara);
                for (int i = 0; i < anggota_pilih.length; i++) {
                    JOptionPane.showMessageDialog(null, "Anggota :"+anggota_pilih[i]); 
                    
                }

            }
            });
    }
    }
