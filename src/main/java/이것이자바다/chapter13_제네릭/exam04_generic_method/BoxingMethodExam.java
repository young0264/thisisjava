package 이것이자바다.chapter13_제네릭.exam04_generic_method;

public class BoxingMethodExam {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(1004);
        int intValue = box1.getter();
        System.out.println(intValue);

        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getter();
        System.out.println(strValue);
    }
}
