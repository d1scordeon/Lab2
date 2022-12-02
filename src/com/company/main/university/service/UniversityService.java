package com.company.main.university.service;

import com.company.main.university.assessment.AssessmentJournal;
import com.company.main.university.assessment.AssessmentJournalRecord;
import com.company.main.university.global.AllUniversityUnits;
import com.company.main.university.group.Group;
import com.company.main.university.schedule.Schedule;
import com.company.main.university.schedule.SingleScheduleRecord;
import com.company.main.university.student.Student;
import com.company.main.university.subject.Subject;

import java.util.Date;
import java.util.Optional;

public class UniversityService {
    public void addSubjectToAllStudentsInGroup(Group group, Subject subject) {
        group.getStudents().forEach(student -> student.getSubjects().add(subject));
    }

    public void addNewRecordToSchedule(Schedule schedule, Subject subject, Group group, Date date) {
        schedule.getSchedule().add(new SingleScheduleRecord(group, subject, date));
    }

    public void printAllStudentsInAlphabeticalOrder() {
        AllUniversityUnits.getAllStudents().stream().map(Student::getName).sorted().forEach(System.out::println);
    }

    public void printAllStudentsThatVisitSpecificSubject(Subject subject) {
        AllUniversityUnits.getAllGroups().stream().flatMap(group -> group.getStudents().stream())
                .filter(student -> student.getSubjects().contains(subject))
                .forEach(System.out::println);
    }

    public void addOrUpdateStudentMark(String studentName, Subject subject, int mark) {
        Optional<AssessmentJournalRecord> studentOptional = AssessmentJournal.getAssessmentJournalRecords().stream()
                .filter(assessmentJournalRecord -> assessmentJournalRecord.getStudent().getName().equals(studentName)
                        && assessmentJournalRecord.getSubject().equals(subject))
                .findFirst();
        if (studentOptional.isPresent()) {
            studentOptional.get().setMark(mark);
        } else {
            Student presentStudent = AllUniversityUnits.getAllStudents().stream()
                    .filter(student -> student.getName().equals(studentName))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(String.format("There is no such student with name %s", studentName)));
            AssessmentJournal.getAssessmentJournalRecords().add(new AssessmentJournalRecord(presentStudent, subject, mark));
        }
    }

    public void deleteStudentMark(String studentName, Subject subject) {
        Student presentStudent = AllUniversityUnits.getAllStudents().stream()
                .filter(student -> student.getName().equals(studentName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("There is no such student with name %s", studentName)));
        AssessmentJournal.getAssessmentJournalRecords().removeIf(assessmentJournalRecord -> assessmentJournalRecord.getStudent().equals(presentStudent) &&
                assessmentJournalRecord.getSubject().equals(subject));
    }

    public void printAllStudentsMarks() {
        AssessmentJournal.getAssessmentJournalRecords().forEach(System.out::println);
    }

    public void printAllStudentMarks(String studentName) {
        AssessmentJournal.getAssessmentJournalRecords().stream()
                .filter(assessmentJournalRecord -> assessmentJournalRecord.getStudent().getName().equals(studentName))
                .forEach(System.out::println);
    }

    public void printAllSubjectMarks(String subjectName) {
        AssessmentJournal.getAssessmentJournalRecords().stream()
                .filter(assessmentJournalRecord -> assessmentJournalRecord.getSubject().getName().equals(subjectName))
                .forEach(System.out::println);
    }
 }
