package 이것이자바다.chapter13_제네릭.exam03_multitype_parameter;

public class Product<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
