package br.com.test;

import br.com.collections.Course;
import br.com.collections.Lesson;
import br.com.collections.Student;

public class TestCourseStudent {
    public static void main(String[] args) {
        Course course1 = new Course("Collections", "Paulo");

        System.out.println(course1.getLessons());

        Lesson lesson2 = new Lesson("Object lists", 19);
        Lesson lesson1 = new Lesson("Arraylists, how to use it", 20);

        course1.addLesson(lesson2);
        course1.addLesson(lesson1);

        Student student1 = new Student("Melissa", 1212);
        Student student2 = new Student("Júlia", 4545);
        Student student3 = new Student("Alice", 7878);

        course1.registrateStudent(student1);
        course1.registrateStudent(student2);
        course1.registrateStudent(student3);

        System.out.println("All students from this course: ");
        course1.getStudents().forEach(s -> {
            System.out.println(s.toString());
        });

        course1.registrateStudent(new Student("Victor", 9696));
        course1.registrateStudent(new Student("Ana", 3636));

        System.out.println("All students from this course, updated: ");
        System.out.println(course1.getStudents());

        course1.getStudents().add(new Student("Pedro", 4545));


    }
}
