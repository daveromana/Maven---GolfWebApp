/*
 * Used to return membership rates from database records to the view.
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
    
    //-----gets membership rates from the database to display on the view----///
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
        if(id <=0 ){
            throw new IllegalArgumentException("ID cant be less than 0");
        }
        this.id = id;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        if(categories.isEmpty()){
            throw new IllegalArgumentException("Must have a membership category");
        }
        this.categories = categories;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        if(rates.isEmpty()){
            throw new IllegalArgumentException("Must have a membership rate");
        }
        this.rates = rates;
    }

    public String getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(String monthlyFees) {
         if(monthlyFees.isEmpty()){
            throw new IllegalArgumentException("Must have monthly fees");
        }
        this.monthlyFees = monthlyFees;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
         if(charges.isEmpty()){
            throw new IllegalArgumentException("Must have charges");
        }
        this.charges = charges;
    }
    
    
    
    
}
