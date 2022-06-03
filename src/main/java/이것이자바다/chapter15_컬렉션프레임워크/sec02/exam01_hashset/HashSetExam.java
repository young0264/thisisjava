package 이것이자바다.chapter15_컬렉션프레임워크.sec02.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBatis");

        int size = set.size();
        System.out.println("총객체수 : "+size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        set.remove("JDBC");
        set.remove("iBatis");
        System.out.println("총객체수 : "+set.size());

        System.out.println();
        for (String e : set) {
            System.out.println(e);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println(8080);
        }

    }
}
