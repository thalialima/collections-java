package br.com.test;

import br.com.collections.Receipt;
import br.com.collections.SortByValue;

import java.util.Iterator;
import java.util.TreeSet;

public class TestReceipt {
    public static void main(String[] args) {
        Receipt rec1 = new Receipt("Thalia", 789);
        Receipt rec2 = new Receipt("Irene", 234);
        Receipt rec3 = new Receipt("Geralt", 123);

        TreeSet<Receipt> treeSet = new TreeSet<>(new SortByValue());
        treeSet.add(rec1);
        treeSet.add(rec2);
        treeSet.add(rec3);

        Iterator<Receipt> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getCustumer());
        }

    }

}
