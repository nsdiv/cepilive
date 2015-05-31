package com.cepi.data;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "volunteer_knowledge_t", schema = "", catalog = "cepilive")
public class VolunteerKnowledgeTEntity {
    private int volunteerKnowledgeId;
    private int volunteerId;
    private String knowledgeArea;
    private String knowledgeLevel;
    private Integer volunteerApplicationId;
    private String note;

    @Id
    @Column(name = "Volunteer_Knowledge_ID")
    public int getVolunteerKnowledgeId() {
        return volunteerKnowledgeId;
    }

    public void setVolunteerKnowledgeId(int volunteerKnowledgeId) {
        this.volunteerKnowledgeId = volunteerKnowledgeId;
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
    @Column(name = "Knowledge_Area")
    public String getKnowledgeArea() {
        return knowledgeArea;
    }

    public void setKnowledgeArea(String knowledgeArea) {
        this.knowledgeArea = knowledgeArea;
    }

    @Basic
    @Column(name = "Knowledge_Level")
    public String getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(String knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
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

        VolunteerKnowledgeTEntity that = (VolunteerKnowledgeTEntity) o;

        if (volunteerId != that.volunteerId) return false;
        if (volunteerKnowledgeId != that.volunteerKnowledgeId) return false;
        if (knowledgeArea != null ? !knowledgeArea.equals(that.knowledgeArea) : that.knowledgeArea != null)
            return false;
        if (knowledgeLevel != null ? !knowledgeLevel.equals(that.knowledgeLevel) : that.knowledgeLevel != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (volunteerApplicationId != null ? !volunteerApplicationId.equals(that.volunteerApplicationId) : that.volunteerApplicationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volunteerKnowledgeId;
        result = 31 * result + volunteerId;
        result = 31 * result + (knowledgeArea != null ? knowledgeArea.hashCode() : 0);
        result = 31 * result + (knowledgeLevel != null ? knowledgeLevel.hashCode() : 0);
        result = 31 * result + (volunteerApplicationId != null ? volunteerApplicationId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
