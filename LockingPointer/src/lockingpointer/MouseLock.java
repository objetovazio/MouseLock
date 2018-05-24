/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockingpointer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static lockingpointer.Stop.lastX;

/**
 *
 * @author 20161BSI0349
 */
public class MouseLock extends MouseAdapter {

    Robot robot = null;
    static int lastX;
    static int lastY;
    
    static double screenX;
    static double screenY;
    
    public MouseLock(double screenX, double screenY){
        this.screenX = screenX;
        this.screenY = screenY;
        
        try{
            robot = new Robot();
        }
        catch(AWTException e){
            System.err.println(e.getStackTrace());
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getButton());
        if(e.getButton() == MouseEvent.BUTTON2_MASK){
            lastX = e.getXOnScreen();
            lastY = e.getYOnScreen();
        }
        else{
            robot.mouseMove(lastX, lastY);
        }
    }
}
