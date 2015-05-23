package com.cepi.repo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "examination_location_t", schema = "", catalog = "cepilive")
public class ExaminationLocationTEntity {
    private int examLocationId;
    private Timestamp systemDateTime;
    private String locationName;
    private String note;

    @Id
    @Column(name = "Exam_Location_ID")
    public int getExamLocationId() {
        return examLocationId;
    }

    public void setExamLocationId(int examLocationId) {
        this.examLocationId = examLocationId;
    }

    @Basic
    @Column(name = "System_Date_Time")
    public Timestamp getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(Timestamp systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    @Basic
    @Column(name = "Location_Name")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
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

        ExaminationLocationTEntity that = (ExaminationLocationTEntity) o;

        if (examLocationId != that.examLocationId) return false;
        if (locationName != null ? !locationName.equals(that.locationName) : that.locationName != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (systemDateTime != null ? !systemDateTime.equals(that.systemDateTime) : that.systemDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examLocationId;
        result = 31 * result + (systemDateTime != null ? systemDateTime.hashCode() : 0);
        result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
