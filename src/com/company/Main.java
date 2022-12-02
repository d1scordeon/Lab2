package com.company;

import com.company.main.university.group.Group;
import com.company.main.university.schedule.Schedule;
import com.company.main.university.service.UniversityService;
import com.company.main.university.student.Student;
import com.company.main.university.subject.Subject;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Petro");
        Student student1 = new Student("Oleh");
        Student student2 = new Student("Pavlo");

        Group group = new Group("SomeGroup");
        group.setStudents(Arrays.asList(student, student1, student2));

        Subject subject = new Subject("PP", "Lecturer");

        Schedule schedule = new Schedule();

        UniversityService universityService = new UniversityService();
        universityService.addSubjectToAllStudentsInGroup(group, subject);
        universityService.addNewRecordToSchedule(schedule, subject, group, new Date());
        universityService.printAllStudentsInAlphabeticalOrder();
        universityService.printAllStudentsThatVisitSpecificSubject(subject);
        universityService.addOrUpdateStudentMark("Petro", subject, 10);
        universityService.printAllStudentMarks("Petro");
        universityService.addOrUpdateStudentMark("Petro", subject, 100);
        universityService.printAllStudentMarks("Petro");
        universityService.deleteStudentMark("Petro", subject);
        universityService.printAllStudentMarks("Petro");
        universityService.addOrUpdateStudentMark("Oleh", subject, 100);
        universityService.addOrUpdateStudentMark("Petro", subject, 100);
        universityService.printAllStudentsMarks();
        universityService.printAllSubjectMarks(subject.getName());
    }
}
