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
    private BigDecimal golfShopId;
    private Integer id;
    private BigDecimal greensSales;
    private BigDecimal cartSales;
    private BigDecimal shopSales;
    private BigDecimal memberCharges;
 
    
    @Inject
    private GolfShopFacade golfshopDAO;
    
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
        golfShopData = golfshopDAO.findAll();
        // preferred way to go to a page
        return "view-records/golf-shop-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addGolfShopData(){
        GolfShop gs = new GolfShop();
        gs.setId(id);
        gs.setGolfShopId(golfShopId);
        gs.setGreensFees(greensSales);
        gs.setCartFees(cartSales);
        gs.setShopSales(shopSales);
        gs.setMemberCharges(memberCharges);
        golfshopDAO.create(gs);
        golfShopData.add(gs);
        return null;
    }
    
    public String deleteGolfShopRecord(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        GolfShop gs = golfshopDAO.find(id);
        golfShopData.remove(gs);
        golfshopDAO.remove(gs);
        return null;
    }
        
    public String findById(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        GolfShop gs = golfshopDAO.find(id);
        golfShopId = gs.getGolfShopId();
        greensSales = gs.getGreensFees();
        cartSales = gs.getCartFees();
        shopSales = gs.getShopSales();
        memberCharges = gs.getMemberCharges();
        return "edit-golf-shop-record?faces-redirect=true";
    }
    
    public String updateGolfShopData(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        GolfShop gs = golfshopDAO.find(id);
        gs.setGolfShopId(golfShopId);
        gs.setGreensFees(greensSales);
        gs.setCartFees(cartSales);
        gs.setShopSales(shopSales);
        gs.setMemberCharges(memberCharges);
        golfshopDAO.edit(gs);
        return "view-records/golf-shop-data";
    }

    public List<GolfShop> getGolfShopData() {
        return golfShopData;
    }

    public void setGolfShopData(List<GolfShop> golfShopData) {
        this.golfShopData = golfShopData;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        this.id = id;
    }

    public GolfShopFacade getGolfshopDAO() {
        return golfshopDAO;
    }

    public void setGolfshopDAO(GolfShopFacade golfshopDAO) throws IllegalArgumentException{
        this.golfshopDAO = golfshopDAO;
    }

    public GolfShopFacade getGolfshopService() {
        return golfshopDAO;
    }

    public void setGolfshopService(GolfShopFacade golfshopService)throws IllegalArgumentException {
        this.golfshopDAO = golfshopService;
    }

    public BigDecimal getGolfShopId() {
        return golfShopId;
    }

    public void setGolfShopId(BigDecimal golfShopId)throws IllegalArgumentException {
        this.golfShopId = golfShopId;
    }

    public BigDecimal getGreensSales() {
        return greensSales;
    }

    public void setGreensSales(BigDecimal greensSales)throws IllegalArgumentException {
        this.greensSales = greensSales;
    }

    public BigDecimal getCartSales() {
        return cartSales;
    }

    public void setCartSales(BigDecimal cartSales)throws IllegalArgumentException {
        this.cartSales = cartSales;
    }

    public BigDecimal getShopSales() {
        return shopSales;
    }

    public void setShopSales(BigDecimal shopSales)throws IllegalArgumentException {
        this.shopSales = shopSales;
    }

    public BigDecimal getMemberCharges() {
        return memberCharges;
    }

    public void setMemberCharges(BigDecimal memberCharges)throws IllegalArgumentException {
        this.memberCharges = memberCharges;
    }
    
    

    
    
}
