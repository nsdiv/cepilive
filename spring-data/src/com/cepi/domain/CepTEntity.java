package com.cepi.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "cep_t", schema = "", catalog = "cepilive")
public class CepTEntity {
    private int cepId;
    private int studentId;
    private String upToDate;
    private String active;
    private Date dateReceived;
    private Date dueDate;
    private String note;
    private String displayFirstName;
    private String displayLastName;

    @Id
    @Column(name = "Cep_ID")
    public int getCepId() {
        return cepId;
    }

    public void setCepId(int cepId) {
        this.cepId = cepId;
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
    @Column(name = "Up_To_Date")
    public String getUpToDate() {
        return upToDate;
    }

    public void setUpToDate(String upToDate) {
        this.upToDate = upToDate;
    }

    @Basic
    @Column(name = "Active")
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Basic
    @Column(name = "Date_Received")
    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    @Basic
    @Column(name = "Due_Date")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
    @Column(name = "Display_First_Name")
    public String getDisplayFirstName() {
        return displayFirstName;
    }

    public void setDisplayFirstName(String displayFirstName) {
        this.displayFirstName = displayFirstName;
    }

    @Basic
    @Column(name = "Display_Last_Name")
    public String getDisplayLastName() {
        return displayLastName;
    }

    public void setDisplayLastName(String displayLastName) {
        this.displayLastName = displayLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CepTEntity that = (CepTEntity) o;

        if (cepId != that.cepId) return false;
        if (studentId != that.studentId) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (dateReceived != null ? !dateReceived.equals(that.dateReceived) : that.dateReceived != null) return false;
        if (displayFirstName != null ? !displayFirstName.equals(that.displayFirstName) : that.displayFirstName != null)
            return false;
        if (displayLastName != null ? !displayLastName.equals(that.displayLastName) : that.displayLastName != null)
            return false;
        if (dueDate != null ? !dueDate.equals(that.dueDate) : that.dueDate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (upToDate != null ? !upToDate.equals(that.upToDate) : that.upToDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cepId;
        result = 31 * result + studentId;
        result = 31 * result + (upToDate != null ? upToDate.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (dateReceived != null ? dateReceived.hashCode() : 0);
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (displayFirstName != null ? displayFirstName.hashCode() : 0);
        result = 31 * result + (displayLastName != null ? displayLastName.hashCode() : 0);
        return result;
    }
}
