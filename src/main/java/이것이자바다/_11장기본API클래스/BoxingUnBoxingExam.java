package 이것이자바다._11장기본API클래스;

public class BoxingUnBoxingExam {
    public static void main(String[] args) {
        //Boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");
        int x = 700;
        int a;

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        //Unboxing
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();
        a = 3;
        System.out.println(a);
        System.out.println(x);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
