package br.com.test;

import br.com.collections.Lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLessonsList {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Arraylists, how to use it", 20);
        Lesson lesson2 = new Lesson("Object lists", 19);
        Lesson lesson3 = new Lesson("Relation between lists and objects", 15);

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);
        lessons.add(new Lesson("Equals and Hash code", 10));

        System.out.println(lessons);


        //Collections.sort(lessons);
        //Collections.sort(lessons, Comparator.comparing(Lesson::getTime));
        lessons.sort(Comparator.comparing(Lesson::getTitle));

        System.out.println(lessons);


    }
}
