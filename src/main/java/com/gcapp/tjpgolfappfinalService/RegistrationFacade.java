/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalService;

import com.gcapp.tjpgolfappfinalModel.Registration;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Travis
 */
@Stateless
public class RegistrationFacade extends AbstractFacade<Registration> {
    @PersistenceContext(unitName = "com.gcapp_TJP_GolfApp_Final_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrationFacade() {
        super(Registration.class);
    }
    
}
