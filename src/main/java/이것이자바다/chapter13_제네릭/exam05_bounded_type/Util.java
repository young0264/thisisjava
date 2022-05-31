package 이것이자바다.chapter13_제네릭.exam05_bounded_type;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) { // t1 > t2 : 1 else -2 return ->> int type
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);

    }
}
