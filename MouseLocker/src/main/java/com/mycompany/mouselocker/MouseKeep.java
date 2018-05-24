/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mouselocker;

import java.awt.AWTException;
import java.awt.Robot;

/**
 *
 * @author andre.martins
 */
public class  MouseKeep {
    
    public static Robot robot;
    public static boolean isLocked;
    
    public MouseKeep(){
        try{
            robot = new Robot();
        }
        catch(AWTException e){
            e.printStackTrace();
        }
        isLocked = false;
    }
    
    public static void LockMouse(int x, int y){
        while(isLocked){
            robot.mouseMove(x, y);
        }
    }
}
