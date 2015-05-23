package com.cepi.repo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "ce_activity_list_t", schema = "", catalog = "cepilive")
public class CeActivityListTEntity {
    private int ceActivityId;
    private Date courseDate;
    private String providerName;
    private String courseTitle;
    private String discipline;
    private String others;
    private BigDecimal numberOfCreditHours;
    private String note;
    private String isActive;
    private String event;

    @Id
    @Column(name = "Ce_Activity_ID")
    public int getCeActivityId() {
        return ceActivityId;
    }

    public void setCeActivityId(int ceActivityId) {
        this.ceActivityId = ceActivityId;
    }

    @Basic
    @Column(name = "Course_Date")
    public Date getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Date courseDate) {
        this.courseDate = courseDate;
    }

    @Basic
    @Column(name = "Provider_Name")
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Basic
    @Column(name = "Course_Title")
    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Basic
    @Column(name = "Discipline")
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Basic
    @Column(name = "Others")
    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Basic
    @Column(name = "Number_of_Credit_Hours")
    public BigDecimal getNumberOfCreditHours() {
        return numberOfCreditHours;
    }

    public void setNumberOfCreditHours(BigDecimal numberOfCreditHours) {
        this.numberOfCreditHours = numberOfCreditHours;
    }

    @Basic
    @Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "Is_Active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "Event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CeActivityListTEntity that = (CeActivityListTEntity) o;

        if (ceActivityId != that.ceActivityId) return false;
        if (courseDate != null ? !courseDate.equals(that.courseDate) : that.courseDate != null) return false;
        if (courseTitle != null ? !courseTitle.equals(that.courseTitle) : that.courseTitle != null) return false;
        if (discipline != null ? !discipline.equals(that.discipline) : that.discipline != null) return false;
        if (event != null ? !event.equals(that.event) : that.event != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (numberOfCreditHours != null ? !numberOfCreditHours.equals(that.numberOfCreditHours) : that.numberOfCreditHours != null)
            return false;
        if (others != null ? !others.equals(that.others) : that.others != null) return false;
        if (providerName != null ? !providerName.equals(that.providerName) : that.providerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ceActivityId;
        result = 31 * result + (courseDate != null ? courseDate.hashCode() : 0);
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        result = 31 * result + (courseTitle != null ? courseTitle.hashCode() : 0);
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        result = 31 * result + (others != null ? others.hashCode() : 0);
        result = 31 * result + (numberOfCreditHours != null ? numberOfCreditHours.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (event != null ? event.hashCode() : 0);
        return result;
    }
}
