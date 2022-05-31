package 이것이자바다.chapter13_제네릭.exam04_generic_method;

public class Box<T> {
    private T t;

    public void setter(T t) {
        this.t = t;
    }

    public T getter() { //return type  == Object
        return t;
    }
}
