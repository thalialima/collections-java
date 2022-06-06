package br.com.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {

        //Set is also a collection (é um conjunto)
        //for search HashSet is faster than List
        Collection<String> students = new HashSet<>();

        students.add("Thalia");
        students.add("Irene");
        students.add("Nico");
        students.add("Paulo");
        students.add("Sérgio");
        students.add("Sérgio"); // Set doesn't accept duplicated elements

        //We can't be sure about the order of its elements
        //That's why we don't heve access methods like .get(index) and .sort() for this Collection
        System.out.println(students);
        System.out.println("Number of students: " + students.size());

        //al collections have this method
        boolean contains = students.contains("Thalia");

        System.out.println("Is thalia in the list? " + contains);

    }
}
