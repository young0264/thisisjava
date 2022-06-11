package 이것이자바다.chapter16_스트림과병렬처리.sec11_stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExam {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("남의영", 10, Student.Sex.MALE),
                new Student("김길순", 6, Student.Sex.FEMALE)
        );
        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex));
        System.out.println("[남학생]");
        mapBySex.get(Student.Sex.MALE).stream()
                .forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();
        System.out.println("[여학생]");
        mapBySex.get(Student.Sex.FEMALE).stream()
                .forEach(x -> System.out.print(x.getName() + " "));


        Map<Student.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));
        System.out.print("서울");
        mapByCity.get(Student.City.Seoul).stream()
                .forEach(s -> System.out.print(s + " "));
    }
}
