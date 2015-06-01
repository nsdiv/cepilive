package com.cepi.data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "administrator_t", schema = "", catalog = "cepilive")
public class AdministratorTEntity {
    private int adminId;
    private String firstName;
    private String lastName;
    private String adminUsername;
    private String adminPassword;
    private String phoneNumber;
    private String emailAddress;
    private Timestamp timeStamp;
    private String note;
    private Integer privileges;

    @Id
    @Column(name = "Admin_ID")
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "First_Name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "Last_Name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Admin_Username")
    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    @Basic
    @Column(name = "Admin_Password")
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Basic
    @Column(name = "Phone_Number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "Email_Address")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "Time_Stamp")
    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Basic
    @Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "Privileges")
    public Integer getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Integer privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdministratorTEntity that = (AdministratorTEntity) o;

        if (adminId != that.adminId) return false;
        if (adminPassword != null ? !adminPassword.equals(that.adminPassword) : that.adminPassword != null)
            return false;
        if (adminUsername != null ? !adminUsername.equals(that.adminUsername) : that.adminUsername != null)
            return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (privileges != null ? !privileges.equals(that.privileges) : that.privileges != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (adminUsername != null ? adminUsername.hashCode() : 0);
        result = 31 * result + (adminPassword != null ? adminPassword.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (privileges != null ? privileges.hashCode() : 0);
        return result;
    }
}
