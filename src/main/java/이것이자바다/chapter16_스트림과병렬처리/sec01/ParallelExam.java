package 이것이자바다.chapter16_스트림과병렬처리.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "남의영", "람다식");

        //순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExam::print);

        System.out.println();
        //병렬처리
        Stream<String> paralStream = list.parallelStream();
        paralStream.forEach(ParallelExam::print);
    }

    public static void print(String str) {
        System.out.println(str + ":" + Thread.currentThread().getName());

    }
}
