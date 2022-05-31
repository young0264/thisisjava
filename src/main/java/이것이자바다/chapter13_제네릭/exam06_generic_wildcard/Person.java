package 이것이자바다.chapter13_제네릭.exam06_generic_wildcard;

public class Person {
    private String name;

    public Person(String name) {this.name = name;}

    public String getName() {return name;}

    @Override
    public String toString() {return name;}
}
