package team3925.maurice;

import edu.wpi.first.wpilibj.Joystick;

public abstract class ActionButton implements Updatable {
    
    private Button btn;
    
    public ActionButton(Joystick stick, int btn) {
        this.btn = new Button(stick, btn);
    }
    
    public void update() {
        if (btn.check()) {
            onPress();
        }
    }
    
    public abstract void onPress();
    
}
