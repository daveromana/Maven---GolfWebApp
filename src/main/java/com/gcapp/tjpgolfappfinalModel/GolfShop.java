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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "golf_shop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GolfShop.findAll", query = "SELECT g FROM GolfShop g"),
    @NamedQuery(name = "GolfShop.findById", query = "SELECT g FROM GolfShop g WHERE g.id = :id"),
    @NamedQuery(name = "GolfShop.findByGolfShopId", query = "SELECT g FROM GolfShop g WHERE g.golfShopId = :golfShopId"),
    @NamedQuery(name = "GolfShop.findByGreensFees", query = "SELECT g FROM GolfShop g WHERE g.greensFees = :greensFees"),
    @NamedQuery(name = "GolfShop.findByCartFees", query = "SELECT g FROM GolfShop g WHERE g.cartFees = :cartFees"),
    @NamedQuery(name = "GolfShop.findByShopSales", query = "SELECT g FROM GolfShop g WHERE g.shopSales = :shopSales"),
    @NamedQuery(name = "GolfShop.findByMemberCharges", query = "SELECT g FROM GolfShop g WHERE g.memberCharges = :memberCharges")})
public class GolfShop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "golf_shop_id")
    private BigDecimal golfShopId;
    @Column(name = "greens_fees")
    private BigDecimal greensFees;
    @Column(name = "cart_fees")
    private BigDecimal cartFees;
    @Column(name = "shop_sales")
    private BigDecimal shopSales;
    @Column(name = "member_charges")
    private BigDecimal memberCharges;

    public GolfShop() {
    }

    public GolfShop(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getGolfShopId() {
        return golfShopId;
    }

    public void setGolfShopId(BigDecimal golfShopId) {
        this.golfShopId = golfShopId;
    }

    public BigDecimal getGreensFees() {
        return greensFees;
    }

    public void setGreensFees(BigDecimal greensFees) {
        this.greensFees = greensFees;
    }

    public BigDecimal getCartFees() {
        return cartFees;
    }

    public void setCartFees(BigDecimal cartFees) {
        this.cartFees = cartFees;
    }

    public BigDecimal getShopSales() {
        return shopSales;
    }

    public void setShopSales(BigDecimal shopSales) {
        this.shopSales = shopSales;
    }

    public BigDecimal getMemberCharges() {
        return memberCharges;
    }

    public void setMemberCharges(BigDecimal memberCharges) {
        this.memberCharges = memberCharges;
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
        if (!(object instanceof GolfShop)) {
            return false;
        }
        GolfShop other = (GolfShop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gcapp.tjp_golfapp_final.GolfShop[ id=" + id + " ]";
    }
    
}
