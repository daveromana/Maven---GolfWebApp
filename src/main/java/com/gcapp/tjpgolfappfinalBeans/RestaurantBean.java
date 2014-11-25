/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;

import com.gcapp.tjpgolfappfinalModel.Restaurant;
import com.gcapp.tjpgolfappfinalService.RestaurantFacade;
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
@Named("restuarantBean")
@SessionScoped
public class RestaurantBean implements Serializable {
    
    private List<Restaurant> restaurant;
    private BigDecimal drinkCharges;
    private BigDecimal foodCharges;
    private Integer memberId;
    
    
    @Inject
    private RestaurantFacade restaurantDAO;

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllRestaurantData() {
        restaurant = restaurantDAO.findAll();
        // preferred way to go to a page
        return "view-records/restaurant-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addRestaurantData(){
        Restaurant rs = new Restaurant();
        rs.setMemberId(memberId);
        rs.setDrinkCharges(drinkCharges);
        rs.setFoodCharges(foodCharges);
        restaurant.add(rs);
        return null;
    }
    
    public String deleteRestuarantData(Restaurant restuarant){
        restaurant.remove(restuarant);
        return null;
    }

    public List<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(List<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public BigDecimal getDrinkCharges() {
        return drinkCharges;
    }

    public void setDrinkCharges(BigDecimal drinkCharges) {
        this.drinkCharges = drinkCharges;
    }

    public BigDecimal getFoodCharges() {
        return foodCharges;
    }

    public void setFoodCharges(BigDecimal foodCharges) {
        this.foodCharges = foodCharges;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public RestaurantFacade getRestaurantDAO() {
        return restaurantDAO;
    }

    public void setRestaurantDAO(RestaurantFacade restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }
    
    

}
