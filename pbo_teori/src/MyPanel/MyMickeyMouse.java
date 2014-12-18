/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author iga ukiarwan
 */
public class MyMickeyMouse extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    
//        g2.setColor(new Color(0,0,0));
          //wajah
          g2.setColor(Color.white);
          g2.fillOval(100, 100, 100, 100);
          //telingan
          g2.setColor(Color.black);
          g2.fillOval(67, 80, 50, 50);
          g2.setColor(Color.BLACK);
          g2.fillOval(183, 80, 50, 50);
          //mata
          g2.setColor(Color.BLACK);
          g2.drawOval(125,120,20,40);
          g2.drawOval(155,120,20,40);
          //mata
          g2.setColor(Color.PINK);
          g2.fillOval(125,120,20,40);
          g2.fillOval(155,120,20,40);
            
          //iris
          g2.setColor(Color.BLACK);
          g2.fillOval(132, 142, 10, 15);
          g2.fillOval(158 ,142, 10, 15);
          //hidung
          g2.fillOval(142, 160, 20, 14);
          //mulut
          g2.drawOval(132, 175, 40, 20);
          //gigi
          
          g2.drawRect(147, 175, 6, 10);
          g2.drawRect(153, 175, 6, 10);
          
          
          
//        g2.setColor(new Color(0,0,0));
//        g2.drawString("Hello WOrd", 10, 10);
    }
}
