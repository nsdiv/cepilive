package com.cepi.data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@javax.persistence.Table(name = "registration_t", schema = "", catalog = "cepilive")
public class RegistrationTEntity {
    private int registrationId;

    @Id
    @javax.persistence.Column(name = "Registration_ID")
    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    private int studentId;

    @Basic
    @javax.persistence.Column(name = "Student_ID")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int examId;

    @Basic
    @javax.persistence.Column(name = "Exam_ID")
    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    private String outcome;

    @Basic
    @javax.persistence.Column(name = "Outcome")
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    private Date dateMaterialsSent;

    @Basic
    @javax.persistence.Column(name = "Date_Materials_Sent")
    public Date getDateMaterialsSent() {
        return dateMaterialsSent;
    }

    public void setDateMaterialsSent(Date dateMaterialsSent) {
        this.dateMaterialsSent = dateMaterialsSent;
    }

    private String retest;

    @Basic
    @javax.persistence.Column(name = "Retest")
    public String getRetest() {
        return retest;
    }

    public void setRetest(String retest) {
        this.retest = retest;
    }

    private String payerName;

    @Basic
    @javax.persistence.Column(name = "Payer_Name")
    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    private String paymentType;

    @Basic
    @javax.persistence.Column(name = "Payment_Type")
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    private String checkNumber;

    @Basic
    @javax.persistence.Column(name = "Check_Number")
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    private Date checkDate;

    @Basic
    @javax.persistence.Column(name = "Check_Date")
    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    private String checkName;

    @Basic
    @javax.persistence.Column(name = "Check_Name")
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    private String verisignTransactionNumber;

    @Basic
    @javax.persistence.Column(name = "Verisign_Transaction_Number")
    public String getVerisignTransactionNumber() {
        return verisignTransactionNumber;
    }

    public void setVerisignTransactionNumber(String verisignTransactionNumber) {
        this.verisignTransactionNumber = verisignTransactionNumber;
    }

    private String verisignAddressLine1;

    @Basic
    @javax.persistence.Column(name = "Verisign_Address_Line1")
    public String getVerisignAddressLine1() {
        return verisignAddressLine1;
    }

    public void setVerisignAddressLine1(String verisignAddressLine1) {
        this.verisignAddressLine1 = verisignAddressLine1;
    }

    private String verisignAddressLine2;

    @Basic
    @javax.persistence.Column(name = "Verisign_Address_Line2")
    public String getVerisignAddressLine2() {
        return verisignAddressLine2;
    }

    public void setVerisignAddressLine2(String verisignAddressLine2) {
        this.verisignAddressLine2 = verisignAddressLine2;
    }

    private Integer paymentCodeId;

    @Basic
    @javax.persistence.Column(name = "Payment_Code_ID")
    public Integer getPaymentCodeId() {
        return paymentCodeId;
    }

    public void setPaymentCodeId(Integer paymentCodeId) {
        this.paymentCodeId = paymentCodeId;
    }

    private Timestamp paymentExecutionDateTime;

    @Basic
    @javax.persistence.Column(name = "Payment_Execution_Date_Time")
    public Timestamp getPaymentExecutionDateTime() {
        return paymentExecutionDateTime;
    }

    public void setPaymentExecutionDateTime(Timestamp paymentExecutionDateTime) {
        this.paymentExecutionDateTime = paymentExecutionDateTime;
    }

    private BigDecimal amountCharged;

    @Basic
    @javax.persistence.Column(name = "Amount_Charged")
    public BigDecimal getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(BigDecimal amountCharged) {
        this.amountCharged = amountCharged;
    }

    private BigDecimal amountPaid;

    @Basic
    @javax.persistence.Column(name = "Amount_Paid")
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    private String disabilityAccomodations;

    @Basic
    @javax.persistence.Column(name = "Disability_Accomodations")
    public String getDisabilityAccomodations() {
        return disabilityAccomodations;
    }

    public void setDisabilityAccomodations(String disabilityAccomodations) {
        this.disabilityAccomodations = disabilityAccomodations;
    }

    private String alternateTestSiteRequirement;

    @Basic
    @javax.persistence.Column(name = "Alternate_Test_Site_Requirement")
    public String getAlternateTestSiteRequirement() {
        return alternateTestSiteRequirement;
    }

    public void setAlternateTestSiteRequirement(String alternateTestSiteRequirement) {
        this.alternateTestSiteRequirement = alternateTestSiteRequirement;
    }

    private String location;

    @Basic
    @javax.persistence.Column(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String registrationCompleteFlag;

    @Basic
    @javax.persistence.Column(name = "Registration_Complete_Flag")
    public String getRegistrationCompleteFlag() {
        return registrationCompleteFlag;
    }

    public void setRegistrationCompleteFlag(String registrationCompleteFlag) {
        this.registrationCompleteFlag = registrationCompleteFlag;
    }

    private String mailConfirmation;

    @Basic
    @javax.persistence.Column(name = "Mail_Confirmation")
    public String getMailConfirmation() {
        return mailConfirmation;
    }

    public void setMailConfirmation(String mailConfirmation) {
        this.mailConfirmation = mailConfirmation;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Date datePassed;

    @Basic
    @javax.persistence.Column(name = "Date_Passed")
    public Date getDatePassed() {
        return datePassed;
    }

    public void setDatePassed(Date datePassed) {
        this.datePassed = datePassed;
    }

    private Integer rawPassingScore;

    @Basic
    @javax.persistence.Column(name = "Raw_Passing_Score")
    public Integer getRawPassingScore() {
        return rawPassingScore;
    }

    public void setRawPassingScore(Integer rawPassingScore) {
        this.rawPassingScore = rawPassingScore;
    }

    private String requiredNonSaturdayAdmission;

    @Basic
    @javax.persistence.Column(name = "Required_Non_Saturday_Admission")
    public String getRequiredNonSaturdayAdmission() {
        return requiredNonSaturdayAdmission;
    }

    public void setRequiredNonSaturdayAdmission(String requiredNonSaturdayAdmission) {
        this.requiredNonSaturdayAdmission = requiredNonSaturdayAdmission;
    }

    private String releaseContactInfoToOthers;

    @Basic
    @javax.persistence.Column(name = "Release_Contact_Info_To_Others")
    public String getReleaseContactInfoToOthers() {
        return releaseContactInfoToOthers;
    }

    public void setReleaseContactInfoToOthers(String releaseContactInfoToOthers) {
        this.releaseContactInfoToOthers = releaseContactInfoToOthers;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistrationTEntity that = (RegistrationTEntity) o;

        if (examId != that.examId) return false;
        if (registrationId != that.registrationId) return false;
        if (studentId != that.studentId) return false;
        if (alternateTestSiteRequirement != null ? !alternateTestSiteRequirement.equals(that.alternateTestSiteRequirement) : that.alternateTestSiteRequirement != null)
            return false;
        if (amountCharged != null ? !amountCharged.equals(that.amountCharged) : that.amountCharged != null)
            return false;
        if (amountPaid != null ? !amountPaid.equals(that.amountPaid) : that.amountPaid != null) return false;
        if (checkDate != null ? !checkDate.equals(that.checkDate) : that.checkDate != null) return false;
        if (checkName != null ? !checkName.equals(that.checkName) : that.checkName != null) return false;
        if (checkNumber != null ? !checkNumber.equals(that.checkNumber) : that.checkNumber != null) return false;
        if (dateMaterialsSent != null ? !dateMaterialsSent.equals(that.dateMaterialsSent) : that.dateMaterialsSent != null)
            return false;
        if (datePassed != null ? !datePassed.equals(that.datePassed) : that.datePassed != null) return false;
        if (disabilityAccomodations != null ? !disabilityAccomodations.equals(that.disabilityAccomodations) : that.disabilityAccomodations != null)
            return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (mailConfirmation != null ? !mailConfirmation.equals(that.mailConfirmation) : that.mailConfirmation != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (outcome != null ? !outcome.equals(that.outcome) : that.outcome != null) return false;
        if (payerName != null ? !payerName.equals(that.payerName) : that.payerName != null) return false;
        if (paymentCodeId != null ? !paymentCodeId.equals(that.paymentCodeId) : that.paymentCodeId != null)
            return false;
        if (paymentExecutionDateTime != null ? !paymentExecutionDateTime.equals(that.paymentExecutionDateTime) : that.paymentExecutionDateTime != null)
            return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (rawPassingScore != null ? !rawPassingScore.equals(that.rawPassingScore) : that.rawPassingScore != null)
            return false;
        if (registrationCompleteFlag != null ? !registrationCompleteFlag.equals(that.registrationCompleteFlag) : that.registrationCompleteFlag != null)
            return false;
        if (releaseContactInfoToOthers != null ? !releaseContactInfoToOthers.equals(that.releaseContactInfoToOthers) : that.releaseContactInfoToOthers != null)
            return false;
        if (requiredNonSaturdayAdmission != null ? !requiredNonSaturdayAdmission.equals(that.requiredNonSaturdayAdmission) : that.requiredNonSaturdayAdmission != null)
            return false;
        if (retest != null ? !retest.equals(that.retest) : that.retest != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (verisignAddressLine1 != null ? !verisignAddressLine1.equals(that.verisignAddressLine1) : that.verisignAddressLine1 != null)
            return false;
        if (verisignAddressLine2 != null ? !verisignAddressLine2.equals(that.verisignAddressLine2) : that.verisignAddressLine2 != null)
            return false;
        if (verisignTransactionNumber != null ? !verisignTransactionNumber.equals(that.verisignTransactionNumber) : that.verisignTransactionNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = registrationId;
        result = 31 * result + studentId;
        result = 31 * result + examId;
        result = 31 * result + (outcome != null ? outcome.hashCode() : 0);
        result = 31 * result + (dateMaterialsSent != null ? dateMaterialsSent.hashCode() : 0);
        result = 31 * result + (retest != null ? retest.hashCode() : 0);
        result = 31 * result + (payerName != null ? payerName.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (checkNumber != null ? checkNumber.hashCode() : 0);
        result = 31 * result + (checkDate != null ? checkDate.hashCode() : 0);
        result = 31 * result + (checkName != null ? checkName.hashCode() : 0);
        result = 31 * result + (verisignTransactionNumber != null ? verisignTransactionNumber.hashCode() : 0);
        result = 31 * result + (verisignAddressLine1 != null ? verisignAddressLine1.hashCode() : 0);
        result = 31 * result + (verisignAddressLine2 != null ? verisignAddressLine2.hashCode() : 0);
        result = 31 * result + (paymentCodeId != null ? paymentCodeId.hashCode() : 0);
        result = 31 * result + (paymentExecutionDateTime != null ? paymentExecutionDateTime.hashCode() : 0);
        result = 31 * result + (amountCharged != null ? amountCharged.hashCode() : 0);
        result = 31 * result + (amountPaid != null ? amountPaid.hashCode() : 0);
        result = 31 * result + (disabilityAccomodations != null ? disabilityAccomodations.hashCode() : 0);
        result = 31 * result + (alternateTestSiteRequirement != null ? alternateTestSiteRequirement.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (registrationCompleteFlag != null ? registrationCompleteFlag.hashCode() : 0);
        result = 31 * result + (mailConfirmation != null ? mailConfirmation.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (datePassed != null ? datePassed.hashCode() : 0);
        result = 31 * result + (rawPassingScore != null ? rawPassingScore.hashCode() : 0);
        result = 31 * result + (requiredNonSaturdayAdmission != null ? requiredNonSaturdayAdmission.hashCode() : 0);
        result = 31 * result + (releaseContactInfoToOthers != null ? releaseContactInfoToOthers.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
