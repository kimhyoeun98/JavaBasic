package lec250403.circle;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return 2 * PI * radius * (radius + height);
	}
	

}
