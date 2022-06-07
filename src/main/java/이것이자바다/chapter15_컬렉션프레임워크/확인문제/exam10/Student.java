package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.exam10;

public class Student implements Comparable<Student>{
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(score<o.score) return -1;
        else if(score == o.score) return 0;
        else return 1;
    }
}
