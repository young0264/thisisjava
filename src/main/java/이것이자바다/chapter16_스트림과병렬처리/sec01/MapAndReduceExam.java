package 이것이자바다.chapter16_스트림과병렬처리.sec01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExam {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("남의영", 30)
        );

        double avg = studentList.stream()
                //중간처리
                .mapToInt(Student::getScore)
                //최종처리
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
