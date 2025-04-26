package Cheapter06_Programing06;

public class Car extends Vehicle{
	public int displacement;
	public int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("자동차 속도 : " + speed + ", 자동차 색상 : " + color + ", 자동차 배기량 : " + displacement + ", 자동차 기어 단수 : " + gears);
	}

}
