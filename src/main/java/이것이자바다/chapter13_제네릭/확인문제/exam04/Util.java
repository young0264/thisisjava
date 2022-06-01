package 이것이자바다.chapter13_제네릭.확인문제.exam04;

public class Util {

    public static <K, V> V getValue(Pair<K, V> p, K k) {
        if (p.getKey() == k) {
            return p.getValue();
        }else{
            return null;
        }
    }
}
