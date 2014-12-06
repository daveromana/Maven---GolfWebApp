/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$( document ).ready(function() {
//All validation for forms that submit to the database
$('#updateInstructor').click(function() {

    if($('#instId') === ""){
        alert("Please Enter The Insturctors Id");
    }
    
    if($('#instName') === ""){
        alert("Please Enter The Insturctors Name");
    }
    
    if($('#rate') === ""){
        alert("Please Enter The Insturctors Rate");
    }
    
    if($('#teaching') === ""){
        alert("Please Enter The Insturctors Teaching Method");
    }
    
    if($('#availability') === ""){
        alert("Please Enter The Insturctors Teaching Availability");
    }

});

$('#updateEmployee').click(function() {
    
    if($('#empid') === ""){
        alrert("Please Enter The Employees Id");
    }
    
    if($('#fname') === ""){
        alert("Please Enter The Employees First Name");
    }
    
    if($('#lname') === ""){
        alert("Please Enter The Employees Last Name");
    }
    
    if($('#address') === ""){
        alert("Please Enter The Employees Address");
    }
    
    if($('#city') === ""){
        alert("Please Enter The Employees City");
    }
    
    if($('#state') === ""){
        alert("Please Enter The Employees State");
    }
    
    if($('#Zip') === ""){
        alert("Please Enter The Employees Zip");
    }
    
    if($('#datehired') === ""){
        alert("Please Enter The Employees Hire Date");
    }
    
    if($('#ssn') === ""){
        alert("Please Enter The Employees Social Security Number");
    }
    
});

$('#updateGolfShop').click(function() {

    if($('#gsID') === ""){
        alert("Please Enter The Golf Shop Id");
    }
    
    if($('#greenSales') === ""){
        alert("Please Enter The Golf Shop Greens Sales");
    }
    
    if($('#cartSales') === ""){
        alert("Please Enter The Golf Shop Cart Sales");
    }
    
    if($('#accessoresSales') === ""){
        alert("Please Enter The Golf Shop Sales");
    }
    
    if($('#memberCharges') === ""){
        alert("Please Enter The Golf Shop Member Charges");
    }
    
});

$('#updateMember').click(function() {
    
    if($('#memId') === ""){
        alrert("Please Enter The Member Id");
    }
    
    if($('#fname') === ""){
        alert("Please Enter The Member First Name");
    }
    
    if($('#lname') === ""){
        alert("Please Enter The Member Last Name");
    }
    
    if($('#address') === ""){
        alert("Please Enter The Member Address");
    }
    
    if($('#city') === ""){
        alert("Please Enter The Member City");
    }
    
    if($('#state') === ""){
        alert("Please Enter The Member State");
    }
    
    if($('#zip') === ""){
        alert("Please Enter The Member Zip");
    }
    
    if($('#membershipType') === ""){
        alert("Please Enter Membership Type ");
    }
    
    if($('#quartMin') === ""){
        alert("Please Enter The Members Quarterly Minimum");
    }
    
});

$('#updateRestaurant').click(function() {

    if($('#drinkCharge') === ""){
        alert("Please Enter Drink Charges");
    }
    
    if($('#foodCharge') === ""){
        alert("Please Enter Food Charges");
    }
    
    if($('#memberId') === ""){
        alert("Please Enter The Members Id Charged To");
    }
    

    
});

$('#addEmployee').click(function() {
    
    if($('#empid') === ""){
        alrert("Please Enter The Employees Id");
    }
    
    if($('#fname') === ""){
        alert("Please Enter The Employees First Name");
    }
    
    if($('#lname') === ""){
        alert("Please Enter The Employees Last Name");
    }
    
    if($('#address') === ""){
        alert("Please Enter The Employees Address");
    }
    
    if($('#city') === ""){
        alert("Please Enter The Employees City");
    }
    
    if($('#state') === ""){
        alert("Please Enter The Employees State");
    }
    
    if($('#Zip') === ""){
        alert("Please Enter The Employees Zip");
    }
    
    if($('#dateHired') === ""){
        alert("Please Enter The Employees Hire Date");
    }
    
    if($('#ssn') === ""){
        alert("Please Enter The Employees Social Security Number");
    }
    
});

$('#addGolfShop').click(function() {

    if($('#gsID') === ""){
        alert("Please Enter The Golf Shop Id");
    }
    
    if($('#greenSales') === ""){
        alert("Please Enter The Golf Shop Greens Sales");
    }
    
    if($('#cartSales') === ""){
        alert("Please Enter The Golf Shop Cart Sales");
    }
    
    if($('#shopSales') === ""){
        alert("Please Enter The Golf Shop Sales");
    }
    
    if($('#memberCharges') === ""){
        alert("Please Enter The Golf Shop Member Charges");
    }
    
});

$('#addInsctructor').click(function() {

    if($('#Id') === ""){
        alert("Please Enter The Insturctors Record Id");
    }
    
    if($('#instId') === ""){
        alert("Please Enter The Insturctors Id");
    }
    
    if($('#instName') === ""){
        alert("Please Enter The Insturctors Name");
    }
    
    if($('#rate') === ""){
        alert("Please Enter The Insturctors Rate");
    }
    
    if($('#teaching') === ""){
        alert("Please Enter The Insturctors Teaching Method");
    }
    
    if($('#availability') === ""){
        alert("Please Enter The Insturctors Teaching Availability");
    }

});

$('#addMember').click(function() {
    
    if($('#membId') === ""){
        alrert("Please Enter The Member Id");
    }
    
    if($('#fname') === ""){
        alert("Please Enter The Member First Name");
    }
    
    if($('#lname') === ""){
        alert("Please Enter The Member Last Name");
    }
    
    if($('#address') === ""){
        alert("Please Enter The Member Address");
    }
    
    if($('#city') === ""){
        alert("Please Enter The Member City");
    }
    
    if($('#state') === ""){
        alert("Please Enter The Member State");
    }
    
    if($('#zip') === ""){
        alert("Please Enter The Member Zip");
    }
    
    if($('#membershipType') === ""){
        alert("Please Enter Membership Type ");
    }
    
    if($('#quartMin') === ""){
        alert("Please Enter The Members Quarterly Minimum");
    }
    
});

$('#addRestaurant').click(function() {

    if($('#restId') === ""){
        alert("Please Enter Resturant Id");
    }

    if($('#drinkCharge') === ""){
        alert("Please Enter Drink Charges");
    }
    
    if($('#foodCharge') === ""){
        alert("Please Enter Food Charges");
    }
    
    if($('#memberId') === ""){
        alert("Please Enter The Members Id Charged To");
    }
    
});

});