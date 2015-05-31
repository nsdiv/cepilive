package com.cepi.domain;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "contact_type_t", schema = "", catalog = "cepilive")
public class ContactTypeTEntity {
    private int contactTypeId;
    private String contactType;
    private String note;

    @Id
    @Column(name = "Contact_Type_ID")
    public int getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(int contactTypeId) {
        this.contactTypeId = contactTypeId;
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

        ContactTypeTEntity that = (ContactTypeTEntity) o;

        if (contactTypeId != that.contactTypeId) return false;
        if (contactType != null ? !contactType.equals(that.contactType) : that.contactType != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactTypeId;
        result = 31 * result + (contactType != null ? contactType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
