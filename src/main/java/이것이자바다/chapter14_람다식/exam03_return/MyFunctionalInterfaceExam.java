package 이것이자바다.chapter14_람다식.exam03_return;

public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x,y) ->  x + y;
        System.out.println(fi.method1(2, 5));

        System.out.println(sum(4, 5));
    }


    public static int sum(int x, int y) {
        return x + y;
    }
}
