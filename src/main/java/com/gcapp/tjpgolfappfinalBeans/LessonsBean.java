/*
   Used in order to book lessons and return records to the view for employees to see the schedule
 */
package com.gcapp.tjpgolfappfinalBeans;

import com.gcapp.tjpgolfappfinalModel.Lessons;
import com.gcapp.tjpgolfappfinalService.LessonsFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Travis
 */

@Named("lessonsBean")
@SessionScoped
public class LessonsBean implements Serializable{
    private List<Lessons> lessons;
    private Integer id;
    private String firstName;
    private String lastName;
    private String date;
    private String time;
    
    
    @Inject
    private LessonsFacade lessonsDAO;

    //----users book there own lessons. this adds a record to the lessons table in the database----//
    public String addNewLesson(){
        Lessons ls = new Lessons();
        ls.setId(id);
        ls.setFirstName(firstName);
        ls.setLastName(lastName);
        ls.setDate(date);
        ls.setTime(time);
        lessonsDAO.create(ls);
        return "lesson-booked?faces-redirect=true";
    }

     //----finds all records in the database----//
    public String processGetAllGolfLessons() {
        lessons = lessonsDAO.findAll();
        return "lessons-view";
    }
    
    public List<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lessons> lessons) {
        this.lessons = lessons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id <= 0){
            throw new IllegalArgumentException("Id must be greater than 0");
        }
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("First Name Cant Be Empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("Last Name Cant Be Empty");
        }
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date.isEmpty()){
            throw new IllegalArgumentException("Date Cant Be Empty");
        }
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if(time.isEmpty()){
            throw new IllegalArgumentException("Time Cant Be Empty");
        }
        this.time = time;
    }

    public LessonsFacade getLessonsDAO() {
        return lessonsDAO;
    }

    public void setLessonsDAO(LessonsFacade lessonsDAO) {
        this.lessonsDAO = lessonsDAO;
    }
    
    
    
    
}
