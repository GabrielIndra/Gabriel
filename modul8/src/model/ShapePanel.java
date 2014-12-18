/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
/*
 * ShapePanel.java
 */
public class ShapePanel extends JPanel {

    public ShapePanel() {
        setBackground(Color.white);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.drawLine(0, 10, 50, 100);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(50, 10, 50, 50);
        g.setColor(new Color(205, 100, 70));
        g.fillOval(100, 10, 50, 50);
        g.setColor(new Color(0, 255, 0));
        g.fillArc(150, 10, 50, 50, 0, 180);
        Graphics2D g2 = (Graphics2D) g;
// fill RoundRectangle2D.Double
        GradientPaint redtowhite = new GradientPaint(200, 10, Color.red, 250, 10, Color.black);
        g2.setPaint(redtowhite);
        g2.fill(new RoundRectangle2D.Double(200, 10, 50, 50, 10, 10));
//g2.setPaint();
        g2.drawString("Filled RoundRectangle2D", 200, 80);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Grafik 2 Dimensi");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new BorderLayout());
        ShapePanel shapePanel = new ShapePanel();
        frame.add(shapePanel, BorderLayout.CENTER);
        frame.setSize(450, 250);
        frame.setVisible(true);
    }
}
