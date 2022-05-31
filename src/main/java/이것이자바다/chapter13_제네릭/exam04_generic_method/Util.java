package 이것이자바다.chapter13_제네릭.exam04_generic_method;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.setter(t);
        return box;
    }
}
