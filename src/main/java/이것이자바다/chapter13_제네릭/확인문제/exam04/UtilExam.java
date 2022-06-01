package 이것이자바다.chapter13_제네릭.확인문제.exam04;

public class UtilExam {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼원");
        System.out.println(childAge);

    }
}
