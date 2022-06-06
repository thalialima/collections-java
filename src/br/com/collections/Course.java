package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<>();

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

    public void addLesson(Lesson lesson){
        this.getLessons().add(lesson);
    }
}
