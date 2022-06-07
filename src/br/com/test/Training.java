package br.com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Training {
    public static void printStudents(Map<Integer, String> people){
        Set<Integer> integers = people.keySet();
        integers.forEach(i -> {
            System.out.println(people.get(i));
        });
    }


    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();

        people.put(21, "Leonardo Cordeiro");
        people.put(27, "Fabio Pimentel");
        people.put(19, "Silvio Mattos");
        people.put(23, "Romulo Henrique");

        printStudents(people);

    }
}
