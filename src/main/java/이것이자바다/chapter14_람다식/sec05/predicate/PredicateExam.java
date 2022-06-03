package 이것이자바다.chapter14_람다식.sec05.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남자", 90),
            new Student("남의영", "남자", 97),
            new Student("김길동", "여자", 95),
            new Student("홍순자", "여자", 92)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }


    public static void main(String[] args) {
        //남자평균점수

        double maleAvg = avg(a -> a.getSex().equals("남자"));
        System.out.println("남자평균점수 : "+ maleAvg);

        double femaleAvg = avg(a -> a.getSex().equals("여자"));
        System.out.println("여자평균점수 : "+ femaleAvg);
    }
}
