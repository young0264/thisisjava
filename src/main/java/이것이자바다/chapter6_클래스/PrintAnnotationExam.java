package 이것이자바다.chapter6_클래스;

import java.lang.reflect.Method;

public class PrintAnnotationExam {
    public static void main(String[] args) {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
                System.out.println("getname" + "[" + method.getName() + "]" + "적용돠어있음");

                for (int i = 0; i < printAnnotation.numbers(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();
            } else {
                System.out.println("[" + method.getName() + "]" + "적용돠어있지않음");
            }

            try {
                method.invoke(new Service());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
