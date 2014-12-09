/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;

import com.gcapp.tjpgolfappfinalModel.Registration;
import com.gcapp.tjpgolfappfinalService.RegistrationFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Travis
 */
@Named("registrationBean")
@SessionScoped
public class RegistrationBean implements Serializable{
    private List<Registration> registration;
    private Integer id;
    private String firstName;
    private String lastName;
    private String event;
    private String memberId;
    
    private RegistrationFacade registrationDAO;
    
    
    public String tournamentRegister(){
        Registration rs = new Registration();
        rs.setId(id);
        rs.setFirstName(firstName);
        rs.setLastName(lastName);
        rs.setEvent(event);
        rs.setMemberId(memberId);
        registrationDAO.create(rs);
        return "registration-success";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    public List<Registration> getRegistration() {
        return registration;
    }

    public void setRegistration(List<Registration> registration) {
        this.registration = registration;
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public RegistrationFacade getRegistrationDAO() {
        return registrationDAO;
    }

    public void setRegistrationDAO(RegistrationFacade registrationDAO) {
        this.registrationDAO = registrationDAO;
    }
    
    
    
   
}
