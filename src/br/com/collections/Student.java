package br.com.collections;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Name = '" + name + '\'' +
                ", Id = " + id +
                '}';
    }
}
