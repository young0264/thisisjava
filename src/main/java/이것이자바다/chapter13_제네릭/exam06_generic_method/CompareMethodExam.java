package 이것이자바다.chapter13_제네릭.exam06_generic_method;

public class CompareMethodExam {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        //Util.compare(p1, p2);
        boolean result1 = Util.<Integer, String>compare(p1, p2);
        if (result1) {
            System.out.println("논리적으로 동등한 객체입니다");
        }else{
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }

        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "남의영");
        //Util.compare(p1, p2);
        boolean result2 = Util.compare(p3, p4);
        if (result2) {
            System.out.println("논리적으로 동등한 객체입니다");
        }else{
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }

    }
}
