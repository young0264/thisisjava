package 이것이자바다.chapter14_람다식.sec05.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class consumerExam {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("java");

        BiConsumer<String, String> bigConsumer = (a, b) -> System.out.println(a + b);
        bigConsumer.accept("java", "study");

        DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (a, b) -> System.out.println(a + b);
        objIntConsumer.accept("java", 8);


    }
}
