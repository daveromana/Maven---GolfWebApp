/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;


import com.gcapp.tjpgolfappfinalModel.Employees;
import com.gcapp.tjpgolfappfinalService.EmployeesFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Travis
 */
@Named("employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    private List<Employees> employees;
    private Integer id;
    private int employeeId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String socialSecurity;
    private String dateHired;     
    
        @Inject
    private EmployeesFacade employeeDAO;

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */  public String processGetAllEmployees() {
        employees = employeeDAO.findAll();
        // preferred way to go to a page
        
        return "view-records/employee-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
  

       
    public String addEmployee(Employees employee){
        employee = new Employees();
        employee.setId(id);
        employee.setEmployeeId(employeeId);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setAddress(address);
        employee.setCity(city);
        employee.setState(state);
        employee.setSocailSecurity(socialSecurity);
        employee.setDateHired(dateHired);
        employeeDAO.create(employee);
        return "view-records/employee-data";
    }
    
    public String updateEmployee(){
       return "view-records/employee-data";
    }
    
    
    public String deleteEmployee(){
        return "view-records/employee-data";
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public EmployeesFacade getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeesFacade employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
   
    
    
}
