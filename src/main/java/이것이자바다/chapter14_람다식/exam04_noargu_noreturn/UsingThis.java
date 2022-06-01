package 이것이자바다.chapter14_람다식.exam04_noargu_noreturn;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method1() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("innerField : " + innerField);

            };
            fi.method1();

        }
    }
}
