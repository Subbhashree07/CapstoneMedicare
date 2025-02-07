package com.simplilearn.CapstoneMedicare.stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.simplilearn.CapstoneMedicare.pageobjects.RegisterUser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Class to Sign up as a new user 
public class Customerregistration {

	WebDriver driver=Baseclass.driver;
	RegisterUser registeruser = new RegisterUser(driver);
    
	//Opens the medicare website
	@When("I have opened the mediCare application in browser")
	public void openApp() {
		driver.get("http://localhost:8081/medicare/");
	}
    
	//Clicks on Sign Up button
	@Given("click on Sign Up link")
	public void click_on_Sign_Up_link() throws InterruptedException
	{   
		registeruser.clickSignup();
	}
    
	//Enters customer details provided by user
	@When("user enters customer details")
	public void user_enters_customer_details()
	{
		String email1= Baseclass.randomString()+"@abc.com";
	    registeruser.setFirstName("Subbhashree");
		registeruser.setLastName("Varatharajan");
		registeruser.setEmail(email1);
		registeruser.setContactNumber("9854672310");
		registeruser.setPwd("Subi@123");
		registeruser.confirmpwd("Subi@123");
		registeruser.selectRole();
	}
    
	//Clicks on Next-Billing button
	@When("clicks on Next-Billing button")
	public void clicks_on_Next_Billing_button()
	{
		registeruser.clickNext();
	}
    
	//Fills in the delivery address provided by user
	@When("user fills in delivery address details")
	public void user_fills_in_delivery_address_details() throws InterruptedException
	{
		registeruser.enterAddress("12", "T.nagar", "Chennai", "600001", "TamilNadu","India");
	}
	
	//Clicks on Next-Confirm button to proceed signup
	@When("clicks on Next-Confirm button")
	public void clicks_on_Next_Confirm_button() throws InterruptedException
	{
		registeruser.clickNextConfirm();
	}
	
	//Clicks on Confirm button
	@When("click on confirm button")
	public void click_on_confirm_button()
	{
		registeruser.confirmbilling();
	}
    
	//Check if all the entered user details are displayed
	@Then("user is displayed with the fed information")
	public void user_is_displayed_with_the_fed_information()
	{
		Assert.assertTrue(driver.getPageSource().contains("Personal Details"));
		System.out.println("Website is displayed with entered user details and billing address");
	}

	
	//To check if the user is successfully registered with the website
	@Then("user should see the message {string}")
	public void confirmationmessage(String loginconfirmation) {
		Assert.assertTrue(driver.getPageSource().contains("You can use your email address as username to login!"));
		System.out.println("User Subbhashree Varatharajan is successfully registered");
	}

}