package 이것이자바다.chapter14_람다식.exam01_Noargu_noreturn;

public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };

        fi.method123();

        fi = () -> System.out.println("method call2");
        fi.method123();

        fi = new MyFunctionalInterface() {
            @Override
            public void method123() {
                System.out.println("method call4");
            }
        };
        fi.method123();
    }
}
