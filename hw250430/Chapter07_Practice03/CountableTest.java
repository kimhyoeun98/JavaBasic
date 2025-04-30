package Chapter07_Practice03;

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기" , 5), new Bird("독수리", 2),
				          new Tree("사과나무", 10), new Tree("밤나무", 7) };
		
		for(Countable e : m) 
			e.count();
		
		
		for (Countable e : m) {
            if (e instanceof Bird) {
                ((Bird) e).fly();
            } else if (e instanceof Tree) {
                ((Tree) e).ripen();
            }
			
	}
		
		
	}
		
	}