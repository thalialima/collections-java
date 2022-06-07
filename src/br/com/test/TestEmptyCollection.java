package br.com.test;

import br.com.collections.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestEmptyCollection {
    public static void main(String[] args) {
        Set<String> nomes = Collections.emptySet();
       // nomes.add("Paulo"); //o que acontece aqui?

        Student student1 = new Student("Melissa", 1212);
        Student student2 = new Student("Júlia", 4545);
        Student student3 = new Student("Alice", 7878);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Set<Student> studentssynced = Collections.synchronizedSet(students);

        students.add(new Student("Maria Chiquinha", 5858));

        System.out.println("Students:");
        System.out.println(students);
        System.out.println("synced Students:");
        System.out.println(studentssynced);

        System.out.println("Is equals?");
        boolean equals = students.equals(studentssynced);
        System.out.println(equals);

    }
}
