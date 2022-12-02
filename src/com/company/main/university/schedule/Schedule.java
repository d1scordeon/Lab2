package com.company.main.university.schedule;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<SingleScheduleRecord> schedule;

    public Schedule() {
        this.schedule = new ArrayList<>();
    }

    public List<SingleScheduleRecord> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<SingleScheduleRecord> schedule) {
        this.schedule = schedule;
    }
}
