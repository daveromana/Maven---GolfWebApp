/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "teesheet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teesheet.findAll", query = "SELECT t FROM Teesheet t"),
    @NamedQuery(name = "Teesheet.findById", query = "SELECT t FROM Teesheet t WHERE t.id = :id"),
    @NamedQuery(name = "Teesheet.findByPlayerOne", query = "SELECT t FROM Teesheet t WHERE t.playerOne = :playerOne"),
    @NamedQuery(name = "Teesheet.findByPlayerTwo", query = "SELECT t FROM Teesheet t WHERE t.playerTwo = :playerTwo"),
    @NamedQuery(name = "Teesheet.findByPlayerThree", query = "SELECT t FROM Teesheet t WHERE t.playerThree = :playerThree"),
    @NamedQuery(name = "Teesheet.findByPlayerFour", query = "SELECT t FROM Teesheet t WHERE t.playerFour = :playerFour"),
    @NamedQuery(name = "Teesheet.findByTeeTime", query = "SELECT t FROM Teesheet t WHERE t.teeTime = :teeTime")})
public class Teesheet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "playerOne")
    private String playerOne;
    @Size(max = 45)
    @Column(name = "playerTwo")
    private String playerTwo;
    @Size(max = 45)
    @Column(name = "playerThree")
    private String playerThree;
    @Size(max = 45)
    @Column(name = "playerFour")
    private String playerFour;
    @Column(name = "teeTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teeTime;

    public Teesheet() {
    }

    public Teesheet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getPlayerThree() {
        return playerThree;
    }

    public void setPlayerThree(String playerThree) {
        this.playerThree = playerThree;
    }

    public String getPlayerFour() {
        return playerFour;
    }

    public void setPlayerFour(String playerFour) {
        this.playerFour = playerFour;
    }

    public Date getTeeTime() {
        return teeTime;
    }

    public void setTeeTime(Date teeTime) {
        this.teeTime = teeTime;
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
        if (!(object instanceof Teesheet)) {
            return false;
        }
        Teesheet other = (Teesheet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gcapp.tjpgolfappfinalModel.Teesheet[ id=" + id + " ]";
    }
    
}
