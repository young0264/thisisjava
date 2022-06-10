package 이것이자바다.chapter16_스트림과병렬처리.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExam {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",Member.MALE, 30),
                new Member("김나리",Member.FEMALE, 20),
                new Member("신용권",Member.MALE, 45),
                new Member("남의영",Member.FEMALE, 27)
        );

        double ageAvg = list.stream()
                .filter(x -> x.getSex() == Member.MALE)
                .mapToInt(y -> y.getAge())
                .average()
                .getAsDouble();

        System.out.println(ageAvg);

    }
}
