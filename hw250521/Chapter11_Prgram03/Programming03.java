package Chapter11_Prgram03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Programming03 {
	    public static void main(String[] args) {
	        Map<String, Integer> map = new Hashtable<>();
	        map.put("김얼공", 80);
	        map.put("최고봉", 90);
	        map.put("우동생", 95);
	        map.put("낙자바", 88);

	        Scanner sc = new Scanner(System.in);
	        System.out.print("이름을 입력하세요: ");
	        String name = sc.nextLine();

	        Integer score = map.get(name);
	        if (score != null) {
	            System.out.println(score);
	        } else {
	            System.out.println("해당 이름이 존재하지 않습니다.");
	        }
	    }
	}