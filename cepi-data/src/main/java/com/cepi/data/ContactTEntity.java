package com.cepi.data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "contact_t", schema = "", catalog = "cepilive")
public class ContactTEntity {
    private int contactId;
    private String region;
    private Date lastMeetingDate;
    private String referredBy;
    private String contactType;
    private Date dateCreated;
    private String note;

    @Id
    @Column(name = "Contact_ID")
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Basic
    @Column(name = "Region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "Last_Meeting_Date")
    public Date getLastMeetingDate() {
        return lastMeetingDate;
    }

    public void setLastMeetingDate(Date lastMeetingDate) {
        this.lastMeetingDate = lastMeetingDate;
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
    @Column(name = "Contact_Type")
    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @Basic
    @Column(name = "Date_Created")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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

        ContactTEntity that = (ContactTEntity) o;

        if (contactId != that.contactId) return false;
        if (contactType != null ? !contactType.equals(that.contactType) : that.contactType != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (lastMeetingDate != null ? !lastMeetingDate.equals(that.lastMeetingDate) : that.lastMeetingDate != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (referredBy != null ? !referredBy.equals(that.referredBy) : that.referredBy != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactId;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (lastMeetingDate != null ? lastMeetingDate.hashCode() : 0);
        result = 31 * result + (referredBy != null ? referredBy.hashCode() : 0);
        result = 31 * result + (contactType != null ? contactType.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
