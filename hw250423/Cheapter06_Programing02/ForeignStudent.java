package Cheapter06_Programing02;

public class ForeignStudent extends Student{

	public String cont;
	
	public ForeignStudent(String name, int age, int number, String cont) {
		super(name, age, number);
		this.cont = cont;
	}
	
	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + number + ", 국적 : " + cont + "]");
	}

}
