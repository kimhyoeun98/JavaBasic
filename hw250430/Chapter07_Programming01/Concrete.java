package Chapter07_Programming01;

public class Concrete extends Abstract {
	int j;
	
	Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	void show() {
		System.out.println("i = "+ i +", j = " + j);
	}
	

}
