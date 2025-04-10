package Cheapter04_Program04;

public class Car {
	private String color;
    private static int numOfCar = 0;
    private static int numOfRedCar = 0;

    public Car(String color) {
        this.color = color;
        numOfCar++;

        if (color.equalsIgnoreCase("red")) {
            numOfRedCar++;
        }
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}


