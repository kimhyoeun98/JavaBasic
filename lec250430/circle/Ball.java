package lec250403.circle;

public class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
		
	}
	
	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}
	
	
	

}
