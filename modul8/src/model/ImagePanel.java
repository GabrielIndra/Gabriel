/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class ImagePanel extends JPanel {

    private BufferedImage logo;

    /**
     * Creates a new instance of ImagePanel
     */
    public ImagePanel() {
        try {
// buka file. Cari file gambar lain di computer anda
            File img = new File("aku.jpg");
// baca image
            logo = ImageIO.read(img);
//img.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(logo,
                0, 0, 215, 300,
                0, 0, logo.getWidth(null), logo.getHeight(null),
                null);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        ImagePanel gc = new ImagePanel();
        frame.add(gc, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(225, 325);
        frame.setVisible(true);
    }
}
