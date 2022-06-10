package 이것이자바다.chapter16_스트림과병렬처리.sec06_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream
                .sorted()
                .forEach(x -> System.out.println(x + ","));
        System.out.println();

        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 30),
                new Student("김기루", 10),
                new Student("신용권", 20));

        studentList.stream()
                .sorted()
                .forEach(x-> System.out.println(x.getScore()));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x-> System.out.println(x.getScore()));
        System.out.println();


    }
}
