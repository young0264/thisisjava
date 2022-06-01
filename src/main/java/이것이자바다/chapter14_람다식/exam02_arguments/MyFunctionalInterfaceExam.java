package 이것이자바다.chapter14_람다식.exam02_arguments;

public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method1(5);

        fi = (x) -> System.out.println(x*5);
        fi.method1(3);
    }
}
