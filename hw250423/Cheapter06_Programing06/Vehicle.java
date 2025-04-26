package Cheapter06_Programing06;

public class Vehicle {
	public String color;
	public int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("자동차 색깔 : "+ color + "자동차 속도 : " + speed);
	}
}
