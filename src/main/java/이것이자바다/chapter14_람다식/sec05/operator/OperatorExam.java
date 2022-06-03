package 이것이자바다.chapter14_람다식.sec05.operator;

import java.util.function.IntBinaryOperator;

public class OperatorExam {
    private static int[] scores = {92, 95, 87};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값얻기
        int max = maxOrMin(
                (a, b) -> {
                    if (a >= b) return a;
                    else return b;
                }
        );
        System.out.println("최대값 : " + max);

        //최소값얻기
        int min = maxOrMin(
                (a, b) -> {
                    if (a <= b) return a;
                    else return b;
                }
        );
        System.out.println("최소값 : " + min);
    }
}
