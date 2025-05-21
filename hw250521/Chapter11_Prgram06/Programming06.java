package Chapter11_Prgram06;

import java.util.HashMap;
import java.util.Map;

public class Programming06 {
    public static void main(String[] args) {
        Map<String, String> animals = new HashMap<>();
        animals.put("호랑이", "tiger");
        animals.put("표범", "leopard");
        animals.put("사자", "lion");

        System.out.println("변경 전 : " + animals);

       
        animals.replaceAll((k, v) -> v.toUpperCase());

        System.out.println("변경 후 : " + animals);
    }
}