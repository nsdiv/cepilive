package com.cepi.data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "volunteer_activity_type_t", schema = "", catalog = "cepilive")
public class VolunteerActivityTypeTEntity {
    private int volunteerActivityTypeId;
    private Integer volunteerId;
    private Integer volunteerApplicationId;
    private String activityType;
    private Date startParticitpationDate;
    private Date endParticipationDate;
    private String note;

    @Id
    @Column(name = "Volunteer_Activity_Type_ID")
    public int getVolunteerActivityTypeId() {
        return volunteerActivityTypeId;
    }

    public void setVolunteerActivityTypeId(int volunteerActivityTypeId) {
        this.volunteerActivityTypeId = volunteerActivityTypeId;
    }

    @Basic
    @Column(name = "Volunteer_ID")
    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
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
    @Column(name = "Activity_Type")
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Basic
    @Column(name = "Start_Particitpation_Date")
    public Date getStartParticitpationDate() {
        return startParticitpationDate;
    }

    public void setStartParticitpationDate(Date startParticitpationDate) {
        this.startParticitpationDate = startParticitpationDate;
    }

    @Basic
    @Column(name = "End_Participation_Date")
    public Date getEndParticipationDate() {
        return endParticipationDate;
    }

    public void setEndParticipationDate(Date endParticipationDate) {
        this.endParticipationDate = endParticipationDate;
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

        VolunteerActivityTypeTEntity that = (VolunteerActivityTypeTEntity) o;

        if (volunteerActivityTypeId != that.volunteerActivityTypeId) return false;
        if (activityType != null ? !activityType.equals(that.activityType) : that.activityType != null) return false;
        if (endParticipationDate != null ? !endParticipationDate.equals(that.endParticipationDate) : that.endParticipationDate != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (startParticitpationDate != null ? !startParticitpationDate.equals(that.startParticitpationDate) : that.startParticitpationDate != null)
            return false;
        if (volunteerApplicationId != null ? !volunteerApplicationId.equals(that.volunteerApplicationId) : that.volunteerApplicationId != null)
            return false;
        if (volunteerId != null ? !volunteerId.equals(that.volunteerId) : that.volunteerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerActivityTypeId;
        result = 31 * result + (volunteerId != null ? volunteerId.hashCode() : 0);
        result = 31 * result + (volunteerApplicationId != null ? volunteerApplicationId.hashCode() : 0);
        result = 31 * result + (activityType != null ? activityType.hashCode() : 0);
        result = 31 * result + (startParticitpationDate != null ? startParticitpationDate.hashCode() : 0);
        result = 31 * result + (endParticipationDate != null ? endParticipationDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
