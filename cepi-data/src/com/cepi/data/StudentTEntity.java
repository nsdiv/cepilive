package com.cepi.data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "student_t", schema = "", catalog = "cepilive")
public class StudentTEntity {
    private int studentId;
    private String purposeForEnrollment;
    private String referredBy;
    private String highestEducationLevel;
    private Integer highestLevelPassed;
    private Timestamp lastUpdateDateTime;
    private String note;

    @Id
    @Column(name = "Student_ID")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Purpose_For_Enrollment")
    public String getPurposeForEnrollment() {
        return purposeForEnrollment;
    }

    public void setPurposeForEnrollment(String purposeForEnrollment) {
        this.purposeForEnrollment = purposeForEnrollment;
    }

    @Basic
    @Column(name = "Referred_By")
    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    @Basic
    @Column(name = "Highest_Education_Level")
    public String getHighestEducationLevel() {
        return highestEducationLevel;
    }

    public void setHighestEducationLevel(String highestEducationLevel) {
        this.highestEducationLevel = highestEducationLevel;
    }

    @Basic
    @Column(name = "Highest_Level_Passed")
    public Integer getHighestLevelPassed() {
        return highestLevelPassed;
    }

    public void setHighestLevelPassed(Integer highestLevelPassed) {
        this.highestLevelPassed = highestLevelPassed;
    }

    @Basic
    @Column(name = "Last_Update_Date_Time")
    public Timestamp getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Timestamp lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    @Basic
    @Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentTEntity that = (StudentTEntity) o;

        if (studentId != that.studentId) return false;
        if (highestEducationLevel != null ? !highestEducationLevel.equals(that.highestEducationLevel) : that.highestEducationLevel != null)
            return false;
        if (highestLevelPassed != null ? !highestLevelPassed.equals(that.highestLevelPassed) : that.highestLevelPassed != null)
            return false;
        if (lastUpdateDateTime != null ? !lastUpdateDateTime.equals(that.lastUpdateDateTime) : that.lastUpdateDateTime != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (purposeForEnrollment != null ? !purposeForEnrollment.equals(that.purposeForEnrollment) : that.purposeForEnrollment != null)
            return false;
        if (referredBy != null ? !referredBy.equals(that.referredBy) : that.referredBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (purposeForEnrollment != null ? purposeForEnrollment.hashCode() : 0);
        result = 31 * result + (referredBy != null ? referredBy.hashCode() : 0);
        result = 31 * result + (highestEducationLevel != null ? highestEducationLevel.hashCode() : 0);
        result = 31 * result + (highestLevelPassed != null ? highestLevelPassed.hashCode() : 0);
        result = 31 * result + (lastUpdateDateTime != null ? lastUpdateDateTime.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
