package Cheapter06_Programing03;

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point(3, 4);
		Point s = new MovablePoint(4, 5, 10, 12);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
