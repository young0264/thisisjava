package 이것이자바다.chapter16_스트림과병렬처리.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressExam {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신용권", 92));
        Stream<Student> stream = list.stream();
        stream.forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
