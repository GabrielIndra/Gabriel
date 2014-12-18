package Image;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class PanelTambahFoto extends JPanel implements ActionListener {

    private JLabel KodeAnggotaLabel;
    private JTextField kodeField;
    private JButton cariButton, simpanButton;
    private File file;
    private BufferedImage img;
    private JPanel panel;

    public PanelTambahFoto() {
        try {
            file = new File("cie.JPG");
            img = ImageIO.read(file);
        } catch (IOException ix) {
            ix.printStackTrace();
        }

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        this.add(panel);

        KodeAnggotaLabel = new JLabel("Kode Anggota");
        panel.add(KodeAnggotaLabel);
        kodeField = new JTextField();
        kodeField.setColumns(15);
        panel.add(kodeField);
        kodeField.addActionListener(this);
        kodeField.setEditable(true);

        cariButton = new JButton("Cari");
        panel.add(cariButton);
        cariButton.addActionListener(this);

        simpanButton = new JButton("Simpan");
        panel.add(simpanButton);
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Tersimpan");
            }
        });

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    @Override
    public void paintComponent(Graphics gp) {
        try {
            img = ImageIO.read(file);
            gp.drawImage(img, 30, 50, 220, 300, 0, 0, img.getWidth(null), img.getHeight(null), null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fc = null;
        if (e.getSource() == cariButton) {
            fc = new JFileChooser();
            int status = fc.showOpenDialog(this);
            if (status == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                repaint();
            } else if (kodeField.getText() == JFileChooser.APPROVE_BUTTON_TEXT_CHANGED_PROPERTY) {
                file = fc.getSelectedFile();
                repaint();
            }
        }
    }
}
