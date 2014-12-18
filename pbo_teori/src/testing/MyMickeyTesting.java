/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import MyPanel.MyMickeyMouse;
import MyPanel.MyPanel;
import javax.swing.JFrame;

/**
 *
 * @author iga ukiarwan
 */
public class MyMickeyTesting {
    public static void main(String[] args) {
        JFrame test = new JFrame();
        MyMickeyMouse testPanel = new MyMickeyMouse();
        
        test.add(testPanel);
        test.setSize(100,200);
        test.setVisible(true);
    }
}
