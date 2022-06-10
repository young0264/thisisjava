package 이것이자바다.chapter16_스트림과병렬처리.sec04;

import java.util.Arrays;
import java.util.List;

public class FilteringExam {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "신용부", "남의영", "신용권");

        names.stream()
                .distinct()
                .forEach(x-> System.out.println(x));
        System.out.println();

        names.stream()
                //.distinct()
                .filter(s -> s.startsWith("신"))
                .forEach(s -> System.out.println(s));

    }
}
