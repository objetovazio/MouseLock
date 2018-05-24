/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mouselocker;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

/**
 *
 * @author andre.martins
 */
public class GlobalMouseListener implements NativeMouseListener {
    
    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) {
        System.out.println("Cliquei");
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) {
        System.out.println("Pressed");
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) {
        System.out.println("Released");
    }
    
}
