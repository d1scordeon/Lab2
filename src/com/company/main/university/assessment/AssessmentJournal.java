package com.company.main.university.assessment;

import java.util.ArrayList;
import java.util.List;

public class AssessmentJournal {
    private static List<AssessmentJournalRecord> assessmentJournalRecords = new ArrayList<>();

    public static List<AssessmentJournalRecord> getAssessmentJournalRecords() {
        return assessmentJournalRecords;
    }

    public static void setAssessmentJournalRecords(List<AssessmentJournalRecord> assessmentJournalRecords) {
        AssessmentJournal.assessmentJournalRecords = assessmentJournalRecords;
    }
}
