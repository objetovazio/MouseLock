

import java.awt.AWTException;
import java.awt.Robot;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;

public class GlobalKeyListener implements NativeKeyListener {

    Robot robot;

    public GlobalKeyListener() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if(e.getKeyCode() == e.VC_VOLUME_UP){
            MouseKeep.isLocked = !MouseKeep.isLocked;
            
            new Thread(new Runnable() {
                public void run() {
                    MouseKeep.LockMouse(robot);
                }
            }).start();
        }
        
        if(e.getKeyCode() == e.VC_VOLUME_DOWN){
            MouseKeep.pressF11(robot);
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
    }
}