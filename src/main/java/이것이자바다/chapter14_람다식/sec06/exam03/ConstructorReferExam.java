package 이것이자바다.chapter14_람다식.sec06.exam03;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferExam {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("angel", "devil");

    }
}
