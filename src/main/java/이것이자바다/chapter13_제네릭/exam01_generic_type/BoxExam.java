package 이것이자바다.chapter13_제네릭.exam01_generic_type;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();

        box.setter("남의영");

        String obj = (String)box.getter();

        System.out.println(obj);
        box.setter(new Apple());
    }
}
