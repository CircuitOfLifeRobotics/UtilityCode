package team3925.maurice;

public class XboxController extends MappableJoystick {
    
    public static final int
            A = 1,
            B = 2,
            X = 3,
            Y = 4,
            LB = 5,
            RB = 6,
            BACK = 7,
            START = 8,
            LS = 9,
            RS = 10,
            
            LX_AXIS = 1,
            LY_AXIS = 2,
            TRIGGER_AXIS = 3,
            RX_AXIS = 4,
            RY_AXIS = 5;
    
    public XboxController(int port) {
        super(port);
    }
    
}
