package Chapter07_Practice01;

public class Tree implements Countable{
	private String name;
	
	
	public Tree(String name) {
		this.name = name;
		
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + "5그루 있다.");
	}
	public void ripen() {
		
	}
	

}
