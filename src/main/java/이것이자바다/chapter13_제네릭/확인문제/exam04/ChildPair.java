package 이것이자바다.chapter13_제네릭.확인문제.exam04;

public class ChildPair<K, V> extends Pair<K, V> {
    public ChildPair(K k, V v) {
        super(k, v);    //부모의 생성자를 호출
    }
}