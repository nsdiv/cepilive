package com.cepi.data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "volunteer_material_sent_info_t", schema = "", catalog = "cepilive")
public class VolunteerMaterialSentInfoTEntity {
    private int volunteerMaterialSentInfoId;
    private int volunteerId;
    private Date volunteerMaterialSentDate;
    private Integer volunteerApplicationId;
    private Integer level;
    private String note;

    @Id
    @Column(name = "Volunteer_Material_Sent_Info_ID")
    public int getVolunteerMaterialSentInfoId() {
        return volunteerMaterialSentInfoId;
    }

    public void setVolunteerMaterialSentInfoId(int volunteerMaterialSentInfoId) {
        this.volunteerMaterialSentInfoId = volunteerMaterialSentInfoId;
    }

    @Basic
    @Column(name = "Volunteer_ID")
    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    @Basic
    @Column(name = "Volunteer_Material_Sent_Date")
    public Date getVolunteerMaterialSentDate() {
        return volunteerMaterialSentDate;
    }

    public void setVolunteerMaterialSentDate(Date volunteerMaterialSentDate) {
        this.volunteerMaterialSentDate = volunteerMaterialSentDate;
    }

    @Basic
    @Column(name = "Volunteer_Application_ID")
    public Integer getVolunteerApplicationId() {
        return volunteerApplicationId;
    }

    public void setVolunteerApplicationId(Integer volunteerApplicationId) {
        this.volunteerApplicationId = volunteerApplicationId;
    }

    @Basic
    @Column(name = "Level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

        VolunteerMaterialSentInfoTEntity that = (VolunteerMaterialSentInfoTEntity) o;

        if (volunteerId != that.volunteerId) return false;
        if (volunteerMaterialSentInfoId != that.volunteerMaterialSentInfoId) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (volunteerApplicationId != null ? !volunteerApplicationId.equals(that.volunteerApplicationId) : that.volunteerApplicationId != null)
            return false;
        if (volunteerMaterialSentDate != null ? !volunteerMaterialSentDate.equals(that.volunteerMaterialSentDate) : that.volunteerMaterialSentDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerMaterialSentInfoId;
        result = 31 * result + volunteerId;
        result = 31 * result + (volunteerMaterialSentDate != null ? volunteerMaterialSentDate.hashCode() : 0);
        result = 31 * result + (volunteerApplicationId != null ? volunteerApplicationId.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
