/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalModel;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "instructors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructors.findAll", query = "SELECT i FROM Instructors i"),
    @NamedQuery(name = "Instructors.findById", query = "SELECT i FROM Instructors i WHERE i.id = :id"),
    @NamedQuery(name = "Instructors.findByInstructorId", query = "SELECT i FROM Instructors i WHERE i.instructorId = :instructorId"),
    @NamedQuery(name = "Instructors.findByName", query = "SELECT i FROM Instructors i WHERE i.name = :name"),
    @NamedQuery(name = "Instructors.findByRate", query = "SELECT i FROM Instructors i WHERE i.rate = :rate"),
    @NamedQuery(name = "Instructors.findByTeaching", query = "SELECT i FROM Instructors i WHERE i.teaching = :teaching"),
    @NamedQuery(name = "Instructors.findByAvailability", query = "SELECT i FROM Instructors i WHERE i.availability = :availability")})
public class Instructors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "instructor_id")
    private Integer instructorId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rate")
    private BigDecimal rate;
    @Size(max = 45)
    @Column(name = "teaching")
    private String teaching;
    @Size(max = 45)
    @Column(name = "availability")
    private String availability;

    public Instructors() {
    }

    public Instructors(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructors)) {
            return false;
        }
        Instructors other = (Instructors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gcapp.tjp_golfapp_final.Instructors[ id=" + id + " ]";
    }
    
}
