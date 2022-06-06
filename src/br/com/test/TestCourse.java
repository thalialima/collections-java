package br.com.test;

import br.com.collections.Course;
import br.com.collections.Lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Collections", "Paulo");

         System.out.println(course1.getLessons());   

        Lesson lesson2 = new Lesson("Object lists", 19);
        Lesson lesson1 = new Lesson("Arraylists, how to use it", 20);

        course1.addLesson(lesson2);
        course1.addLesson(lesson1);

        System.out.println(course1.getLessons());

        List<Lesson> lessonsUnchanged = course1.getLessons();

        List<Lesson> lessonsTemp = new ArrayList<>(lessonsUnchanged);

        Collections.sort(lessonsTemp);

        System.out.println(lessonsTemp);

        System.out.println("Total course time: " + course1.getTotalTime() + " min.");

        System.out.println(course1);
    }          
}
