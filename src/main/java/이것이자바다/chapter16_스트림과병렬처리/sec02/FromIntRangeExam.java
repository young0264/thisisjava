package 이것이자바다.chapter16_스트림과병렬처리.sec02;

import java.util.stream.IntStream;

public class FromIntRangeExam {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("총합:" + sum);

    }
}
