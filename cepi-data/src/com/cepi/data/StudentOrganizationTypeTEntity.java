package com.cepi.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "student_organization_type_t", schema = "", catalog = "cepilive")
public class StudentOrganizationTypeTEntity {
    private int studentOrganizationTypeId;
    private int studentId;
    private String organizationType;
    private String note;

    @Basic
    @Column(name = "Student_Organization_Type_ID")
    public int getStudentOrganizationTypeId() {
        return studentOrganizationTypeId;
    }

    public void setStudentOrganizationTypeId(int studentOrganizationTypeId) {
        this.studentOrganizationTypeId = studentOrganizationTypeId;
    }

    @Basic
    @Column(name = "Student_ID")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Organization_Type")
    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
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

        StudentOrganizationTypeTEntity that = (StudentOrganizationTypeTEntity) o;

        if (studentId != that.studentId) return false;
        if (studentOrganizationTypeId != that.studentOrganizationTypeId) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (organizationType != null ? !organizationType.equals(that.organizationType) : that.organizationType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentOrganizationTypeId;
        result = 31 * result + studentId;
        result = 31 * result + (organizationType != null ? organizationType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
