package com.cepi.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "contact_correspondence_t", schema = "", catalog = "cepilive")
public class ContactCorrespondenceTEntity {
    private int contactCorrespondenceId;
    private int contactId;
    private String correspondenceType;
    private Date correspondenceDate;
    private String correspondenceTime;
    private String subject;
    private String note;

    @Id
    @Column(name = "Contact_Correspondence_ID")
    public int getContactCorrespondenceId() {
        return contactCorrespondenceId;
    }

    public void setContactCorrespondenceId(int contactCorrespondenceId) {
        this.contactCorrespondenceId = contactCorrespondenceId;
    }

    @Basic
    @Column(name = "Contact_ID")
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Basic
    @Column(name = "Correspondence_Type")
    public String getCorrespondenceType() {
        return correspondenceType;
    }

    public void setCorrespondenceType(String correspondenceType) {
        this.correspondenceType = correspondenceType;
    }

    @Basic
    @Column(name = "Correspondence_Date")
    public Date getCorrespondenceDate() {
        return correspondenceDate;
    }

    public void setCorrespondenceDate(Date correspondenceDate) {
        this.correspondenceDate = correspondenceDate;
    }

    @Basic
    @Column(name = "Correspondence_Time")
    public String getCorrespondenceTime() {
        return correspondenceTime;
    }

    public void setCorrespondenceTime(String correspondenceTime) {
        this.correspondenceTime = correspondenceTime;
    }

    @Basic
    @Column(name = "Subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

        ContactCorrespondenceTEntity that = (ContactCorrespondenceTEntity) o;

        if (contactCorrespondenceId != that.contactCorrespondenceId) return false;
        if (contactId != that.contactId) return false;
        if (correspondenceDate != null ? !correspondenceDate.equals(that.correspondenceDate) : that.correspondenceDate != null)
            return false;
        if (correspondenceTime != null ? !correspondenceTime.equals(that.correspondenceTime) : that.correspondenceTime != null)
            return false;
        if (correspondenceType != null ? !correspondenceType.equals(that.correspondenceType) : that.correspondenceType != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactCorrespondenceId;
        result = 31 * result + contactId;
        result = 31 * result + (correspondenceType != null ? correspondenceType.hashCode() : 0);
        result = 31 * result + (correspondenceDate != null ? correspondenceDate.hashCode() : 0);
        result = 31 * result + (correspondenceTime != null ? correspondenceTime.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
