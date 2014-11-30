/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalModel;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "membership_rates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MembershipRates.findAll", query = "SELECT m FROM MembershipRates m"),
    @NamedQuery(name = "MembershipRates.findById", query = "SELECT m FROM MembershipRates m WHERE m.id = :id"),
    @NamedQuery(name = "MembershipRates.findByCategories", query = "SELECT m FROM MembershipRates m WHERE m.categories = :categories"),
    @NamedQuery(name = "MembershipRates.findByRates", query = "SELECT m FROM MembershipRates m WHERE m.rates = :rates"),
    @NamedQuery(name = "MembershipRates.findByMonthlyFees", query = "SELECT m FROM MembershipRates m WHERE m.monthlyFees = :monthlyFees"),
    @NamedQuery(name = "MembershipRates.findByOtherCharges", query = "SELECT m FROM MembershipRates m WHERE m.otherCharges = :otherCharges")})
public class MembershipRates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "categories")
    private String categories;
    @Size(max = 45)
    @Column(name = "rates")
    private String rates;
    @Size(max = 45)
    @Column(name = "monthly_fees")
    private String monthlyFees;
    @Size(max = 45)
    @Column(name = "other_charges")
    private String otherCharges;

    public MembershipRates() {
    }

    public MembershipRates(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(String monthlyFees) {
        this.monthlyFees = monthlyFees;
    }

    public String getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(String otherCharges) {
        this.otherCharges = otherCharges;
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
        if (!(object instanceof MembershipRates)) {
            return false;
        }
        MembershipRates other = (MembershipRates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gcapp.tjpgolfappfinalModel.MembershipRates[ id=" + id + " ]";
    }
    
}
