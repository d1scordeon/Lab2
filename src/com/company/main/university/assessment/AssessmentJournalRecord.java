package com.company.main.university.assessment;

import com.company.main.university.student.Student;
import com.company.main.university.subject.Subject;

public class AssessmentJournalRecord {
    private Student student;
    private Subject subject;
    private int mark;

    public AssessmentJournalRecord(Student student, Subject subject, int mark) {
        this.student = student;
        this.subject = subject;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "AssessmentJournalRecord{" +
                "student=" + student +
                ", subject=" + subject +
                ", mark=" + mark +
                '}';
    }
}
