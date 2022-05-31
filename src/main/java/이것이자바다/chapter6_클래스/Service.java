package 이것이자바다.chapter6_클래스;

public class Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("실행내용1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행내용2");
    }

    @PrintAnnotation(value = "#", numbers = 15)
    public void method3() {
        System.out.println("실행내용3");
    }
}
