package 이것이자바다.chapter16_스트림과병렬처리.sec08;

import java.util.Arrays;

public class MatchExam {
    public static void main(String[] args) {
        int[] intarr = {2, 4, 6};

        boolean result = Arrays.stream(intarr).allMatch(x -> x % 2 == 0);
        System.out.println(result);

        result = Arrays.stream(intarr).anyMatch(a -> a % 3 == 0);
        System.out.println("하나라도 3의배수 "+result);

        result = Arrays.stream(intarr).noneMatch(a -> a % 3 == 0);
        System.out.println("3의배수가 없냐 " + result);
    }
}
