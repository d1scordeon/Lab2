package com.company.main.university.student;

import com.company.main.university.global.AllUniversityUnits;
import com.company.main.university.subject.Subject;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new HashSet<>();
        if (!AllUniversityUnits.getAllStudents().contains(this)) {
            AllUniversityUnits.getAllStudents().add(this);
        }
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
