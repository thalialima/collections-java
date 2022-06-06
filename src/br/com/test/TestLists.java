package br.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestLists {
    public static void main(String[] args) {
        String firstClass = "Learn more about Lists";
        String secondClass = "Model class class";
        String thirdClass = "Work with Courses and Sets";

        ArrayList<String> classes = new ArrayList<>();
        classes.add(firstClass);
        classes.add(secondClass);
        classes.add(thirdClass);

        System.out.println(classes);

        classes.remove(0);
        System.out.println(classes);

        for (String myClass : classes) {
            System.out.println("Class: " + myClass);
        }

        String element = classes.get(1);
        System.out.println("Elemento: " + element);

        classes.forEach(aula -> {
            System.out.println("Testando lambda");
            System.out.println("Percorrendo: " + aula );
        });

        classes.add(firstClass);

        System.out.println("Before sort: ");
        System.out.println(classes);

        Collections.sort(classes);

        System.out.println("After sort: ");
        System.out.println(classes);
    }
}
