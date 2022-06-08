package 이것이자바다.chapter16_스트림과병렬처리.sec01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김길동", "신용권", "남의영");

        //iterator이용
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        //Stream
        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));
    }
}
