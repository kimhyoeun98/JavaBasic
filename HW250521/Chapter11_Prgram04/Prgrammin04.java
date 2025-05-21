package Chapter11_Prgram04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prgrammin04 {
	public static void main(String[] args) {
		
		Set<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
		System.out.println("hashset = " + a1);

		
		TreeSet<String> treeSet = new TreeSet<>(a1);
		System.out.println("treeset = " + treeSet);

		
		System.out.println("첫번째 동물 = " + treeSet.first());
		System.out.println("마지막 동물 = " + treeSet.last());
		System.out.println("나비 앞에 있는 동물 = " + treeSet.lower("나비"));
	}
}