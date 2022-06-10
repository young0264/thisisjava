package 이것이자바다.chapter16_스트림과병렬처리.sec05;


import java.util.Arrays;
import java.util.List;

public class MapExam {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김기루", 20),
                new Student("신용권", 30)
        );

        studentList.stream()
                .mapToInt(Student :: getScore)
                .forEach(score -> System.out.println(score));
    }
}
