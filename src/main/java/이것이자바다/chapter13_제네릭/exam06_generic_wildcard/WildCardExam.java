package 이것이자바다.chapter13_제네릭.exam06_generic_wildcard;

import java.util.Arrays;

public class WildCardExam {

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseStudent(Course<? extends Student> course) { //최상위계층이 Student
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));

    }
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));

    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생만"));
//        highStudent.add(new Student("고등학생만"));


        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);
//        registerCourseWorker(highStudentCourse);



    }
}
