package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.exam10;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue",96));
        treeSet.add(new Student("red",94));
        treeSet.add(new Student("white",89));

        //Student student = treeSet.last();
        //System.out.println("최고점수: " + student.score);
        //System.out.println("최고점수를 받은 아이디 : " + student.id);
        Iterator<Student> iter = treeSet.iterator();
        while (!iter.hasNext()) {
            Student x = iter.next();
            System.out.println(x.id +","+ x.score);
        }

    }
}
