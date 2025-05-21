package Chapter11_Challenge02;

import java.util.HashMap;
import java.util.Map;

public class Challenge02 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("head", "대가리");
        dic.put("teacher", "쌤");
        dic.put("cat", "고양이");
        dic.put("aunt", "이모");
        dic.put("noodle", "국시");
        dic.put("child", "얼라");

      
        dic.forEach((key, value) -> System.out.printf("%s=%s ", key, value));
        System.out.println();
    }
}