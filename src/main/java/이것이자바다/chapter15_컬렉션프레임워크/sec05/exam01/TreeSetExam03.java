package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExam03 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("zoo");
        treeSet.add("damm");
        treeSet.add("young");
        treeSet.add("cherry");
        treeSet.add("good");

        System.out.println(treeSet);
        System.out.println("c에서 f사이의 단어를 출력하겟다. : ");
        treeSet.subSet("c", true, "f", true);

    }
}
