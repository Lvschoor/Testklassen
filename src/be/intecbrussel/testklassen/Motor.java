package be.intecbrussel.testklassen;

public class Motor {

    private final int MAX_TOERENTAL = 5800;
    private int toerental;

    public void verhoogToerental(int boost){
        this.toerental+=boost;
        if (this.toerental>MAX_TOERENTAL){
            this.toerental=MAX_TOERENTAL;
        }

    }

    public Motor() {

    }

    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        this.toerental = toerental;
    }
}
