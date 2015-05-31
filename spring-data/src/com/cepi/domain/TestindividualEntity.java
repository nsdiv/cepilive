package com.cepi.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@javax.persistence.Table(name = "testindividual", schema = "", catalog = "cepilive")
public class TestindividualEntity {
    private int individualId;

    @Id
    @javax.persistence.Column(name = "Individual_ID")
    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    private String firstName;

    @Basic
    @javax.persistence.Column(name = "First_Name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String middleInitial;

    @Basic
    @javax.persistence.Column(name = "Middle_Initial")
    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    private String lastName;

    @Basic
    @javax.persistence.Column(name = "Last_Name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String address1;

    @Basic
    @javax.persistence.Column(name = "Address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    @Basic
    @javax.persistence.Column(name = "Address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String city;

    @Basic
    @javax.persistence.Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String state;

    @Basic
    @javax.persistence.Column(name = "State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String postalCode;

    @Basic
    @javax.persistence.Column(name = "Postal_Code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String country;

    @Basic
    @javax.persistence.Column(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String homePhone;

    @Basic
    @javax.persistence.Column(name = "Home_Phone")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    private String mobilePhone;

    @Basic
    @javax.persistence.Column(name = "Mobile_Phone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    private String emailAddress;

    @Basic
    @javax.persistence.Column(name = "Email_Address")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String alternateEmailAddress;

    @Basic
    @javax.persistence.Column(name = "Alternate_Email_Address")
    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String preferredAddress;

    @Basic
    @javax.persistence.Column(name = "Preferred_Address")
    public String getPreferredAddress() {
        return preferredAddress;
    }

    public void setPreferredAddress(String preferredAddress) {
        this.preferredAddress = preferredAddress;
    }

    private String doNotMail;

    @Basic
    @javax.persistence.Column(name = "Do_Not_Mail")
    public String getDoNotMail() {
        return doNotMail;
    }

    public void setDoNotMail(String doNotMail) {
        this.doNotMail = doNotMail;
    }

    private String isStudent;

    @Basic
    @javax.persistence.Column(name = "Is_Student")
    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    private String isVolunteer;

    @Basic
    @javax.persistence.Column(name = "Is_Volunteer")
    public String getIsVolunteer() {
        return isVolunteer;
    }

    public void setIsVolunteer(String isVolunteer) {
        this.isVolunteer = isVolunteer;
    }

    private String isContact;

    @Basic
    @javax.persistence.Column(name = "Is_Contact")
    public String getIsContact() {
        return isContact;
    }

    public void setIsContact(String isContact) {
        this.isContact = isContact;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "Note")
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

        TestindividualEntity that = (TestindividualEntity) o;

        if (individualId != that.individualId) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (alternateEmailAddress != null ? !alternateEmailAddress.equals(that.alternateEmailAddress) : that.alternateEmailAddress != null)
            return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (doNotMail != null ? !doNotMail.equals(that.doNotMail) : that.doNotMail != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (homePhone != null ? !homePhone.equals(that.homePhone) : that.homePhone != null) return false;
        if (isContact != null ? !isContact.equals(that.isContact) : that.isContact != null) return false;
        if (isStudent != null ? !isStudent.equals(that.isStudent) : that.isStudent != null) return false;
        if (isVolunteer != null ? !isVolunteer.equals(that.isVolunteer) : that.isVolunteer != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (middleInitial != null ? !middleInitial.equals(that.middleInitial) : that.middleInitial != null)
            return false;
        if (mobilePhone != null ? !mobilePhone.equals(that.mobilePhone) : that.mobilePhone != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (preferredAddress != null ? !preferredAddress.equals(that.preferredAddress) : that.preferredAddress != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = individualId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInitial != null ? middleInitial.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (homePhone != null ? homePhone.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (alternateEmailAddress != null ? alternateEmailAddress.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (preferredAddress != null ? preferredAddress.hashCode() : 0);
        result = 31 * result + (doNotMail != null ? doNotMail.hashCode() : 0);
        result = 31 * result + (isStudent != null ? isStudent.hashCode() : 0);
        result = 31 * result + (isVolunteer != null ? isVolunteer.hashCode() : 0);
        result = 31 * result + (isContact != null ? isContact.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
