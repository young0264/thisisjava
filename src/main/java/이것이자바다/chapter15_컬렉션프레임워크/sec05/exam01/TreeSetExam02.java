package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam02 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(97);
        scores.add(89);

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer i : descendingSet) {
            System.out.println(i);
        }

        System.out.println("==================");
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (int i : ascendingSet) {
            System.out.println(i);
        }
    }
}
