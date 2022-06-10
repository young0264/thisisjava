package 이것이자바다.chapter16_스트림과병렬처리.sec10_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExam {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("남의영", 88)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student :: getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student :: getScore)
                .reduce((a, b) -> a+b)
                .get();

        int sum3 = studentList.stream()
                .map(Student :: getScore)
                .reduce(0, (a, b) -> a+b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
    }
}
