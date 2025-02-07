package com.simplilearn.CapstoneMedicare.stepdefinitions;
import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.simplilearn.CapstoneMedicare.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login{
	
	WebDriver driver=Baseclass.driver;
	LoginPage loginuser= new LoginPage(driver);
	
	//Clicks on Login button
	@When("the user clicks on login link")
	public void the_user_clicks_on_login_link() throws InterruptedException
	{
		
	    loginuser.clicklogin();
	}
	
	//Enters invalid username and password
	@When("the user enters invalid username {string} and password {string}")
	public void the_user_enters_invalid_username_and_password(String username,String password) throws InterruptedException
	{
		loginuser.loginUser(username,password);
		
	}
	
	//Clicks on Login Button
	@When("clicks on the login Button")
	public void clicks_on_the_login_Button() throws InterruptedException
	{
		loginuser.login();
		
		
	}
	
	//To validate if warning message is displayed on entering invalid username and password
	@Then ("the user should see the error message {string}")
	public void the_user_should_see_the_error_message(String errormsg) throws InterruptedException
	{
		WebElement errmsgelement = driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']"));
		String actualmsg= errmsgelement.getText();
		assertEquals(actualmsg, errormsg);
		//Thread.sleep(2000);
	}
	
	
	//Enters valid username and password
	@When("the user enters valid username {string} and password {string}")
	public void the_user_enters_valid_username_and_password(String username,String password) throws InterruptedException
	{
		loginuser.loginUser(username,password);
	}
	
	//Checks if the user is logged in with valid username and password
	@Then ("the user should be directed to the Home page")
	public void the_user_should_be_directed_to_the_Home_page()
	{
		Assert.assertTrue(driver.getPageSource().contains("Subbhashree Varatharajan"));
		System.out.println("User Subbhashree Varatharajan is successfully logged in to the Medicare website");
	}
	
	
	
	
	
	
	
	
	

}
