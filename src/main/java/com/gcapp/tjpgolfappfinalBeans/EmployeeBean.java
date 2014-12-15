/*
 * Used in order to view employee information and perfrom CRUD operations for records.
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
    private int id;
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
     */
    //-------returns all datbase records-----//
    public String processGetAllEmployees() {
        employees = employeeDAO.findAll();
        // preferred way to go to a page
        return "view-records/employee-data";
        // Option to redirect to page
        // Return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    //----adds an employee to the database ----//
    public String addEmployee(){
        Employees newEmployees = new Employees();
        newEmployees.setId(id);
        newEmployees.setEmployeeId(employeeId);
        newEmployees.setFirstName(firstName);
        newEmployees.setLastName(lastName);
        newEmployees.setAddress(address);
        newEmployees.setCity(city);
        newEmployees.setState(state);
        newEmployees.setSocailSecurity(socialSecurity);
        newEmployees.setDateHired(dateHired);
        employeeDAO.create(newEmployees);
        employees.add(newEmployees);
        return "/admin-pages/view-records/employee-data";
    }
    // ---- deletes an employee from the database ---//
    public String deleteEmployee(int id)throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        Employees emp = employeeDAO.find(id);
        employeeDAO.remove(emp);
        this.employees = employeeDAO.findAll();
        return "admin-pages/view-records/employee-data";
    }
    
    //----updates an employee from the database ---//
    public String updateEmployee(int id)throws IllegalArgumentException {
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
       Employees emp = employeeDAO.find(id);
       emp.setEmployeeId(employeeId);
       emp.setFirstName(firstName);
       emp.setLastName(lastName);
       emp.setAddress(address);
       emp.setCity(city);
       emp.setState(state);
       emp.setZip(zip);
       emp.setSocailSecurity(socialSecurity);
       emp.setDateHired(dateHired);
       employeeDAO.edit(emp);
       this.employees = employeeDAO.findAll();
       return "/admin-pages/view-records/employee-data";
    }
    
    //---finds a record in the databse ---//
    public String findById()throws IllegalArgumentException{
        if(id <= 0){
            throw new IllegalArgumentException("ID Must Be Greater Than 0");
        }
        Employees emp = employeeDAO.find(id);
        employeeId = emp.getEmployeeId();
        firstName = emp.getFirstName();
        lastName = emp.getLastName();
        address = emp.getAddress();
        city = emp.getCity();
        state = emp.getState();
        zip = emp.getZip();
        socialSecurity = emp.getSocailSecurity();
        dateHired = emp.getDateHired();
        return "edit-employee?faces-redirect=true";
    }
    
    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)throws IllegalArgumentException {
//        if(id <= 0){
//            throw new IllegalArgumentException("ID Must Be Greater Than 0");
//        }
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)throws IllegalArgumentException {
//        if(employeeId <= 0){
//            throw new IllegalArgumentException("ID Must Be Greater Than 0");
//        }
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)throws IllegalArgumentException {
//        if(firstName.isEmpty()){
//            throw new IllegalArgumentException("Please Enter A First Name");
//        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws IllegalArgumentException {
//        if(lastName.isEmpty()){
//            throw new IllegalArgumentException("Please Enter A Last Name");
//        }
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address)throws IllegalArgumentException {
//        if(address.isEmpty()){
//            throw new IllegalArgumentException("Please Enter An Address");
//        }
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city)throws IllegalArgumentException {
//        if(city.isEmpty()){
//            throw new IllegalArgumentException("Please Enter A City");
//        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state)throws IllegalArgumentException {
//        if(state.isEmpty()){
//            throw new IllegalArgumentException("Please Enter A State");
//        }
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip)throws IllegalArgumentException {
//        if(zip.isEmpty()){
//            throw new IllegalArgumentException("Please Enter A Zip");
//        }
        this.zip = zip;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity)throws IllegalArgumentException {
//        if(socialSecurity.isEmpty()){
//            throw new IllegalArgumentException("Enter A Valid Socail Security Number");
//        }
        this.socialSecurity = socialSecurity;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired)throws IllegalArgumentException {
//        if(dateHired.isEmpty()){
//            throw new IllegalArgumentException("Enter Date Hired");
//        }
        this.dateHired = dateHired;
    }

    public EmployeesFacade getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeesFacade employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
   
    
    
    
}
