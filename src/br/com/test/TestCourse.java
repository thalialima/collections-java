package br.com.test;

import br.com.collections.Course;
import br.com.collections.Lesson;

import java.util.List;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Collections", "Paulo");

        System.out.println(course1.getLessons());

        Lesson lesson1 = new Lesson("Arraylists, how to use it", 20);
        Lesson lesson2 = new Lesson("Object lists", 19);

        course1.addLesson(lesson1);
        course1.addLesson(lesson2);
        System.out.println(course1.getLessons());


    }          
}
