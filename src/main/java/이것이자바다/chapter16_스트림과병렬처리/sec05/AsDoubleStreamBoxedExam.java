package 이것이자바다.chapter16_스트림과병렬처리.sec05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamBoxedExam {
    public static void main(String[] args) {

        int[] intarr = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intarr);

        intStream.asDoubleStream().forEach(x -> System.out.println(x));

        System.out.println(Arrays.toString(intarr));

        intStream = Arrays.stream(intarr);
        intStream
                //.boxed()
                .forEach(x-> System.out.println(x));
    }
}
