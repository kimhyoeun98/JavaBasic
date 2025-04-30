package Chapter07_Programming05;

public abstract class Controller {
    boolean power;

    public Controller(boolean power) {
        this.power = power;
    }

    public String getName() {
        return "Controller";
    }

    public abstract void show();
}