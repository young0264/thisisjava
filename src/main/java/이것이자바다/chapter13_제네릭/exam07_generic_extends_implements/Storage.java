package 이것이자바다.chapter13_제네릭.exam07_generic_extends_implements;

public interface Storage<T> {
    public void add(T item, int index);     //T타입의 item을 저기 index에 저장(add)하겟다

    public T get(int index);                //index의 객체를 찾아서 리턴하겟다/ 객체가 T타입이겠지.
}
