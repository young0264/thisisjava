package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("red", 86);
        map.put("white", 90);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }

        int avgScore = totalScore / map.size();
        System.out.println("평균점수 : " + avgScore);
        System.out.println("최고점수 : " + maxScore);
        System.out.println("최고점수를 받은 아이디 : " +name);

    }
}
