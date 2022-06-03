package 이것이자바다.chapter14_람다식.sec05.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExam2 {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    );


    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();
        return avg;
    }


    public static void main(String[] args) {
        double englishAvg = avg(t -> t.getEnglishScore());
        System.out.println("영어평균점수 :" + englishAvg);

        double mathAvg = avg(t -> t.getMathScore());
        System.out.println("수학평균점수 :" + mathAvg);
    }
}
