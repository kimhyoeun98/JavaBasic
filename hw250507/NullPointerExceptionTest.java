package hw250507;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		
		Mydate d = null;
		
		try {
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		} catch (NullPointerException e) {
			System.err.println("[예외 발생] " + e.toString());
		}
		
		d = new Mydate();
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
	}

	public static class Mydate {
		int year = 2035;
		int month = 12;
		int day = 25;
	}
}