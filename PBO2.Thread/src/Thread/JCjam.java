/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author 8.1 Enterprise
 */
public class JCjam  extends JFrame{
    // Deklarasi komponen Label
    JLabel tampil_jam = new JLabel();
    // Konstruktor
    public JCjam() {
        tampil_jam.setFont(new Font("JuruCoding", 1, 30));
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(tampil_jam);
        // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String jc_jam = "";
                String jc_menit = "";
                String jc_detik = "";
                // Membuat Date
                Date JC = new Date();
                // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
                int nilai_jam = JC.getHours();
                int nilai_menit = JC.getMinutes();
                int nilai_detik = JC.getSeconds();
                // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
                if (nilai_jam <= 9) {
                    // Tambahkan "0" didepannya
                    jc_jam = "0";
                }
                // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
                if (nilai_menit <= 9) {
                    // Tambahkan "0" didepannya
                    jc_menit = "0";
                }
                // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
                if (nilai_detik <= 9) {
                    // Tambahkan "0" didepannya
                    jc_detik = "0";
                }
                // Membuat String JAM, MENIT, DETIK
                String jam = jc_jam + Integer.toString(nilai_jam);
                String menit = jc_menit + Integer.toString(nilai_menit);
                String detik = jc_detik + Integer.toString(nilai_detik);
                // Menampilkan pada Layar
                tampil_jam.setText("  " + jam + " : " + menit + " : " + detik + "  ");
            }
        };
        // Timer
        new Timer(1000, taskPerformer).start();
    }
    // MAIN
    public static void main(String[] JuruCoding) {
        JCjam jc = new JCjam();
        jc.setTitle("JC Digital");
        jc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jc.setSize(200, 90);
        jc.show();
    }
} 


