package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(3, "남의영"));

        Iterator<Student> iter = set.iterator();
        while (!iter.hasNext()) {
            Student student = iter.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}
