package br.com.collections;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        if(name == null){
            throw new NullPointerException("Field name can't be null");
        }
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override //when we implement equals we must implement hashCode as well
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.name.equals(student.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Student {" +
                "Name = '" + name + '\'' +
                ", Id = " + id +
                '}';
    }
}
