package 이것이자바다.chapter14_람다식.exam04_noargu_noreturn;

public class UsingThisExam {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method1();
    }
}
