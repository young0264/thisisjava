package 이것이자바다.chapter16_스트림과병렬처리.sec09_stream_aggregate;

import java.util.Arrays;

public class AggregateExam {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);

       long sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .min()
                        .getAsInt();
        System.out.println(min);

        int first = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println(first);

    }
}
