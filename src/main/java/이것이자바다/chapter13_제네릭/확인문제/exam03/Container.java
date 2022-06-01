package 이것이자바다.chapter13_제네릭.확인문제.exam03;

public class Container<K, V>{
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
