package Chapter11_Prgram05;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        
        
        while (true) {
            System.out.print("점수를 입력하세요: ");
            int score = sc.nextInt();
            if (score < 0) break;
            scores.add(score);
        }

        System.out.println("전체 학생은 " + scores.size() + "명입니다.");
        System.out.print("학생들의 성적: ");
        for (int s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();

        
        int max = scores.stream().max(Integer::compareTo).orElse(0);

      
        for (int i = 0; i < scores.size(); i++) {
            int s = scores.get(i);
            String grade;
            if (s >= max - 10) grade = "A";
            else if (s >= max - 20) grade = "B";
            else if (s >= max - 30) grade = "C";
            else grade = "D";
            System.out.printf("%d번 학생의 성적은 %d점이며 등급은 %s이다.\n", i, s, grade);
        }
    }
}