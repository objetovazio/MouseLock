/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockingpointer;

import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static lockingpointer.Stop.bounds;

/**
 *
 * @author 20161BSI0349
 */
public class LockPointer {

    public static void main(String args[]) {      
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        JFrame jFrame = new JFrame("MouseLocker");
        jFrame.getContentPane().add(new JLabel("Feche para finalizar", JLabel.CENTER));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setBounds(bounds);
        jFrame.setVisible(true);
        jFrame.setSize(450, 450);
        
        MouseLock mouseLock = new MouseLock(width, height);
        
        jFrame.addMouseListener(mouseLock);
        
        while(true){
            System.out.println(MouseInfo.getPointerInfo() + " " + MouseInfo.getNumberOfButtons() + " ");
            MouseInfo.getPointerInfo().getLocation();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
    }
}
