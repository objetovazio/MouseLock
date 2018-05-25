/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.AWTException;
import java.awt.Robot;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

/**
 *
 * @author andre.martins
 */
public class GlobalMouseListener implements NativeMouseListener {

    Robot robot;

    public GlobalMouseListener() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) {
        if (nme.getButton() == nme.BUTTON3) {
            MouseKeep.isLocked = !MouseKeep.isLocked;

            new Thread(new Runnable() {
                public void run() {
                    MouseKeep.LockMouse(robot, nme.getX(), nme.getY());
                }
            }).start();
        }

        if (nme.getButton() == nme.BUTTON2) {
            MouseKeep.pressF11(robot);
        }

    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) {
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) {
    }

}
