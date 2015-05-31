package com.cepi.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "volunteer_activity_list_t", schema = "", catalog = "cepilive")
public class VolunteerActivityListTEntity {
    private int volunteerActivityListId;
    private String title;
    private Date date;
    private int hours;
    private String note;

    @Id
    @Column(name = "Volunteer_Activity_List_ID")
    public int getVolunteerActivityListId() {
        return volunteerActivityListId;
    }

    public void setVolunteerActivityListId(int volunteerActivityListId) {
        this.volunteerActivityListId = volunteerActivityListId;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Hours")
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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

        VolunteerActivityListTEntity that = (VolunteerActivityListTEntity) o;

        if (hours != that.hours) return false;
        if (volunteerActivityListId != that.volunteerActivityListId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerActivityListId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + hours;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
