package Chapter11_Prgram01;

import java.util.ArrayList;
import java.util.List;

public class Programming01 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("감자캐기");
        words.add("나비");
        words.add("다람쥐");
        words.add("타자");

        for (String word : words) {
            if (word.length() == 2) {
                System.out.println(word);
            }
        }
    }
}