/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LessonsFacade getLessonsDAO() {
        return lessonsDAO;
    }

    public void setLessonsDAO(LessonsFacade lessonsDAO) {
        this.lessonsDAO = lessonsDAO;
    }
    
    
    
    
}
