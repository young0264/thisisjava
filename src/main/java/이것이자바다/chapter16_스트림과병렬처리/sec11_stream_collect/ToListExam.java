package 이것이자바다.chapter16_스트림과병렬처리.sec11_stream_collect;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExam {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("남의영", 10, Student.Sex.MALE),
                new Student("김길동", 6, Student.Sex.FEMALE)
        );

        //남학생
        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex()==Student.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //여학생hashset
        Set<Student> femaleSet = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.FEMALE)
                //.collect(Collectors.toCollection(HashSet :: new));
                //.collect( Collectors.toCollection(()->{return new HashSet<Student>();}) );
                .collect( Collectors.toCollection(()->new HashSet<Student>()) );
        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
