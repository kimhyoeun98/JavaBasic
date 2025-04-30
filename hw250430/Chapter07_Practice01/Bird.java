package Chapter07_Practice01;

public class Bird implements Countable {
	
	private String name;
	
	public Bird(String name) {
		this.name = name;
		
	}
	
	public void fly() {
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + "2마리 있다." );
	}

}
