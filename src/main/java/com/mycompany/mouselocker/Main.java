/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mouselocker;

/**
 *
 * @author andre.martins
 */
public class Main {
    
    public static void main(String args[]) {
        MouseLockerJFrame jframe = new MouseLockerJFrame();
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
