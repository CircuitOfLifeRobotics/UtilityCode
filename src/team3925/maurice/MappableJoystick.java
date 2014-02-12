package team3925.maurice;

import edu.wpi.first.wpilibj.Joystick;

public class MappableJoystick extends Joystick implements Updatable {
    
    ArrayList btns;
    
    public MappableJoystick(int port) {
        super(port);
        btns = new ArrayList(0);
    }
    
    public void registerButton(ActionButton btn) {
        btns.add(btn);
    }
    
    public void update() {
        for (int i = 0; i < btns.size(); i++) {
            ActionButton btn = (ActionButton) btns.get(i);
            btn.update();
        }
    }
    
    public Button createButton(int btn) {
        return new Button(this, btn);
    }
    
}
