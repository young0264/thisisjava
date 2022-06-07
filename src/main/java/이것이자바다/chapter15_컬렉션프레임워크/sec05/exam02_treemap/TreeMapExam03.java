package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExam03 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple",2 );
        treeMap.put("giga", 4);
        treeMap.put("cilantro",6 );
        treeMap.put("bayleaf", 1);
        treeMap.put("cnady", 9);

        System.out.println("[c,f사이 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
        for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
