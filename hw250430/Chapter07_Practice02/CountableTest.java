package Chapter07_Practice02;

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기"), new Bird("독수리"),
				          new Tree("사과나무"), new Tree("밤나무") };
		
		for(Countable e : m)
			e.count();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			} else {
				((Tree)m[i]).ripen();
		}
			
	}
		
		
	}
		
	}