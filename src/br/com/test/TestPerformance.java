package br.com.test;

import java.util.*;

public class TestPerformance {

    public static void main(String[] args) {
        //change the collection to test another one
        Collection<Integer> elements = new HashSet<>();


        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            elements.add(i);
        }

        for (Integer element: elements) {
            elements.contains(element);
        }

        long end = System.currentTimeMillis();

        long totalTime = end - begin;

        System.out.println("Tempo que passou em Milisegundos: " + totalTime);

    }
}
