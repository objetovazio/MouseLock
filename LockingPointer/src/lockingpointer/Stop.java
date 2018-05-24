/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockingpointer;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 20161BSI0349
 */
public class Stop extends JFrame {

    static Robot robot = null;
    static Rectangle bounds = new Rectangle(300, 300, 300, 300);
    static int lastX = 450; 
    static int lastY = 450;

    Stop() {

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        addMouseMotionListener(new MouseStop());

        getContentPane().add(new JLabel("<html>A sticky situation<br>Hold SHIFT to get out of it", JLabel.CENTER));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(bounds);
        setVisible(true);
    }

    private static class MouseStop extends MouseAdapter {
    }

    
}