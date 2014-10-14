/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGUI135314075;

import GUI135314075.DialogPekerja;
import GUI135314075.FrameUtama;
import javax.swing.JDialog;

import javax.swing.JFrame;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestFrameUtama {
    public static void main(String[] args) {

        FrameUtama tes= new FrameUtama();
        tes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DialogPekerja testDialog= new DialogPekerja();
        testDialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        tes.add(testDialog);
    }
}
