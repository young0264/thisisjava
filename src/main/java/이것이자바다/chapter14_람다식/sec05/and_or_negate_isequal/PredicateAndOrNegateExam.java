package 이것이자바다.chapter14_람다식.sec05.and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExam {
    public static void main(String[] args) {
        //2의배수를검사
        IntPredicate predicateA = a -> a % 2 == 0;

        //3의배수를검사
        IntPredicate predicateB = a -> a % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수이냐 : "  + result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수이냐 : "  + result);

        //negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수이냐 : " + result);

    }
}
