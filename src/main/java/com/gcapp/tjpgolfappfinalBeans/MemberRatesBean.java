/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.MembershipRates;
import com.gcapp.tjpgolfappfinalService.MembershipRatesFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author Travis
 */
@SessionScoped
@Named("memberRatesBean")
public class MemberRatesBean implements Serializable{
    private List<MembershipRates> memberRates;
    private Integer id;
    private String categories;
    private String rates;
    private String monthlyFees;
    private String charges;
    
    @Inject
    private MembershipRatesFacade memberRatesDAO;
    
    @PostConstruct
    public void initMemberData() {
        memberRates = memberRatesDAO.findAll();
    }
    
    public String retrieveMembershipData() {
        memberRates = memberRatesDAO.findAll();
        // preferred way to go to a page
        return "membership/membership";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }

    public List<MembershipRates> getMemberRates() {
        return memberRates;
    }

    public void setMemberRates(List<MembershipRates> memberRates) {
        this.memberRates = memberRates;
    }

    public MembershipRatesFacade getMemberRatesDAO() {
        return memberRatesDAO;
    }

    public void setMemberRatesDAO(MembershipRatesFacade memberRatesDAO) {
        this.memberRatesDAO = memberRatesDAO;
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

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }
    
    
    
    
}
