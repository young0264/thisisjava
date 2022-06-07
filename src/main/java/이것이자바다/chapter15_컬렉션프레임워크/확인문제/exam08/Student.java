package 이것이자바다.chapter15_컬렉션프레임워크.확인문제.exam08;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if (studentNum != student.studentNum) return false;
        return true;

    }
}
