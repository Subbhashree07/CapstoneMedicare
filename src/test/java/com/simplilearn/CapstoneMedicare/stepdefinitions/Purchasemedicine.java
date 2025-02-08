package com.simplilearn.CapstoneMedicare.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.simplilearn.CapstoneMedicare.pageobjects.LoginPage;
import com.simplilearn.CapstoneMedicare.pageobjects.MedicinePurchase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Purchasemedicine {
	
	WebDriver driver=Baseclass.driver;
	MedicinePurchase ordermedicine = new MedicinePurchase(driver);
	LoginPage loginuser = new LoginPage(driver);
	
	//Logins in with provided user credentials
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException {
	    loginuser.loginUser(username,password);
	    
	}
	
	@When("clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException
	{   Thread.sleep(2000);
		loginuser.login();
	}
	
	//Clicks on View Products to view all the medicines
	@When("user clicks on View Products tab")
	public void user_clicks_on_View_Products_tab() throws InterruptedException
	{
		ordermedicine.viewProducts();
	}
	
	//Adds combiflame item(1 item) to cart
	@When("click on add to cart icon of the selected product")
	public void click_on_add_to_cart_icon_of_the_selected_product() throws InterruptedException
	{
		ordermedicine.addItem1tocart();
	}
	
	//Checks out the added combiflame item
	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException
	{
		ordermedicine.checkout();
	}
	
	//Selects the delivery and billing address
	@When("clicks on select button")
	public void clicks_on_select_button() throws InterruptedException
	{
		ordermedicine.selectAddress();
	}
	
	//Provides the payment details
	@When("provides Card number expiry date and CVV code")
	public void provides_Card_number_expiry_date_and_CVV_code()
	{
		ordermedicine.Entercarddetails();
	}
	
	//Clicks on pay button
	@When("clicks on Pay button")
	public void clicks_on_Pay_button()
	{
		ordermedicine.clickPay();
	}
	
	//To Validate the confirmation message on placing the order
	@Then("user should see the confirmation message {string}")
	public void user_should_see_the_confirmation_message(String confirmationmsg)
	{
		//Assert.assertTrue(driver.getPageSource().contains("Your Order is confirmed!!"));
		String orderconfirmedmsg = driver.findElement(By.xpath("//h3[normalize-space()='Your Order is Confirmed!!']")).getText();
		assertEquals(confirmationmsg, orderconfirmedmsg);
		System.out.println("Order is successfully placed");
	}
	
	//Clicks on Continue shopping 
	@When("user clicks on Continue Shopping button")
	public void user_clicks_on_Continue_Shopping_button() throws InterruptedException
	{   Thread.sleep(1000);
		ordermedicine.continueshopping();
	}
	
	//Adds Combiflame and Amoxicillin items(2 items) to cart
	@When("user clicks on add to cart for Combiflame and Amoxicillin items")
	public void user_clicks_on_add_to_cart_for_Combiflame_and_Amoxicillin_items() throws InterruptedException
	{
		ordermedicine.addItem1tocart();
		Thread.sleep(1000);
		ordermedicine.continueshopping();
		ordermedicine.addItem2tocart();
		Thread.sleep(1000);
	}
}
