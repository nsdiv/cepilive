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
@javax.persistence.Table(name = "examination_t", schema = "", catalog = "cepilive")
public class ExaminationTEntity {
    private int examId;

    @Id
    @javax.persistence.Column(name = "Exam_ID")
    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    private Integer examLevel;

    @Basic
    @javax.persistence.Column(name = "Exam_Level")
    public Integer getExamLevel() {
        return examLevel;
    }

    public void setExamLevel(Integer examLevel) {
        this.examLevel = examLevel;
    }

    private Date examDate;

    @Basic
    @javax.persistence.Column(name = "Exam_Date")
    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    private Integer examYear;

    @Basic
    @javax.persistence.Column(name = "Exam_Year")
    public Integer getExamYear() {
        return examYear;
    }

    public void setExamYear(Integer examYear) {
        this.examYear = examYear;
    }

    private String enabled;

    @Basic
    @javax.persistence.Column(name = "Enabled")
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    private Date registrationDeadline;

    @Basic
    @javax.persistence.Column(name = "Registration_Deadline")
    public Date getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(Date registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    private Date defermentDeadline;

    @Basic
    @javax.persistence.Column(name = "Deferment_Deadline")
    public Date getDefermentDeadline() {
        return defermentDeadline;
    }

    public void setDefermentDeadline(Date defermentDeadline) {
        this.defermentDeadline = defermentDeadline;
    }

    private BigDecimal usEnrollmentFee;

    @Basic
    @javax.persistence.Column(name = "US_Enrollment_Fee")
    public BigDecimal getUsEnrollmentFee() {
        return usEnrollmentFee;
    }

    public void setUsEnrollmentFee(BigDecimal usEnrollmentFee) {
        this.usEnrollmentFee = usEnrollmentFee;
    }

    private BigDecimal internationalEnrollmentFee;

    @Basic
    @javax.persistence.Column(name = "International_Enrollment_Fee")
    public BigDecimal getInternationalEnrollmentFee() {
        return internationalEnrollmentFee;
    }

    public void setInternationalEnrollmentFee(BigDecimal internationalEnrollmentFee) {
        this.internationalEnrollmentFee = internationalEnrollmentFee;
    }

    private BigDecimal usRetestFeeCurrentYear;

    @Basic
    @javax.persistence.Column(name = "US_Retest_Fee_Current_Year")
    public BigDecimal getUsRetestFeeCurrentYear() {
        return usRetestFeeCurrentYear;
    }

    public void setUsRetestFeeCurrentYear(BigDecimal usRetestFeeCurrentYear) {
        this.usRetestFeeCurrentYear = usRetestFeeCurrentYear;
    }

    private BigDecimal usRetestFeeNextYear;

    @Basic
    @javax.persistence.Column(name = "US_Retest_Fee_Next_Year")
    public BigDecimal getUsRetestFeeNextYear() {
        return usRetestFeeNextYear;
    }

    public void setUsRetestFeeNextYear(BigDecimal usRetestFeeNextYear) {
        this.usRetestFeeNextYear = usRetestFeeNextYear;
    }

    private BigDecimal usDefermentFeeBeforeDeadline;

    @Basic
    @javax.persistence.Column(name = "US_Deferment_Fee_Before_Deadline")
    public BigDecimal getUsDefermentFeeBeforeDeadline() {
        return usDefermentFeeBeforeDeadline;
    }

    public void setUsDefermentFeeBeforeDeadline(BigDecimal usDefermentFeeBeforeDeadline) {
        this.usDefermentFeeBeforeDeadline = usDefermentFeeBeforeDeadline;
    }

    private BigDecimal usDefermentFeeAfterDeadline;

    @Basic
    @javax.persistence.Column(name = "US_Deferment_Fee_After_Deadline")
    public BigDecimal getUsDefermentFeeAfterDeadline() {
        return usDefermentFeeAfterDeadline;
    }

    public void setUsDefermentFeeAfterDeadline(BigDecimal usDefermentFeeAfterDeadline) {
        this.usDefermentFeeAfterDeadline = usDefermentFeeAfterDeadline;
    }

    private BigDecimal internationalRetestFeeCurrentYear;

    @Basic
    @javax.persistence.Column(name = "International_Retest_Fee_Current_Year")
    public BigDecimal getInternationalRetestFeeCurrentYear() {
        return internationalRetestFeeCurrentYear;
    }

    public void setInternationalRetestFeeCurrentYear(BigDecimal internationalRetestFeeCurrentYear) {
        this.internationalRetestFeeCurrentYear = internationalRetestFeeCurrentYear;
    }

    private BigDecimal internationalRetestFeeNextYear;

    @Basic
    @javax.persistence.Column(name = "International_Retest_Fee_Next_Year")
    public BigDecimal getInternationalRetestFeeNextYear() {
        return internationalRetestFeeNextYear;
    }

    public void setInternationalRetestFeeNextYear(BigDecimal internationalRetestFeeNextYear) {
        this.internationalRetestFeeNextYear = internationalRetestFeeNextYear;
    }

    private BigDecimal internationalDefermentFeeBeforeDeadline;

    @Basic
    @javax.persistence.Column(name = "International_Deferment_Fee_Before_Deadline")
    public BigDecimal getInternationalDefermentFeeBeforeDeadline() {
        return internationalDefermentFeeBeforeDeadline;
    }

    public void setInternationalDefermentFeeBeforeDeadline(BigDecimal internationalDefermentFeeBeforeDeadline) {
        this.internationalDefermentFeeBeforeDeadline = internationalDefermentFeeBeforeDeadline;
    }

    private BigDecimal internationalDefermentFeeAfterDeadline;

    @Basic
    @javax.persistence.Column(name = "International_Deferment_Fee_After_Deadline")
    public BigDecimal getInternationalDefermentFeeAfterDeadline() {
        return internationalDefermentFeeAfterDeadline;
    }

    public void setInternationalDefermentFeeAfterDeadline(BigDecimal internationalDefermentFeeAfterDeadline) {
        this.internationalDefermentFeeAfterDeadline = internationalDefermentFeeAfterDeadline;
    }

    private BigDecimal defermentFeePastDueDate;

    @Basic
    @javax.persistence.Column(name = "Deferment_Fee_Past_Due_Date")
    public BigDecimal getDefermentFeePastDueDate() {
        return defermentFeePastDueDate;
    }

    public void setDefermentFeePastDueDate(BigDecimal defermentFeePastDueDate) {
        this.defermentFeePastDueDate = defermentFeePastDueDate;
    }

    private String sample;

    @Basic
    @javax.persistence.Column(name = "Sample")
    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    private Integer examPassingScore;

    @Basic
    @javax.persistence.Column(name = "Exam_Passing_Score")
    public Integer getExamPassingScore() {
        return examPassingScore;
    }

    public void setExamPassingScore(Integer examPassingScore) {
        this.examPassingScore = examPassingScore;
    }

    private String locationForPrivateExam;

    @Basic
    @javax.persistence.Column(name = "Location_For_Private_Exam")
    public String getLocationForPrivateExam() {
        return locationForPrivateExam;
    }

    public void setLocationForPrivateExam(String locationForPrivateExam) {
        this.locationForPrivateExam = locationForPrivateExam;
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

        ExaminationTEntity that = (ExaminationTEntity) o;

        if (examId != that.examId) return false;
        if (defermentDeadline != null ? !defermentDeadline.equals(that.defermentDeadline) : that.defermentDeadline != null)
            return false;
        if (defermentFeePastDueDate != null ? !defermentFeePastDueDate.equals(that.defermentFeePastDueDate) : that.defermentFeePastDueDate != null)
            return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (examDate != null ? !examDate.equals(that.examDate) : that.examDate != null) return false;
        if (examLevel != null ? !examLevel.equals(that.examLevel) : that.examLevel != null) return false;
        if (examPassingScore != null ? !examPassingScore.equals(that.examPassingScore) : that.examPassingScore != null)
            return false;
        if (examYear != null ? !examYear.equals(that.examYear) : that.examYear != null) return false;
        if (internationalDefermentFeeAfterDeadline != null ? !internationalDefermentFeeAfterDeadline.equals(that.internationalDefermentFeeAfterDeadline) : that.internationalDefermentFeeAfterDeadline != null)
            return false;
        if (internationalDefermentFeeBeforeDeadline != null ? !internationalDefermentFeeBeforeDeadline.equals(that.internationalDefermentFeeBeforeDeadline) : that.internationalDefermentFeeBeforeDeadline != null)
            return false;
        if (internationalEnrollmentFee != null ? !internationalEnrollmentFee.equals(that.internationalEnrollmentFee) : that.internationalEnrollmentFee != null)
            return false;
        if (internationalRetestFeeCurrentYear != null ? !internationalRetestFeeCurrentYear.equals(that.internationalRetestFeeCurrentYear) : that.internationalRetestFeeCurrentYear != null)
            return false;
        if (internationalRetestFeeNextYear != null ? !internationalRetestFeeNextYear.equals(that.internationalRetestFeeNextYear) : that.internationalRetestFeeNextYear != null)
            return false;
        if (locationForPrivateExam != null ? !locationForPrivateExam.equals(that.locationForPrivateExam) : that.locationForPrivateExam != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (registrationDeadline != null ? !registrationDeadline.equals(that.registrationDeadline) : that.registrationDeadline != null)
            return false;
        if (sample != null ? !sample.equals(that.sample) : that.sample != null) return false;
        if (usDefermentFeeAfterDeadline != null ? !usDefermentFeeAfterDeadline.equals(that.usDefermentFeeAfterDeadline) : that.usDefermentFeeAfterDeadline != null)
            return false;
        if (usDefermentFeeBeforeDeadline != null ? !usDefermentFeeBeforeDeadline.equals(that.usDefermentFeeBeforeDeadline) : that.usDefermentFeeBeforeDeadline != null)
            return false;
        if (usEnrollmentFee != null ? !usEnrollmentFee.equals(that.usEnrollmentFee) : that.usEnrollmentFee != null)
            return false;
        if (usRetestFeeCurrentYear != null ? !usRetestFeeCurrentYear.equals(that.usRetestFeeCurrentYear) : that.usRetestFeeCurrentYear != null)
            return false;
        if (usRetestFeeNextYear != null ? !usRetestFeeNextYear.equals(that.usRetestFeeNextYear) : that.usRetestFeeNextYear != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examId;
        result = 31 * result + (examLevel != null ? examLevel.hashCode() : 0);
        result = 31 * result + (examDate != null ? examDate.hashCode() : 0);
        result = 31 * result + (examYear != null ? examYear.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (registrationDeadline != null ? registrationDeadline.hashCode() : 0);
        result = 31 * result + (defermentDeadline != null ? defermentDeadline.hashCode() : 0);
        result = 31 * result + (usEnrollmentFee != null ? usEnrollmentFee.hashCode() : 0);
        result = 31 * result + (internationalEnrollmentFee != null ? internationalEnrollmentFee.hashCode() : 0);
        result = 31 * result + (usRetestFeeCurrentYear != null ? usRetestFeeCurrentYear.hashCode() : 0);
        result = 31 * result + (usRetestFeeNextYear != null ? usRetestFeeNextYear.hashCode() : 0);
        result = 31 * result + (usDefermentFeeBeforeDeadline != null ? usDefermentFeeBeforeDeadline.hashCode() : 0);
        result = 31 * result + (usDefermentFeeAfterDeadline != null ? usDefermentFeeAfterDeadline.hashCode() : 0);
        result = 31 * result + (internationalRetestFeeCurrentYear != null ? internationalRetestFeeCurrentYear.hashCode() : 0);
        result = 31 * result + (internationalRetestFeeNextYear != null ? internationalRetestFeeNextYear.hashCode() : 0);
        result = 31 * result + (internationalDefermentFeeBeforeDeadline != null ? internationalDefermentFeeBeforeDeadline.hashCode() : 0);
        result = 31 * result + (internationalDefermentFeeAfterDeadline != null ? internationalDefermentFeeAfterDeadline.hashCode() : 0);
        result = 31 * result + (defermentFeePastDueDate != null ? defermentFeePastDueDate.hashCode() : 0);
        result = 31 * result + (sample != null ? sample.hashCode() : 0);
        result = 31 * result + (examPassingScore != null ? examPassingScore.hashCode() : 0);
        result = 31 * result + (locationForPrivateExam != null ? locationForPrivateExam.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
