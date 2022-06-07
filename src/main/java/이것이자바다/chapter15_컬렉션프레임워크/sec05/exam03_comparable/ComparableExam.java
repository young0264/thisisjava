package 이것이자바다.chapter15_컬렉션프레임워크.sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김길동", 27));
        treeSet.add(new Person("남의영", 30));

        Iterator<Person> iter = treeSet.iterator();
        System.out.println(iter.next().name);
        System.out.println();
        while (iter.hasNext()) {
            Person person = iter.next();
            System.out.println(person.name);
        }
    }
}
