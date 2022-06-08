package 이것이자바다.chapter16_스트림과병렬처리.sec02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExam {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동",10),
                new Student("신용권",20),
                new Student("남의영",30)
        );

        Stream<Student> stream = studentList.stream();
        //stream.forEach(studentList::print);
        stream.forEach(s-> System.out.println(s.getName()));

    }

    public static void print(Student s) {
        System.out.println(s.getName());
    }
}
