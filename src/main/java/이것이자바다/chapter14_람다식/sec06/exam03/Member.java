package 이것이자바다.chapter14_람다식.sec06.exam03;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("Member()실행");
    }

    public Member(String id) {
        System.out.println("Member(String id)실행");
        this.id = id;
    }

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Member(String " +this.name +" String "+ this.id+" )실행 ");
    }
}
