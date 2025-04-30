package lec250403.circle;

public class Overriding {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println(">>>원 :");
		System.out.println("반지름: " + circle.getRadius());
		System.out.println("면적 : " + circle.getArea());
		
		Ball ball = new Ball(5.0);
		System.out.println("\n>>> 공 : ");
		System.out.println("반지름 : " + ball.getRadius());
		System.out.println("면적 : " + ball.getArea());
		
		Cylinder cyl = new Cylinder(5.0,7.0);
		System.out.println("\n>>> 원기둥 : ");
		System.out.println("반지름 : " + cyl.getRadius());
		System.out.println("높이 : " + cyl.getHeight());
		System.out.println("면적 : " + cyl.getArea());
	}

}
