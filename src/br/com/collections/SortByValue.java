package br.com.collections;

import java.util.Comparator;

public class SortByValue implements Comparator<Receipt> {
    @Override
    public int compare(Receipt o1, Receipt o2) {
        return (int) (o1.getValue() - o2.getValue());
    }
}
