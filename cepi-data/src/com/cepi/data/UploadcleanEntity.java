package com.cepi.data;

import javax.persistence.*;

/**
 * Created by ndivadkar on 5/30/15.
 */
@Entity
@Table(name = "uploadclean", schema = "", catalog = "cepilive")
public class UploadcleanEntity {
    private Integer id;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UploadcleanEntity that = (UploadcleanEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
