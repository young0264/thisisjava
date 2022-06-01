package 이것이자바다.chapter13_제네릭.확인문제.exam04;

public class OtherPair<K, V> {
    private K key;
    private V value;

    public OtherPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()   { return key; }
    public V getValue() { return value; }
}
