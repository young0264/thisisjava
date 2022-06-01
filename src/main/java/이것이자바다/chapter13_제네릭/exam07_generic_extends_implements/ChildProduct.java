package 이것이자바다.chapter13_제네릭.exam07_generic_extends_implements;

public class ChildProduct<K, V, C> extends Product<K, V> {
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
