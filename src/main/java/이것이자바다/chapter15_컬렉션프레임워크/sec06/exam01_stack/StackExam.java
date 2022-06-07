package 이것이자바다.chapter15_컬렉션프레임워크.sec06.exam01_stack;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue());
        }
    }
}
