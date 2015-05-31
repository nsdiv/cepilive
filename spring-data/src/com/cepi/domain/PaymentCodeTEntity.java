package com.cepi.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "payment_code_t", schema = "", catalog = "cepilive")
public class PaymentCodeTEntity {
    private int paymentCodeId;
    private String paymentCode;
    private String disable;
    private Date dateDisabled;
    private String paymentCompany;
    private String sendInvoiceTo;
    private Date datePaid;
    private BigDecimal amountPaid;
    private String checkNumber;
    private String note;
    private String invoiceNumber;

    @Id
    @Column(name = "Payment_Code_ID")
    public int getPaymentCodeId() {
        return paymentCodeId;
    }

    public void setPaymentCodeId(int paymentCodeId) {
        this.paymentCodeId = paymentCodeId;
    }

    @Basic
    @Column(name = "Payment_Code")
    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    @Basic
    @Column(name = "Disable")
    public String getDisable() {
        return disable;
    }

    public void setDisable(String disable) {
        this.disable = disable;
    }

    @Basic
    @Column(name = "Date_Disabled")
    public Date getDateDisabled() {
        return dateDisabled;
    }

    public void setDateDisabled(Date dateDisabled) {
        this.dateDisabled = dateDisabled;
    }

    @Basic
    @Column(name = "Payment_Company")
    public String getPaymentCompany() {
        return paymentCompany;
    }

    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    @Basic
    @Column(name = "Send_Invoice_To")
    public String getSendInvoiceTo() {
        return sendInvoiceTo;
    }

    public void setSendInvoiceTo(String sendInvoiceTo) {
        this.sendInvoiceTo = sendInvoiceTo;
    }

    @Basic
    @Column(name = "Date_Paid")
    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    @Basic
    @Column(name = "Amount_Paid")
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Basic
    @Column(name = "Check_Number")
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
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
    @Column(name = "Invoice_Number")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentCodeTEntity that = (PaymentCodeTEntity) o;

        if (paymentCodeId != that.paymentCodeId) return false;
        if (amountPaid != null ? !amountPaid.equals(that.amountPaid) : that.amountPaid != null) return false;
        if (checkNumber != null ? !checkNumber.equals(that.checkNumber) : that.checkNumber != null) return false;
        if (dateDisabled != null ? !dateDisabled.equals(that.dateDisabled) : that.dateDisabled != null) return false;
        if (datePaid != null ? !datePaid.equals(that.datePaid) : that.datePaid != null) return false;
        if (disable != null ? !disable.equals(that.disable) : that.disable != null) return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (paymentCode != null ? !paymentCode.equals(that.paymentCode) : that.paymentCode != null) return false;
        if (paymentCompany != null ? !paymentCompany.equals(that.paymentCompany) : that.paymentCompany != null)
            return false;
        if (sendInvoiceTo != null ? !sendInvoiceTo.equals(that.sendInvoiceTo) : that.sendInvoiceTo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentCodeId;
        result = 31 * result + (paymentCode != null ? paymentCode.hashCode() : 0);
        result = 31 * result + (disable != null ? disable.hashCode() : 0);
        result = 31 * result + (dateDisabled != null ? dateDisabled.hashCode() : 0);
        result = 31 * result + (paymentCompany != null ? paymentCompany.hashCode() : 0);
        result = 31 * result + (sendInvoiceTo != null ? sendInvoiceTo.hashCode() : 0);
        result = 31 * result + (datePaid != null ? datePaid.hashCode() : 0);
        result = 31 * result + (amountPaid != null ? amountPaid.hashCode() : 0);
        result = 31 * result + (checkNumber != null ? checkNumber.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        return result;
    }
}
