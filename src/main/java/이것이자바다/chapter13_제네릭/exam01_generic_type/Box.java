package 이것이자바다.chapter13_제네릭.exam01_generic_type;

public class Box {
    private Object object;

    public void setter(Object object) {
        this.object = object;
    }

    public Object getter() { //return type  == Object
        return object;
    }
}
