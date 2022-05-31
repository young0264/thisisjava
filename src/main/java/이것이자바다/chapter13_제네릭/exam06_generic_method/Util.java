package 이것이자바다.chapter13_제네릭.exam06_generic_method;

public class Util {
    public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
