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
    private BigDecimal rate;
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
    //-----gets all databse records---//
    public String processGetAllInstructors() {
        instructors = instructorsDAO.findAll();
        // preferred way to go to a page
        return "view-records/instructor-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    //----adds a record to the database----//
    public String addInstructor(){
       Instructors instructor = new Instructors();
       instructor.setId(id);
       instructor.setInstructorId(instructorId);
       instructor.setName(name);
       instructor.setAvailability(availability);
       instructor.setTeaching(teaching);
       instructor.setRate(rate);
       instructorsDAO.create(instructor);
       instructors.add(instructor);
       return null;    
    }
    //-----finds a database record of type instructor----//
    public String findInstructorById(int id)throws IllegalArgumentException{

        Instructors is = instructorsDAO.find(id);
        instructorId = is.getInstructorId();
        name = is.getName();
        teaching = is.getTeaching();
        availability = is.getAvailability();
        rate = is.getRate();
        return "edit-instructor?faces-redirect=true";
    }
    //----updates an instructor record----//
    public String updateInstructor(int id)throws IllegalArgumentException{

          Instructors is = instructorsDAO.find(id);
          is.setInstructorId(instructorId);
          is.setName(name);
          is.setTeaching(teaching);
          is.setAvailability(availability);
          is.setRate(rate);
          instructorsDAO.edit(is);
          this.instructors = instructorsDAO.findAll();
          return "/admin-pages/view-records/instructor-data?faces-redirect=true";
    }
    //----deletes an instructor record----//
    public String deleteInstructor(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
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

    public void setId(Integer id)throws IllegalArgumentException {
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        this.id = id;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId)throws IllegalArgumentException {
        if(instructorId <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)throws IllegalArgumentException {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Please Enter A Name");
        }
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate)throws IllegalArgumentException {
        this.rate = rate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability)throws IllegalArgumentException {
        if(availability.isEmpty()){
            throw new IllegalArgumentException("Please Enter Availability");
        }
        this.availability = availability;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching)throws IllegalArgumentException {
        if(teaching.isEmpty()){
            throw new IllegalArgumentException("Please Enter Teaching Type");
        }
        this.teaching = teaching;
    }

    public InstructorsFacade getInstructorsDAO() {
        return instructorsDAO;
    }

    public void setInstructorsDAO(InstructorsFacade instructorsDAO) {
        this.instructorsDAO = instructorsDAO;
    }
    
    
    
}
