package com.cepi.data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "contact_source_t", schema = "", catalog = "cepilive")
public class ContactSourceTEntity {
    private int contactSourceId;
    private int contactId;
    private String contactSourceWhere;
    private Date contactSourceWhen;
    private String note;

    @Id
    @Column(name = "Contact_Source_ID")
    public int getContactSourceId() {
        return contactSourceId;
    }

    public void setContactSourceId(int contactSourceId) {
        this.contactSourceId = contactSourceId;
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
    @Column(name = "Contact_Source_Where")
    public String getContactSourceWhere() {
        return contactSourceWhere;
    }

    public void setContactSourceWhere(String contactSourceWhere) {
        this.contactSourceWhere = contactSourceWhere;
    }

    @Basic
    @Column(name = "Contact_Source_When")
    public Date getContactSourceWhen() {
        return contactSourceWhen;
    }

    public void setContactSourceWhen(Date contactSourceWhen) {
        this.contactSourceWhen = contactSourceWhen;
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

        ContactSourceTEntity that = (ContactSourceTEntity) o;

        if (contactId != that.contactId) return false;
        if (contactSourceId != that.contactSourceId) return false;
        if (contactSourceWhen != null ? !contactSourceWhen.equals(that.contactSourceWhen) : that.contactSourceWhen != null)
            return false;
        if (contactSourceWhere != null ? !contactSourceWhere.equals(that.contactSourceWhere) : that.contactSourceWhere != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactSourceId;
        result = 31 * result + contactId;
        result = 31 * result + (contactSourceWhere != null ? contactSourceWhere.hashCode() : 0);
        result = 31 * result + (contactSourceWhen != null ? contactSourceWhen.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
