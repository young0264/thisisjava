package 이것이자바다.chapter14_람다식.sec05.and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExam {
    public static void main(String[] args) {
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null,null : " + predicate.test(null));

        predicate = Predicate.isEqual("java8");
        System.out.println("null,java8 : " + predicate.test(null));

        predicate = Predicate.isEqual("null");
        System.out.println("null,java8 : " + predicate.test("java8"));

        predicate = Predicate.isEqual("java8");
        System.out.println("null,java8 : " + predicate.test("java8"));

    }
}
