package 이것이자바다.chapter13_제네릭.exam02_generic_type;

public class BoxExam {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setter("hello");
        String greet = (String) box.getter();

        Box<Integer> box2 = new Box<Integer>();
        box2.setter(3);
        int value2 = box2.getter();

    }
}
