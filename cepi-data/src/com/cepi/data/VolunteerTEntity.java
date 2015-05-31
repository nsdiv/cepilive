package com.cepi.data;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "volunteer_t", schema = "", catalog = "cepilive")
public class VolunteerTEntity {
    private int volunteerId;
    private Integer cepId;
    private String college1;
    private String degree1;
    private String major1;
    private String college2;
    private String degree2;
    private String major2;
    private String volunteerInterest;
    private String sampleItem;
    private String approvalFlag;
    private String note;

    @Id
    @Column(name = "Volunteer_ID")
    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    @Basic
    @Column(name = "Cep_ID")
    public Integer getCepId() {
        return cepId;
    }

    public void setCepId(Integer cepId) {
        this.cepId = cepId;
    }

    @Basic
    @Column(name = "College1")
    public String getCollege1() {
        return college1;
    }

    public void setCollege1(String college1) {
        this.college1 = college1;
    }

    @Basic
    @Column(name = "Degree1")
    public String getDegree1() {
        return degree1;
    }

    public void setDegree1(String degree1) {
        this.degree1 = degree1;
    }

    @Basic
    @Column(name = "Major1")
    public String getMajor1() {
        return major1;
    }

    public void setMajor1(String major1) {
        this.major1 = major1;
    }

    @Basic
    @Column(name = "College2")
    public String getCollege2() {
        return college2;
    }

    public void setCollege2(String college2) {
        this.college2 = college2;
    }

    @Basic
    @Column(name = "Degree2")
    public String getDegree2() {
        return degree2;
    }

    public void setDegree2(String degree2) {
        this.degree2 = degree2;
    }

    @Basic
    @Column(name = "Major2")
    public String getMajor2() {
        return major2;
    }

    public void setMajor2(String major2) {
        this.major2 = major2;
    }

    @Basic
    @Column(name = "Volunteer_Interest")
    public String getVolunteerInterest() {
        return volunteerInterest;
    }

    public void setVolunteerInterest(String volunteerInterest) {
        this.volunteerInterest = volunteerInterest;
    }

    @Basic
    @Column(name = "Sample_Item")
    public String getSampleItem() {
        return sampleItem;
    }

    public void setSampleItem(String sampleItem) {
        this.sampleItem = sampleItem;
    }

    @Basic
    @Column(name = "Approval_Flag")
    public String getApprovalFlag() {
        return approvalFlag;
    }

    public void setApprovalFlag(String approvalFlag) {
        this.approvalFlag = approvalFlag;
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

        VolunteerTEntity that = (VolunteerTEntity) o;

        if (volunteerId != that.volunteerId) return false;
        if (approvalFlag != null ? !approvalFlag.equals(that.approvalFlag) : that.approvalFlag != null) return false;
        if (cepId != null ? !cepId.equals(that.cepId) : that.cepId != null) return false;
        if (college1 != null ? !college1.equals(that.college1) : that.college1 != null) return false;
        if (college2 != null ? !college2.equals(that.college2) : that.college2 != null) return false;
        if (degree1 != null ? !degree1.equals(that.degree1) : that.degree1 != null) return false;
        if (degree2 != null ? !degree2.equals(that.degree2) : that.degree2 != null) return false;
        if (major1 != null ? !major1.equals(that.major1) : that.major1 != null) return false;
        if (major2 != null ? !major2.equals(that.major2) : that.major2 != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (sampleItem != null ? !sampleItem.equals(that.sampleItem) : that.sampleItem != null) return false;
        if (volunteerInterest != null ? !volunteerInterest.equals(that.volunteerInterest) : that.volunteerInterest != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerId;
        result = 31 * result + (cepId != null ? cepId.hashCode() : 0);
        result = 31 * result + (college1 != null ? college1.hashCode() : 0);
        result = 31 * result + (degree1 != null ? degree1.hashCode() : 0);
        result = 31 * result + (major1 != null ? major1.hashCode() : 0);
        result = 31 * result + (college2 != null ? college2.hashCode() : 0);
        result = 31 * result + (degree2 != null ? degree2.hashCode() : 0);
        result = 31 * result + (major2 != null ? major2.hashCode() : 0);
        result = 31 * result + (volunteerInterest != null ? volunteerInterest.hashCode() : 0);
        result = 31 * result + (sampleItem != null ? sampleItem.hashCode() : 0);
        result = 31 * result + (approvalFlag != null ? approvalFlag.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
