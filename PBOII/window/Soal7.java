/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class Soal7 extends JFrame {

    private JLabel lengthlabel;
    private JTextField lengthField;

    public Soal7() {
        super ("Simpel GUI");
        lengthlabel= new JLabel("Panjang ");
        lengthField= new JTextField(15);
        this.setLayout(new FlowLayout());
        this.add(lengthlabel);
        this.add(lengthField);
    }
}
