package Cheapter06_Programing03;

public class Point {
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getPointX() {
		return x;
	}
	
	public int getPointY() {
		return y;
	}
	
	public String toString() {
		return "x 좌표 : " + x + ", y 자표 : " + y;
	}
}
