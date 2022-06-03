package 이것이자바다.chapter15_컬렉션프레임워크.sec02.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam02 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수 : "+set.size());
    }
}
