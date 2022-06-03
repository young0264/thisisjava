package 이것이자바다.chapter15_컬렉션프레임워크.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.set(2, "Database");
        //list.add(2, "Database");
        list.add("iBatis");

        int s = list.size();
        System.out.println(list);
        System.out.println(s);

        String skill = list.get(2);
        System.out.println(skill);
        System.out.println();
        for (String ss : list) {
            System.out.println(ss);
        }
        System.out.println();

        String x = list.remove(2);
        System.out.println(x);
        list.remove("iBatis");
        System.out.println(list);
    }
}
