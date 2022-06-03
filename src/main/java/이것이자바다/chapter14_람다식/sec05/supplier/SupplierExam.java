package 이것이자바다.chapter14_람다식.sec05.supplier;

import java.util.function.IntSupplier;

public class SupplierExam {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;

            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("눈의 수 : " + num);
    }
}
