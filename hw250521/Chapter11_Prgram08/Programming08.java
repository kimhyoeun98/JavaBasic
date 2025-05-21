package Chapter11_Prgram08;

import java.util.*;


public class Programming08 {
    public static void main(String[] args) {
        String[] s = { "독수리", "고양이", "강아지" };
        List<String> list = Arrays.asList("개미", "개미");
        System.out.println(list);

        List<String> all = new ArrayList<>(list);
        System.out.println("nCopies : " + all);

        Collections.fill(all, "벌");
        System.out.println("'벌'을 채운 후 : " + all);

        Collections.addAll(all, s);
        System.out.println("리스트를 모두 추가한 후 : " + all);

        Collections.shuffle(all);
        System.out.println("리스트를 섞은 후 : " + all);

        Collections.reverse(all);
        System.out.println("리스트를 역순으로 정렬한 후 : " + all);

        System.out.println("리스트에서 최소 : " + Collections.min(all));
        System.out.println("리스트에서 최대 : " + Collections.max(all));
        System.out.println("리스트에서 '벌'의 빈도 : " + Collections.frequency(all, "벌"));
    }
}