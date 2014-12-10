/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.Members;
import com.gcapp.tjpgolfappfinalService.MembersFacade;
import java.io.Serializable;
import java.math.BigDecimal;
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
    private Integer id;
    private int memberId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String membershipType;
    private BigDecimal quarterlyMinimum;
    
    @Inject
    private MembersFacade membersDAO;
   
    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    //----gets all database records of type member -----//
    public String processGetAllMembers() {
        members = membersDAO.findAll();
        // preferred way to go to a page
        return "view-records/members-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    //-----adds a new record to the database----//
    public String addMember(){
        Members member = new Members();
        member.setId(id);
        member.setMemberId(memberId);
        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setAddress(address);
        member.setCity(city);
        member.setState(state);
        member.setZip(zip);
        member.setMembershipType(membershipType);
        member.setQuarterlyMinimum(quarterlyMinimum);
        membersDAO.create(member);
        members.add(member);
        return null;
    }
    //------deletes a record from the database----//
    public String deleteMemberRecord(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        Members mb = membersDAO.find(id);
        members.remove(mb);
        membersDAO.remove(mb);
        return null;
    }
    //------finds a record from the database-----//
    public String findMember(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        Members ms = membersDAO.find(id);
        memberId = ms.getMemberId();
        firstName = ms.getFirstName();
        lastName = ms.getLastName();
        address = ms.getAddress();
        city = ms.getCity();
        state = ms.getState();
        zip = ms.getZip();
        membershipType = ms.getMembershipType();
        quarterlyMinimum = ms.getQuarterlyMinimum();
        return "edit-member?faces-redirect=true";
    }
    //-----updates a record of type member in the database------////
    public String updateMember(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        Members ms = membersDAO.find(id);
        ms.setMemberId(memberId);
        ms.setFirstName(firstName);
        ms.setLastName(lastName);
        ms.setAddress(address);
        ms.setCity(city);
        ms.setState(state);
        ms.setZip(zip);
        ms.setMembershipType(membershipType);
        ms.setQuarterlyMinimum(quarterlyMinimum);
        membersDAO.edit(ms);
        this.members = membersDAO.findAll();
        return "/admin-pages/view-records/members-data";
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

    public void setMemberId(int memberId)throws IllegalArgumentException {
        if(memberId <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        this.memberId = memberId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city)throws IllegalArgumentException {
        if(city.isEmpty()){
             throw new IllegalArgumentException("Please Enter A City");
        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state)throws IllegalArgumentException {
        if(state.isEmpty()){
             throw new IllegalArgumentException("Please Enter A State");
        }
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip)throws IllegalArgumentException {
        if(zip.isEmpty()){
             throw new IllegalArgumentException("Please Enter A Zip");
        }
        this.zip = zip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id)throws IllegalArgumentException {
         if(id <= 0){
             throw new IllegalArgumentException("Id cant be less than 0");
        }
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)throws IllegalArgumentException {
        if(firstName.isEmpty()){
             throw new IllegalArgumentException("Please Enter A First Name");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws IllegalArgumentException {
         if(lastName.isEmpty()){
             throw new IllegalArgumentException("Please Enter A Last Name");
        }
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address)throws IllegalArgumentException {
         if(address.isEmpty()){
             throw new IllegalArgumentException("Please Enter An Address");
        }
        this.address = address;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType)throws IllegalArgumentException {
         if(membershipType.isEmpty()){
             throw new IllegalArgumentException("Please Enter Membership Type");
        }
        this.membershipType = membershipType;
    }

    public BigDecimal getQuarterlyMinimum() {
        return quarterlyMinimum;
    }

    public void setQuarterlyMinimum(BigDecimal quarterlyMinimum)throws IllegalArgumentException {
        this.quarterlyMinimum = quarterlyMinimum;
    }

    public MembersFacade getMembersDAO() {
        return membersDAO;
    }

    public void setMembersDAO(MembersFacade membersDAO)throws IllegalArgumentException {
        this.membersDAO = membersDAO;
    }
    
    
}
