package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동");
        scores.put(98, "이동수");
        scores.put(96, "남의영");
        scores.put(90, "김수로");
        scores.put(80, "박굴동");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println("가장낮은점수" + entry.getKey() + ":" + entry.getValue());

        entry = scores.lastEntry();
        System.out.println(entry.getKey() + ","+ entry.getValue());

        entry = scores.lowerEntry(95);
        System.out.println(entry.getValue());

        entry = scores.higherEntry(95);
        System.out.println(entry.getValue());

        entry = scores.floorEntry((95));        // 95점이거나 바로 아래점수
        System.out.println(entry.getValue());

        entry = scores.ceilingEntry((95));        // 95점이거나 바로 위에점수
        System.out.println(entry.getValue());

        System.out.println();
        while (!scores.isEmpty()) {
            //entry = scores.pollLastEntry();
            entry = scores.pollFirstEntry();//오름차순
            System.out.println(entry.getValue());
        }



    }
}
