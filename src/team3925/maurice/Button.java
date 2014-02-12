package team3925.maurice;

import edu.wpi.first.wpilibj.Joystick;

public class Button {
    private Joystick stick;
    private int btn;
    
    private boolean laststate = false;
    
    public Button(Joystick stick, int btn) {
        this.stick = stick;
        this.btn = btn;
    }
    
    public boolean check() {
        boolean state = stick.getRawButton(btn);
        boolean ret = state != laststate && state;
        laststate = state;
        return ret;
    }
            
}
