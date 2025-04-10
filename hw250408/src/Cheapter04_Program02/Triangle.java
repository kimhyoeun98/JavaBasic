package Cheapter04_Program02;

public class Triangle {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double findArea() {
        return (width * height) / 2.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public boolean isSameArea(Triangle other) {
        return this.findArea() == other.findArea();
    }
}