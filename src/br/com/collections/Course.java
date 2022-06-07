package br.com.collections;

import java.util.*;

public class Course {
    private String name;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<>();
    private Set<Student> students = new HashSet<>();

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Lesson> getLessons() {
        return Collections.unmodifiableList(this.lessons); //read only
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public int getTotalTime() {
        return this.lessons.stream().mapToInt(Lesson::getTime).sum();
    }

    public boolean registrateStudent(Student student){
        return this.students.add(student);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students); //this collection can't be updated
    }

    @Override
    public String toString() {
        return "Course { " +
                "Name = '" + name + '\'' +
                ", Teacher = '" + teacher + '\'' +
                ", Total time = " + this.getTotalTime() +
                " min. }";
    }
}
