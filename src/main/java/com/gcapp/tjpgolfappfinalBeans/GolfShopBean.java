/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.GolfShop;
import com.gcapp.tjpgolfappfinalService.GolfShopFacade;
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
@SessionScoped
@Named("golfShopBean")
public class GolfShopBean implements Serializable {
    private List<GolfShop> golfShopData;
    private int golfShopId;
    private int id;
    private double greensSales;
    private double cartSales;
    private double shopSales;
    private double memberCharges;
    
     @Inject
    private GolfShopFacade golfshopService;
    
//    @PostConstruct
//    public void initShopData() {
//        golfShopData = golfshopService.findAll();
//    }

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllGolfShopData() {
        golfShopData = golfshopService.findAll();
        // preferred way to go to a page
        return "view-records/golf-shop-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addGolfShopData(){
        GolfShop gs = new GolfShop();
        gs.setId(id);
        gs.setGolfShopId(new BigDecimal(golfShopId));
        gs.setGreensFees(new BigDecimal(greensSales));
        gs.setCartFees(new BigDecimal(cartSales));
        gs.setShopSales(new BigDecimal(shopSales));
        gs.setMemberCharges(new BigDecimal(memberCharges));
        golfShopData.add(gs);
        return "view-records/golf-shop-data";
    }
    
    public String deleteGolfShopRecord(GolfShop golfShop){
        golfShopData.remove(golfShop);
        return null;
    }

    public List<GolfShop> getGolfShopData() {
        return golfShopData;
    }

    public void setGolfShopData(List<GolfShop> golfShopData) {
        this.golfShopData = golfShopData;
    }

    public int getGolfShopId() {
        return golfShopId;
    }

    public void setGolfShopId(int golfShopId) {
        this.golfShopId = golfShopId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGreensSales() {
        return greensSales;
    }

    public void setGreensSales(double greensSales) {
        this.greensSales = greensSales;
    }

    public double getCartSales() {
        return cartSales;
    }

    public void setCartSales(double cartSales) {
        this.cartSales = cartSales;
    }

    public double getShopSales() {
        return shopSales;
    }

    public void setShopSales(double shopSales) {
        this.shopSales = shopSales;
    }

    public double getMemberCharges() {
        return memberCharges;
    }

    public void setMemberCharges(double memberCharges) {
        this.memberCharges = memberCharges;
    }

    public GolfShopFacade getGolfshopService() {
        return golfshopService;
    }

    public void setGolfshopService(GolfShopFacade golfshopService) {
        this.golfshopService = golfshopService;
    }

    
}
