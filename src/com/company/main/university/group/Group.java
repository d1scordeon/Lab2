package com.company.main.university.group;

import com.company.main.university.global.AllUniversityUnits;
import com.company.main.university.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        if (!AllUniversityUnits.getAllGroups().contains(this)) {
            AllUniversityUnits.getAllGroups().add(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return name.equals(group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
