package 이것이자바다.chapter13_제네릭.확인문제.exam02;

public class Container<T> {
    private T t;
    public T get(){
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
