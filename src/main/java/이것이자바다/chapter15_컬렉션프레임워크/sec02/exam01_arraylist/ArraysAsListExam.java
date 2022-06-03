package 이것이자바다.chapter15_컬렉션프레임워크.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("홍길동", "신용권", "감자밭");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for (String a : list1) {
            System.out.println(a);
        }
        for (Integer b : list2) {
            System.out.println(b);
        }
    }
}
