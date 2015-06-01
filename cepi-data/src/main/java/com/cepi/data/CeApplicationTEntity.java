package com.cepi.data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@javax.persistence.Table(name = "ce_application_t", schema = "", catalog = "cepilive")
public class CeApplicationTEntity {
    private int ceApplicationId;

    @Id
    @javax.persistence.Column(name = "Ce_Application_ID")
    public int getCeApplicationId() {
        return ceApplicationId;
    }

    public void setCeApplicationId(int ceApplicationId) {
        this.ceApplicationId = ceApplicationId;
    }

    private int cepId;

    @Basic
    @javax.persistence.Column(name = "Cep_ID")
    public int getCepId() {
        return cepId;
    }

    public void setCepId(int cepId) {
        this.cepId = cepId;
    }

    private Date applicationDate;

    @Basic
    @javax.persistence.Column(name = "Application_Date")
    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
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

    private String payerName;

    @Basic
    @javax.persistence.Column(name = "Payer_Name")
    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
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

    private Date paymentExecutionDateTime;

    @Basic
    @javax.persistence.Column(name = "Payment_Execution_Date_Time")
    public Date getPaymentExecutionDateTime() {
        return paymentExecutionDateTime;
    }

    public void setPaymentExecutionDateTime(Date paymentExecutionDateTime) {
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

    private String approvalFlag;

    @Basic
    @javax.persistence.Column(name = "Approval_Flag")
    public String getApprovalFlag() {
        return approvalFlag;
    }

    public void setApprovalFlag(String approvalFlag) {
        this.approvalFlag = approvalFlag;
    }

    private Date approvalDate;

    @Basic
    @javax.persistence.Column(name = "Approval_Date")
    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    private Date newDueDate;

    @Basic
    @javax.persistence.Column(name = "New_Due_Date")
    public Date getNewDueDate() {
        return newDueDate;
    }

    public void setNewDueDate(Date newDueDate) {
        this.newDueDate = newDueDate;
    }

    private String extension;

    @Basic
    @javax.persistence.Column(name = "Extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    private Date dateRecertified;

    @Basic
    @javax.persistence.Column(name = "Date_Recertified")
    public Date getDateRecertified() {
        return dateRecertified;
    }

    public void setDateRecertified(Date dateRecertified) {
        this.dateRecertified = dateRecertified;
    }

    private String applicationAlreadySubmitted;

    @Basic
    @javax.persistence.Column(name = "Application_Already_Submitted")
    public String getApplicationAlreadySubmitted() {
        return applicationAlreadySubmitted;
    }

    public void setApplicationAlreadySubmitted(String applicationAlreadySubmitted) {
        this.applicationAlreadySubmitted = applicationAlreadySubmitted;
    }

    private int timesSubmitted;

    @Basic
    @javax.persistence.Column(name = "Times_Submitted")
    public int getTimesSubmitted() {
        return timesSubmitted;
    }

    public void setTimesSubmitted(int timesSubmitted) {
        this.timesSubmitted = timesSubmitted;
    }

    private String resubmissionFlag;

    @Basic
    @javax.persistence.Column(name = "Resubmission_Flag")
    public String getResubmissionFlag() {
        return resubmissionFlag;
    }

    public void setResubmissionFlag(String resubmissionFlag) {
        this.resubmissionFlag = resubmissionFlag;
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

        CeApplicationTEntity that = (CeApplicationTEntity) o;

        if (ceApplicationId != that.ceApplicationId) return false;
        if (cepId != that.cepId) return false;
        if (timesSubmitted != that.timesSubmitted) return false;
        if (amountCharged != null ? !amountCharged.equals(that.amountCharged) : that.amountCharged != null)
            return false;
        if (amountPaid != null ? !amountPaid.equals(that.amountPaid) : that.amountPaid != null) return false;
        if (applicationAlreadySubmitted != null ? !applicationAlreadySubmitted.equals(that.applicationAlreadySubmitted) : that.applicationAlreadySubmitted != null)
            return false;
        if (applicationDate != null ? !applicationDate.equals(that.applicationDate) : that.applicationDate != null)
            return false;
        if (approvalDate != null ? !approvalDate.equals(that.approvalDate) : that.approvalDate != null) return false;
        if (approvalFlag != null ? !approvalFlag.equals(that.approvalFlag) : that.approvalFlag != null) return false;
        if (checkDate != null ? !checkDate.equals(that.checkDate) : that.checkDate != null) return false;
        if (checkName != null ? !checkName.equals(that.checkName) : that.checkName != null) return false;
        if (checkNumber != null ? !checkNumber.equals(that.checkNumber) : that.checkNumber != null) return false;
        if (dateRecertified != null ? !dateRecertified.equals(that.dateRecertified) : that.dateRecertified != null)
            return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        if (newDueDate != null ? !newDueDate.equals(that.newDueDate) : that.newDueDate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (payerName != null ? !payerName.equals(that.payerName) : that.payerName != null) return false;
        if (paymentExecutionDateTime != null ? !paymentExecutionDateTime.equals(that.paymentExecutionDateTime) : that.paymentExecutionDateTime != null)
            return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (resubmissionFlag != null ? !resubmissionFlag.equals(that.resubmissionFlag) : that.resubmissionFlag != null)
            return false;
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
        int result = ceApplicationId;
        result = 31 * result + cepId;
        result = 31 * result + (applicationDate != null ? applicationDate.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (payerName != null ? payerName.hashCode() : 0);
        result = 31 * result + (checkNumber != null ? checkNumber.hashCode() : 0);
        result = 31 * result + (checkDate != null ? checkDate.hashCode() : 0);
        result = 31 * result + (checkName != null ? checkName.hashCode() : 0);
        result = 31 * result + (verisignTransactionNumber != null ? verisignTransactionNumber.hashCode() : 0);
        result = 31 * result + (verisignAddressLine1 != null ? verisignAddressLine1.hashCode() : 0);
        result = 31 * result + (verisignAddressLine2 != null ? verisignAddressLine2.hashCode() : 0);
        result = 31 * result + (paymentExecutionDateTime != null ? paymentExecutionDateTime.hashCode() : 0);
        result = 31 * result + (amountCharged != null ? amountCharged.hashCode() : 0);
        result = 31 * result + (amountPaid != null ? amountPaid.hashCode() : 0);
        result = 31 * result + (approvalFlag != null ? approvalFlag.hashCode() : 0);
        result = 31 * result + (approvalDate != null ? approvalDate.hashCode() : 0);
        result = 31 * result + (newDueDate != null ? newDueDate.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (dateRecertified != null ? dateRecertified.hashCode() : 0);
        result = 31 * result + (applicationAlreadySubmitted != null ? applicationAlreadySubmitted.hashCode() : 0);
        result = 31 * result + timesSubmitted;
        result = 31 * result + (resubmissionFlag != null ? resubmissionFlag.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
