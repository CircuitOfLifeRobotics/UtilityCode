package team3925.maurice;

public abstract class Module implements Updatable {
    
    private ArrayList components;
    
    public Module() {}
    
    public void registerComponent(Updatable comp) {
        if (components == null) {
            components = new ArrayList();
        }
        components.add(comp);
    }
    
    public void update() {
        if (components != null) {
            for (int i = 0; i < components.size(); i++) {
                ((Updatable) components.get(i)).update();
            }
        }
    }
}
