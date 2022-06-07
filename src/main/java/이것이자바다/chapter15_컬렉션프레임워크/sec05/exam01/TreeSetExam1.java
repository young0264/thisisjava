package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExam1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(81);
        scores.add(97);
        scores.add(89);

        Integer score = null;

        score = scores.first();
        System.out.println(score);
        score = scores.last();
        System.out.println(score);

        System.out.println();


        score = scores.lower(95);
        System.out.println(score);

        score = scores.higher((90));
        System.out.println(score);

//        Iterator<Integer


    }


}
