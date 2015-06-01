package com.cepi.data;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "volunteer_activity_t", schema = "", catalog = "cepilive")
public class VolunteerActivityTEntity {
    private int volunteerActivityId;
    private int volunteerId;
    private int volunteerActivityListId;
    private Integer ceApplicationId;

    @Id
    @Column(name = "Volunteer_Activity_ID")
    public int getVolunteerActivityId() {
        return volunteerActivityId;
    }

    public void setVolunteerActivityId(int volunteerActivityId) {
        this.volunteerActivityId = volunteerActivityId;
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
    @Column(name = "Volunteer_Activity_List_ID")
    public int getVolunteerActivityListId() {
        return volunteerActivityListId;
    }

    public void setVolunteerActivityListId(int volunteerActivityListId) {
        this.volunteerActivityListId = volunteerActivityListId;
    }

    @Basic
    @Column(name = "CE_Application_ID")
    public Integer getCeApplicationId() {
        return ceApplicationId;
    }

    public void setCeApplicationId(Integer ceApplicationId) {
        this.ceApplicationId = ceApplicationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolunteerActivityTEntity that = (VolunteerActivityTEntity) o;

        if (volunteerActivityId != that.volunteerActivityId) return false;
        if (volunteerActivityListId != that.volunteerActivityListId) return false;
        if (volunteerId != that.volunteerId) return false;
        if (ceApplicationId != null ? !ceApplicationId.equals(that.ceApplicationId) : that.ceApplicationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerActivityId;
        result = 31 * result + volunteerId;
        result = 31 * result + volunteerActivityListId;
        result = 31 * result + (ceApplicationId != null ? ceApplicationId.hashCode() : 0);
        return result;
    }
}
