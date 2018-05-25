/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mouselocker;

import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author andre.martins
 */
public class  MouseKeep {
    public static boolean isLocked;
    
    public static void LockMouse(Robot robot, int x, int y){
        while(true){
            robot.mouseMove(x, y);
            if(!isLocked) break;
        }
    }
    
    public static void pressF11(Robot robot){
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
    }
}
