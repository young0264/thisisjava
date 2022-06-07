package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam02 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동");
        scores.put(98, "이동수");
        scores.put(96, "남의영");
        scores.put(90, "김수로");
        scores.put(80, "박굴동");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.println(entry.getKey() + " : " +entry.getValue());

        }

    }
}
