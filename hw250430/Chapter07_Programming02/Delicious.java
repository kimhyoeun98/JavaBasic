package Chapter07_Programming02;

public class Delicious implements Edible, Sweetable {
	
	public void eat() {
	    System.out.println("먹습니다.");
	}
	public void sweet() {
		System.out.println("달콤합니다.");
	}
	
	public static void main(String[] args) {
		Delicious d = new Delicious();
		d.eat();
		d.sweet();
		
		
	}
	
}
interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}
