package br.com.test;

import br.com.collections.Course;
import br.com.collections.Student;

public class TestSearch {
    public static void main(String[] args) {
        Course course1 = new Course("Collections", "Paulo");

        Student student1 = new Student("Melissa", 1212);
        Student student2 = new Student("Júlia", 4545);
        Student student3 = new Student("Alice", 7979);
        Student student4 = new Student("Maria", 7979);

        course1.registrateStudent(student1);
        course1.registrateStudent(student2);
        course1.registrateStudent(student3);
        course1.registrateStudent(student4);

        System.out.println("Search result:");
        System.out.println(course1.searchStudent(7979));
    }
}
