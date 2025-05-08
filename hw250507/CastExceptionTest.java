package hw250507;

class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class CastExceptionTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.err.println(" [예외 발생] " + e.toString());
		}

		System.out.println("=== 프로그램 종료 ===");
	}

	static void casting(Shape s) {
		Circle c = (Circle) s;
	}
}