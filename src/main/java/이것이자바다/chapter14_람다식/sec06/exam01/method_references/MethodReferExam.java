package 이것이자바다.chapter14_람다식.sec06.exam01.method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferExam {
    public static void main(String[] args) {
        IntBinaryOperator operator; //2개받아 1개 int로 반환. 타입과 갯수가 맞아서 사용

        //정적메소드참조
        operator = (x, y) -> Calculator.staticMethod(x,y);
        System.out.println("결과1 : " + operator.applyAsInt(2, 3));

        operator = Calculator::staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(3, 4));

        //인스턴스 메소드 참조
        Calculator calc = new Calculator();
        operator = (x, y) -> calc.instanceMethod(x, y);
        System.out.println("결과3 : " + operator.applyAsInt(4, 5));

        operator = calc::instanceMethod;
        System.out.println("결과4 : " + operator.applyAsInt(7, 8));
    }
}
