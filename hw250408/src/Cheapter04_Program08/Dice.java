package Cheapter04_Program08;

public class Dice {
    private int face = 6;

    public int roll() {
        return (int)(Math.random() * face) + 1;
    }
}


