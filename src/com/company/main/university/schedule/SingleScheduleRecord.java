package com.company.main.university.schedule;

import com.company.main.university.group.Group;
import com.company.main.university.subject.Subject;

import java.util.Date;

public class SingleScheduleRecord {
    private Group group;
    private Subject subject;
    private Date date;

    public SingleScheduleRecord(Group group, Subject subject, Date date) {
        this.group = group;
        this.subject = subject;
        this.date = date;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
