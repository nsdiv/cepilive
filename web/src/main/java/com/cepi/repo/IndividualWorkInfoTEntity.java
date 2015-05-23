package com.cepi.repo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@javax.persistence.Table(name = "individual_work_info_t", schema = "", catalog = "cepilive")
public class IndividualWorkInfoTEntity {
    private int individualWorkInfoId;

    @Id
    @javax.persistence.Column(name = "Individual_Work_Info_ID")
    public int getIndividualWorkInfoId() {
        return individualWorkInfoId;
    }

    public void setIndividualWorkInfoId(int individualWorkInfoId) {
        this.individualWorkInfoId = individualWorkInfoId;
    }

    private int individualId;

    @Basic
    @javax.persistence.Column(name = "Individual_ID")
    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    private int level;

    @Basic
    @javax.persistence.Column(name = "Level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private String workAddress1;

    @Basic
    @javax.persistence.Column(name = "Work_Address1")
    public String getWorkAddress1() {
        return workAddress1;
    }

    public void setWorkAddress1(String workAddress1) {
        this.workAddress1 = workAddress1;
    }

    private String workAddress2;

    @Basic
    @javax.persistence.Column(name = "Work_Address2")
    public String getWorkAddress2() {
        return workAddress2;
    }

    public void setWorkAddress2(String workAddress2) {
        this.workAddress2 = workAddress2;
    }

    private String workCity;

    @Basic
    @javax.persistence.Column(name = "Work_City")
    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    private String workState;

    @Basic
    @javax.persistence.Column(name = "Work_State")
    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    private String workPostalCode;

    @Basic
    @javax.persistence.Column(name = "Work_Postal_Code")
    public String getWorkPostalCode() {
        return workPostalCode;
    }

    public void setWorkPostalCode(String workPostalCode) {
        this.workPostalCode = workPostalCode;
    }

    private String workCountry;

    @Basic
    @javax.persistence.Column(name = "Work_Country")
    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }

    private String workPhone;

    @Basic
    @javax.persistence.Column(name = "Work_Phone")
    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    private String workExtension;

    @Basic
    @javax.persistence.Column(name = "Work_Extension")
    public String getWorkExtension() {
        return workExtension;
    }

    public void setWorkExtension(String workExtension) {
        this.workExtension = workExtension;
    }

    private String workFaxNumber;

    @Basic
    @javax.persistence.Column(name = "Work_Fax_Number")
    public String getWorkFaxNumber() {
        return workFaxNumber;
    }

    public void setWorkFaxNumber(String workFaxNumber) {
        this.workFaxNumber = workFaxNumber;
    }

    private String individualTitle;

    @Basic
    @javax.persistence.Column(name = "Individual_Title")
    public String getIndividualTitle() {
        return individualTitle;
    }

    public void setIndividualTitle(String individualTitle) {
        this.individualTitle = individualTitle;
    }

    private String individualDepartment;

    @Basic
    @javax.persistence.Column(name = "Individual_Department")
    public String getIndividualDepartment() {
        return individualDepartment;
    }

    public void setIndividualDepartment(String individualDepartment) {
        this.individualDepartment = individualDepartment;
    }

    private String individualCompany;

    @Basic
    @javax.persistence.Column(name = "Individual_Company")
    public String getIndividualCompany() {
        return individualCompany;
    }

    public void setIndividualCompany(String individualCompany) {
        this.individualCompany = individualCompany;
    }

    private String companyType;

    @Basic
    @javax.persistence.Column(name = "Company_Type")
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    private String isCurrent;

    @Basic
    @javax.persistence.Column(name = "Is_Current")
    public String getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(String isCurrent) {
        this.isCurrent = isCurrent;
    }

    private Date workStart;

    @Basic
    @javax.persistence.Column(name = "Work_Start")
    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    private Date workEnd;

    @Basic
    @javax.persistence.Column(name = "Work_End")
    public Date getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    private String workResponsibilities;

    @Basic
    @javax.persistence.Column(name = "Work_Responsibilities")
    public String getWorkResponsibilities() {
        return workResponsibilities;
    }

    public void setWorkResponsibilities(String workResponsibilities) {
        this.workResponsibilities = workResponsibilities;
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

    private Timestamp lastUpdate;

    @Basic
    @javax.persistence.Column(name = "Last_Update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    private String releaseConsentForm;

    @Basic
    @javax.persistence.Column(name = "Release_Consent_Form")
    public String getReleaseConsentForm() {
        return releaseConsentForm;
    }

    public void setReleaseConsentForm(String releaseConsentForm) {
        this.releaseConsentForm = releaseConsentForm;
    }

    private Date consentDate;

    @Basic
    @javax.persistence.Column(name = "Consent_Date")
    public Date getConsentDate() {
        return consentDate;
    }

    public void setConsentDate(Date consentDate) {
        this.consentDate = consentDate;
    }

    private String pIndividualCompany;

    @Basic
    @javax.persistence.Column(name = "PIndividual_Company")
    public String getpIndividualCompany() {
        return pIndividualCompany;
    }

    public void setpIndividualCompany(String pIndividualCompany) {
        this.pIndividualCompany = pIndividualCompany;
    }

    private String pIndividualTitle;

    @Basic
    @javax.persistence.Column(name = "PIndividual_Title")
    public String getpIndividualTitle() {
        return pIndividualTitle;
    }

    public void setpIndividualTitle(String pIndividualTitle) {
        this.pIndividualTitle = pIndividualTitle;
    }

    private Date pWorkStart;

    @Basic
    @javax.persistence.Column(name = "PWork_Start")
    public Date getpWorkStart() {
        return pWorkStart;
    }

    public void setpWorkStart(Date pWorkStart) {
        this.pWorkStart = pWorkStart;
    }

    private Date pWorkEnd;

    @Basic
    @javax.persistence.Column(name = "PWork_End")
    public Date getpWorkEnd() {
        return pWorkEnd;
    }

    public void setpWorkEnd(Date pWorkEnd) {
        this.pWorkEnd = pWorkEnd;
    }

    private String pWorkCity;

    @Basic
    @javax.persistence.Column(name = "PWork_City")
    public String getpWorkCity() {
        return pWorkCity;
    }

    public void setpWorkCity(String pWorkCity) {
        this.pWorkCity = pWorkCity;
    }

    private String pState;

    @Basic
    @javax.persistence.Column(name = "PState")
    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState;
    }

    private String pWorkResponsibilities;

    @Basic
    @javax.persistence.Column(name = "PWork_Responsibilities")
    public String getpWorkResponsibilities() {
        return pWorkResponsibilities;
    }

    public void setpWorkResponsibilities(String pWorkResponsibilities) {
        this.pWorkResponsibilities = pWorkResponsibilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndividualWorkInfoTEntity that = (IndividualWorkInfoTEntity) o;

        if (individualId != that.individualId) return false;
        if (individualWorkInfoId != that.individualWorkInfoId) return false;
        if (level != that.level) return false;
        if (companyType != null ? !companyType.equals(that.companyType) : that.companyType != null) return false;
        if (consentDate != null ? !consentDate.equals(that.consentDate) : that.consentDate != null) return false;
        if (individualCompany != null ? !individualCompany.equals(that.individualCompany) : that.individualCompany != null)
            return false;
        if (individualDepartment != null ? !individualDepartment.equals(that.individualDepartment) : that.individualDepartment != null)
            return false;
        if (individualTitle != null ? !individualTitle.equals(that.individualTitle) : that.individualTitle != null)
            return false;
        if (isCurrent != null ? !isCurrent.equals(that.isCurrent) : that.isCurrent != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (pIndividualCompany != null ? !pIndividualCompany.equals(that.pIndividualCompany) : that.pIndividualCompany != null)
            return false;
        if (pIndividualTitle != null ? !pIndividualTitle.equals(that.pIndividualTitle) : that.pIndividualTitle != null)
            return false;
        if (pState != null ? !pState.equals(that.pState) : that.pState != null) return false;
        if (pWorkCity != null ? !pWorkCity.equals(that.pWorkCity) : that.pWorkCity != null) return false;
        if (pWorkEnd != null ? !pWorkEnd.equals(that.pWorkEnd) : that.pWorkEnd != null) return false;
        if (pWorkResponsibilities != null ? !pWorkResponsibilities.equals(that.pWorkResponsibilities) : that.pWorkResponsibilities != null)
            return false;
        if (pWorkStart != null ? !pWorkStart.equals(that.pWorkStart) : that.pWorkStart != null) return false;
        if (releaseConsentForm != null ? !releaseConsentForm.equals(that.releaseConsentForm) : that.releaseConsentForm != null)
            return false;
        if (workAddress1 != null ? !workAddress1.equals(that.workAddress1) : that.workAddress1 != null) return false;
        if (workAddress2 != null ? !workAddress2.equals(that.workAddress2) : that.workAddress2 != null) return false;
        if (workCity != null ? !workCity.equals(that.workCity) : that.workCity != null) return false;
        if (workCountry != null ? !workCountry.equals(that.workCountry) : that.workCountry != null) return false;
        if (workEnd != null ? !workEnd.equals(that.workEnd) : that.workEnd != null) return false;
        if (workExtension != null ? !workExtension.equals(that.workExtension) : that.workExtension != null)
            return false;
        if (workFaxNumber != null ? !workFaxNumber.equals(that.workFaxNumber) : that.workFaxNumber != null)
            return false;
        if (workPhone != null ? !workPhone.equals(that.workPhone) : that.workPhone != null) return false;
        if (workPostalCode != null ? !workPostalCode.equals(that.workPostalCode) : that.workPostalCode != null)
            return false;
        if (workResponsibilities != null ? !workResponsibilities.equals(that.workResponsibilities) : that.workResponsibilities != null)
            return false;
        if (workStart != null ? !workStart.equals(that.workStart) : that.workStart != null) return false;
        if (workState != null ? !workState.equals(that.workState) : that.workState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = individualWorkInfoId;
        result = 31 * result + individualId;
        result = 31 * result + level;
        result = 31 * result + (workAddress1 != null ? workAddress1.hashCode() : 0);
        result = 31 * result + (workAddress2 != null ? workAddress2.hashCode() : 0);
        result = 31 * result + (workCity != null ? workCity.hashCode() : 0);
        result = 31 * result + (workState != null ? workState.hashCode() : 0);
        result = 31 * result + (workPostalCode != null ? workPostalCode.hashCode() : 0);
        result = 31 * result + (workCountry != null ? workCountry.hashCode() : 0);
        result = 31 * result + (workPhone != null ? workPhone.hashCode() : 0);
        result = 31 * result + (workExtension != null ? workExtension.hashCode() : 0);
        result = 31 * result + (workFaxNumber != null ? workFaxNumber.hashCode() : 0);
        result = 31 * result + (individualTitle != null ? individualTitle.hashCode() : 0);
        result = 31 * result + (individualDepartment != null ? individualDepartment.hashCode() : 0);
        result = 31 * result + (individualCompany != null ? individualCompany.hashCode() : 0);
        result = 31 * result + (companyType != null ? companyType.hashCode() : 0);
        result = 31 * result + (isCurrent != null ? isCurrent.hashCode() : 0);
        result = 31 * result + (workStart != null ? workStart.hashCode() : 0);
        result = 31 * result + (workEnd != null ? workEnd.hashCode() : 0);
        result = 31 * result + (workResponsibilities != null ? workResponsibilities.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (releaseConsentForm != null ? releaseConsentForm.hashCode() : 0);
        result = 31 * result + (consentDate != null ? consentDate.hashCode() : 0);
        result = 31 * result + (pIndividualCompany != null ? pIndividualCompany.hashCode() : 0);
        result = 31 * result + (pIndividualTitle != null ? pIndividualTitle.hashCode() : 0);
        result = 31 * result + (pWorkStart != null ? pWorkStart.hashCode() : 0);
        result = 31 * result + (pWorkEnd != null ? pWorkEnd.hashCode() : 0);
        result = 31 * result + (pWorkCity != null ? pWorkCity.hashCode() : 0);
        result = 31 * result + (pState != null ? pState.hashCode() : 0);
        result = 31 * result + (pWorkResponsibilities != null ? pWorkResponsibilities.hashCode() : 0);
        return result;
    }
}
