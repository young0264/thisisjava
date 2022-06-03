package 이것이자바다.chapter15_컬렉션프레임워크.sec02.exam01_hashset;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && member.age == age;
        }else{
            return false;
        }
    }

    public int hashCode() {
        return name.hashCode() + age;
        //return Objects.hash(name, age);
    }
}
