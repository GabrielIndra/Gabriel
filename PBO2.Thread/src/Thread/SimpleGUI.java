/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 8.1 Enterprise
 */
public class SimpleGUI extends JFrame {

    private JButton clickButton, stopButton;
    private JLabel counterLabel;
    private Counter counter;

    public SimpleGUI() {
        clickButton = new JButton("Start");
        stopButton = new JButton("Stop");
        counterLabel = new JLabel("Counter: ");
        this.setLayout(new FlowLayout());
        this.add(clickButton);
        this.add(counterLabel);
        this.add(stopButton);
        this.setTitle("Thread application");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickAction();
            }

            private void clickAction() {
                counter = new Counter(counterLabel);
            }
        });
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAction();
            }

            private void stopAction() {
                counter.setStart(false);
            }
        });
    }
}

