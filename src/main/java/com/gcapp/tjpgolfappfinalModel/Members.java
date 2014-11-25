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
@Table(name = "members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findById", query = "SELECT m FROM Members m WHERE m.id = :id"),
    @NamedQuery(name = "Members.findByMemberId", query = "SELECT m FROM Members m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "Members.findByFirstName", query = "SELECT m FROM Members m WHERE m.firstName = :firstName"),
    @NamedQuery(name = "Members.findByLastName", query = "SELECT m FROM Members m WHERE m.lastName = :lastName"),
    @NamedQuery(name = "Members.findByAddress", query = "SELECT m FROM Members m WHERE m.address = :address"),
    @NamedQuery(name = "Members.findByCity", query = "SELECT m FROM Members m WHERE m.city = :city"),
    @NamedQuery(name = "Members.findByState", query = "SELECT m FROM Members m WHERE m.state = :state"),
    @NamedQuery(name = "Members.findByZip", query = "SELECT m FROM Members m WHERE m.zip = :zip"),
    @NamedQuery(name = "Members.findByMembershipType", query = "SELECT m FROM Members m WHERE m.membershipType = :membershipType"),
    @NamedQuery(name = "Members.findByQuarterlyMinimum", query = "SELECT m FROM Members m WHERE m.quarterlyMinimum = :quarterlyMinimum")})
public class Members implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "member_id")
    private Integer memberId;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "address")
    private String address;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Size(max = 45)
    @Column(name = "state")
    private String state;
    @Size(max = 45)
    @Column(name = "zip")
    private String zip;
    @Size(max = 45)
    @Column(name = "membership_type")
    private String membershipType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quarterly_minimum")
    private BigDecimal quarterlyMinimum;

    public Members() {
    }

    public Members(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public BigDecimal getQuarterlyMinimum() {
        return quarterlyMinimum;
    }

    public void setQuarterlyMinimum(BigDecimal quarterlyMinimum) {
        this.quarterlyMinimum = quarterlyMinimum;
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
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gcapp.tjp_golfapp_final.Members[ id=" + id + " ]";
    }
    
}
