package 이것이자바다.chapter16_스트림과병렬처리.sec07_streamlooping;

import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args) {

        int[] intarr = {1, 2, 3, 4, 5,6,7};

        System.out.println("peek를 마지막에 호출한 경우");
        int total = Arrays.stream(intarr)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x))
                .sum();
        System.out.println(total);
    }
}
