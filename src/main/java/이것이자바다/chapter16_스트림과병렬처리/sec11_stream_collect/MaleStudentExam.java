package 이것이자바다.chapter16_스트림과병렬처리.sec11_stream_collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExam {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("남의영", 10, Student.Sex.MALE),
                new Student("김길동", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(
                        () -> new MaleStudent(),
                        (r, t) -> r.accumulate(t),
                        (r1, r2) -> r1.combine(r2));
        maleStudent.getList().stream()
                .forEach(x -> System.out.println(x.getName()));

    }
}
