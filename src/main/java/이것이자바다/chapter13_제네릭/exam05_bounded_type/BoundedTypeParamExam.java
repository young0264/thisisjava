package 이것이자바다.chapter13_제네릭.exam05_bounded_type;

public class BoundedTypeParamExam {
    public static void main(String[] args) {
        int result1 = Util.compare(1.1, 2.2);
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);

    }
}
