package com.cepi.domain;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Entity
@Table(name = "temp_exam_score_t", schema = "", catalog = "cepilive")
public class TempExamScoreTEntity {
    private int studentId;
    private int examId;
    private Integer rawPassingScore;

    @Id
    @Column(name = "Student_ID")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Exam_ID")
    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    @Basic
    @Column(name = "Raw_Passing_Score")
    public Integer getRawPassingScore() {
        return rawPassingScore;
    }

    public void setRawPassingScore(Integer rawPassingScore) {
        this.rawPassingScore = rawPassingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TempExamScoreTEntity that = (TempExamScoreTEntity) o;

        if (examId != that.examId) return false;
        if (studentId != that.studentId) return false;
        if (rawPassingScore != null ? !rawPassingScore.equals(that.rawPassingScore) : that.rawPassingScore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + examId;
        result = 31 * result + (rawPassingScore != null ? rawPassingScore.hashCode() : 0);
        return result;
    }
}
