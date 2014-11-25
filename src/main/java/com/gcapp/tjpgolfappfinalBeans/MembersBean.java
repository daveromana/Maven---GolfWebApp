/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.Members;
import com.gcapp.tjpgolfappfinalService.MembersFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Travis
 */

@Named("membersBean")
@SessionScoped
public class MembersBean implements Serializable{
    
    private List<Members> members;
    private int memberId;
    private String firstName;
    private String lastName;
    private String address;
    private String membershipType;
    private double quarterlyMinimum;
    
    @Inject
    private MembersFacade membersDAO;

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllMembers() {
        members = membersDAO.findAll();
        // preferred way to go to a page
        return "/view-records/members-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addMember(){
        Members member = new Members();
        member.setMemberId(memberId);
        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setAddress(address);

        
        members.add(member);
        return null;
    }
    
    public String deleteMemberRecord(Members member){
        members.remove(member);
        return null;
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
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

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public double getQuarterlyMinimum() {
        return quarterlyMinimum;
    }

    public void setQuarterlyMinimum(double quarterlyMinimum) {
        this.quarterlyMinimum = quarterlyMinimum;
    }

    public MembersFacade getMembersDAO() {
        return membersDAO;
    }

    public void setMembersDAO(MembersFacade membersDAO) {
        this.membersDAO = membersDAO;
    }
    
    
}
