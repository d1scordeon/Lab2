package com.company.main.university.global;

import com.company.main.university.group.Group;
import com.company.main.university.student.Student;

import java.util.ArrayList;
import java.util.List;

public class AllUniversityUnits {
    private static List<Student> allStudents = new ArrayList<>();
    private static List<Group> allGroups = new ArrayList<>();

    public static List<Student> getAllStudents() {
        return allStudents;
    }

    public static void setAllStudents(List<Student> allStudents) {
        AllUniversityUnits.allStudents = allStudents;
    }

    public static List<Group> getAllGroups() {
        return allGroups;
    }

    public static void setAllGroups(List<Group> allGroups) {
        AllUniversityUnits.allGroups = allGroups;
    }
}
