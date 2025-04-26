package Cheapter06_Programing04;

public class OverShadowTest {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}
}
