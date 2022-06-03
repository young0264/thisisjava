package 이것이자바다.chapter14_람다식.sec05.andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExam {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
            System.out.println("consumerA : " + m.getName());
        };

        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumerB : " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));
    }
}
