package com.cepi.repo;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "volunteer_application_t", schema = "", catalog = "cepilive")
public class VolunteerApplicationTEntity {
    private int volunteerApplicationId;
    private Date applicationDate;
    private String applicationApprovalFlag;
    private Date applicationApprovalDate;
    private Integer performanceScale;
    private String note;
    private String rejectionReason;

    @Id
    @Column(name = "Volunteer_Application_ID")
    public int getVolunteerApplicationId() {
        return volunteerApplicationId;
    }

    public void setVolunteerApplicationId(int volunteerApplicationId) {
        this.volunteerApplicationId = volunteerApplicationId;
    }

    @Basic
    @Column(name = "Application_Date")
    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Basic
    @Column(name = "Application_Approval_Flag")
    public String getApplicationApprovalFlag() {
        return applicationApprovalFlag;
    }

    public void setApplicationApprovalFlag(String applicationApprovalFlag) {
        this.applicationApprovalFlag = applicationApprovalFlag;
    }

    @Basic
    @Column(name = "Application_Approval_Date")
    public Date getApplicationApprovalDate() {
        return applicationApprovalDate;
    }

    public void setApplicationApprovalDate(Date applicationApprovalDate) {
        this.applicationApprovalDate = applicationApprovalDate;
    }

    @Basic
    @Column(name = "Performance_Scale")
    public Integer getPerformanceScale() {
        return performanceScale;
    }

    public void setPerformanceScale(Integer performanceScale) {
        this.performanceScale = performanceScale;
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
    @Column(name = "Rejection_Reason")
    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolunteerApplicationTEntity that = (VolunteerApplicationTEntity) o;

        if (volunteerApplicationId != that.volunteerApplicationId) return false;
        if (applicationApprovalDate != null ? !applicationApprovalDate.equals(that.applicationApprovalDate) : that.applicationApprovalDate != null)
            return false;
        if (applicationApprovalFlag != null ? !applicationApprovalFlag.equals(that.applicationApprovalFlag) : that.applicationApprovalFlag != null)
            return false;
        if (applicationDate != null ? !applicationDate.equals(that.applicationDate) : that.applicationDate != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (performanceScale != null ? !performanceScale.equals(that.performanceScale) : that.performanceScale != null)
            return false;
        if (rejectionReason != null ? !rejectionReason.equals(that.rejectionReason) : that.rejectionReason != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerApplicationId;
        result = 31 * result + (applicationDate != null ? applicationDate.hashCode() : 0);
        result = 31 * result + (applicationApprovalFlag != null ? applicationApprovalFlag.hashCode() : 0);
        result = 31 * result + (applicationApprovalDate != null ? applicationApprovalDate.hashCode() : 0);
        result = 31 * result + (performanceScale != null ? performanceScale.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (rejectionReason != null ? rejectionReason.hashCode() : 0);
        return result;
    }
}
