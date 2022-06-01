package 이것이자바다.chapter13_제네릭.exam07_generic_extends_implements;

public class ChildProandStorExam {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTV");
        product.setCompany("Samsung");


        Storage<Tv> storage = new StorageImpl<Tv>(100);
        storage.add(new Tv(),0);
        Tv tv = storage.get(0);

    }
}
