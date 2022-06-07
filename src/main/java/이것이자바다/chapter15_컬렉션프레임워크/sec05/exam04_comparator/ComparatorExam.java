package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam04_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExam {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iter = treeSet.iterator();
        while (iter.hasNext()) {
            Fruit fruit = iter.next();
            System.out.println(fruit.name +" : " + fruit.price);
        }
    }
}
