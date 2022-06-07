package br.com.collections;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Receipt {

    private String custumer;
    private double value;


    public Receipt(String custumer, double value) {
        this.custumer = custumer;
        this.value = value;
    }

    public String getCustumer() {
        return custumer;
    }

    public double getValue() {
        return value;
    }


}
