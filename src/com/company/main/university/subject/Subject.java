package com.company.main.university.subject;

import java.util.Objects;

public class Subject {
    private String name;
    private String lecturer;

    public Subject(String name, String lecturer) {
        this.name = name;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", lecturer='" + lecturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return name.equals(subject.name) &&
                lecturer.equals(subject.lecturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lecturer);
    }
}
