package Chapter07_Practice03;

public class Tree extends Countable{

	
	public Tree(String name, int num) {
		super(name, num);
		
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}
	public void ripen() {
		 System.out.println(num + "그루 "+ name + "에 열매가 잘 익었다.");
	}
	

}
