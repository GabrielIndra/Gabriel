package Image;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author 8.1 Enterprise
 */
public class PanelTest {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Using 2D");
        jf.setLayout(new BorderLayout());
        PanelTambahFoto foto = new PanelTambahFoto();
        jf.add(foto, BorderLayout.CENTER);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(450, 450);
        jf.setLocation(200, 200);
        jf.setVisible(true);
    }
}
