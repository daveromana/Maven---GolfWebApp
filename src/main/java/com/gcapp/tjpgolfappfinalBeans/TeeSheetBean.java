/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.Teesheet;
import com.gcapp.tjpgolfappfinalService.TeesheetFacade;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author Travis
 */
@Named("teeSheetBean")
@SessionScoped
public class TeeSheetBean implements Serializable {
    private List<Teesheet> teeSheet;
    private Integer id;
    private String playerOne;
    private String playerTwo;
    private String playerThree;
    private String playerFour;
    private Date teeTime;
           
    @Inject
    private TeesheetFacade teeSheetDAO;

    public List<Teesheet> getTeeSheet() {
        return teeSheet;
    }
    
    //-------------allows users to book online tee times and saves the to the database-----------//
    public String addNewTeeTime(){
        Teesheet ts = new Teesheet();
        ts.setId(id);
        ts.setPlayerOne(playerOne);
        ts.setPlayerTwo(playerTwo);
        ts.setPlayerThree(playerThree);
        ts.setPlayerFour(playerFour);
        ts.setTeeTime(teeTime);
        teeSheetDAO.create(ts);
        teeSheet.add(ts);
        return "index?faces-redirect=true";
    }
    
       public String processGetTeeTimes() {
        teeSheet = teeSheetDAO.findAll();
        return "tee-sheet-view";
    }

    public void setTeeSheet(List<Teesheet> teeSheet) {
        this.teeSheet = teeSheet;
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

    

    public TeesheetFacade getTeeSheetDAO() {
        return teeSheetDAO;
    }

    public void setTeeSheetDAO(TeesheetFacade teeSheetDAO) {
        this.teeSheetDAO = teeSheetDAO;
    }
    
    
    
    
    
}
