package com.cepi.repo;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "volunteer_interest_t", schema = "", catalog = "cepilive")
public class VolunteerInterestTEntity {
    private int volunteerInterestId;
    private String interestType;
    private String note;

    @Id
    @Column(name = "Volunteer_Interest_ID")
    public int getVolunteerInterestId() {
        return volunteerInterestId;
    }

    public void setVolunteerInterestId(int volunteerInterestId) {
        this.volunteerInterestId = volunteerInterestId;
    }

    @Basic
    @Column(name = "Interest_Type")
    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
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

        VolunteerInterestTEntity that = (VolunteerInterestTEntity) o;

        if (volunteerInterestId != that.volunteerInterestId) return false;
        if (interestType != null ? !interestType.equals(that.interestType) : that.interestType != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerInterestId;
        result = 31 * result + (interestType != null ? interestType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
