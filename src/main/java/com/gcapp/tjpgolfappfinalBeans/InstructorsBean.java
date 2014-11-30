/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.Instructors;
import com.gcapp.tjpgolfappfinalService.InstructorsFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Travis
 */
@Named("instructorsBean")
@SessionScoped
public class InstructorsBean implements Serializable {
    private List<Instructors> instructors;
    private Integer id;
    private int instructorId;
    private String name;
    private double rate;
    private String availability;
    private String teaching;
    
    @Inject
    private InstructorsFacade instructorsDAO;

      @PostConstruct
    public void initInstructorData() {
        instructors = instructorsDAO.findAll();
    }
    
    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllInstructors() {
        instructors = instructorsDAO.findAll();
        // preferred way to go to a page
        return "view-records/instructor-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }

    public String addInstructor(){
       Instructors instructor = new Instructors();
       instructor.setId(id);
       instructor.setInstructorId(instructorId);
       instructor.setName(name);
       instructor.setAvailability(availability);
       instructor.setTeaching(teaching);
       instructor.setRate(new BigDecimal(rate));
       instructorsDAO.create(instructor);
       instructors.add(instructor);
       return null;    
    }
    
    public String findInstructorById(int id){
        Instructors is = instructorsDAO.find(id);
        is.getId();
        is.getInstructorId();
        is.getName();
        is.getTeaching();
        is.getAvailability();
        is.getRate();
        return null;
    }
    
    private String updateInstructor(){
          Instructors is = new Instructors();
          is.setId(instructorId);
          is.setInstructorId(instructorId);
          is.setName(name);
          is.setTeaching(teaching);
          is.setAvailability(availability);
          is.setRate(new BigDecimal(rate));
          return null;
    }
    
    public String deleteInstructor(int id){
        Instructors is = instructorsDAO.find(id);
        instructors.remove(is);
        instructorsDAO.remove(is);
        return null;
    }

    public List<Instructors> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructors> instructors) {
        this.instructors = instructors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }

    public InstructorsFacade getInstructorsDAO() {
        return instructorsDAO;
    }

    public void setInstructorsDAO(InstructorsFacade instructorsDAO) {
        this.instructorsDAO = instructorsDAO;
    }
    
    
    
}
