package lec250403.circle;

public class Circle {
	
	public static final double PI = 3.14;
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		return PI * radius *radius;
	}
}
