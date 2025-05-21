package Chapter11_Prgram02;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김얼공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우동생", 16));
		set.add(new Person("낙자바", 35));
		set.add(new Person("낙자바", 35));

		set.forEach(p -> System.out.println(p));
	}
}