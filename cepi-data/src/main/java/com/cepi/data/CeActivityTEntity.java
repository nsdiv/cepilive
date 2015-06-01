package com.cepi.data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "ce_activity_t", schema = "", catalog = "cepilive")
public class CeActivityTEntity {
    private int ceActivityId;
    private int ceApplicationId;
    private int cepId;
    private Date courseDate;
    private String providerName;
    private String courseTitle;
    private String discipline;
    private String others;
    private BigDecimal numberOfCreditHours;
    private String note;
    private String preApproved;

    @Id
    @Column(name = "Ce_Activity_ID")
    public int getCeActivityId() {
        return ceActivityId;
    }

    public void setCeActivityId(int ceActivityId) {
        this.ceActivityId = ceActivityId;
    }

    @Basic
    @Column(name = "Ce_Application_ID")
    public int getCeApplicationId() {
        return ceApplicationId;
    }

    public void setCeApplicationId(int ceApplicationId) {
        this.ceApplicationId = ceApplicationId;
    }

    @Basic
    @Column(name = "Cep_ID")
    public int getCepId() {
        return cepId;
    }

    public void setCepId(int cepId) {
        this.cepId = cepId;
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
    @Column(name = "Pre_Approved")
    public String getPreApproved() {
        return preApproved;
    }

    public void setPreApproved(String preApproved) {
        this.preApproved = preApproved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CeActivityTEntity that = (CeActivityTEntity) o;

        if (ceActivityId != that.ceActivityId) return false;
        if (ceApplicationId != that.ceApplicationId) return false;
        if (cepId != that.cepId) return false;
        if (courseDate != null ? !courseDate.equals(that.courseDate) : that.courseDate != null) return false;
        if (courseTitle != null ? !courseTitle.equals(that.courseTitle) : that.courseTitle != null) return false;
        if (discipline != null ? !discipline.equals(that.discipline) : that.discipline != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (numberOfCreditHours != null ? !numberOfCreditHours.equals(that.numberOfCreditHours) : that.numberOfCreditHours != null)
            return false;
        if (others != null ? !others.equals(that.others) : that.others != null) return false;
        if (preApproved != null ? !preApproved.equals(that.preApproved) : that.preApproved != null) return false;
        if (providerName != null ? !providerName.equals(that.providerName) : that.providerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ceActivityId;
        result = 31 * result + ceApplicationId;
        result = 31 * result + cepId;
        result = 31 * result + (courseDate != null ? courseDate.hashCode() : 0);
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        result = 31 * result + (courseTitle != null ? courseTitle.hashCode() : 0);
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        result = 31 * result + (others != null ? others.hashCode() : 0);
        result = 31 * result + (numberOfCreditHours != null ? numberOfCreditHours.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (preApproved != null ? preApproved.hashCode() : 0);
        return result;
    }
}
