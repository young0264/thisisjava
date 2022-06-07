package 이것이자바다.chapter15_컬렉션프레임워크.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("신민아", 99);
        map.put("홍길동", 96);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.println();


        map.clear();
        System.out.println(map.size());
    }


}


