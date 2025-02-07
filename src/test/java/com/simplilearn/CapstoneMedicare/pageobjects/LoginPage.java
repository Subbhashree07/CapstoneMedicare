package com.simplilearn.CapstoneMedicare.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class LoginPage {

	WebDriver driver;
	JavascriptExecutor js;

	@FindBy(xpath = "//a[text()='Login Here']")
	private WebElement LoginHerebtn;
	
	@FindBy(xpath="//li[@id='login']")
	private WebElement Loginuserbtn;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement Loginbtn;

	@FindBy(id="username")
	private WebElement emailbtn;

	@FindBy(name="password")
	private WebElement pwdbtn;
    
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	//clicks on Login button for an existing user to login
	public void clicklogin() throws InterruptedException
	{   
	   Thread.sleep(2000);
	   Loginuserbtn.click();
	} 
	
	//clicks on login button 
	public void login() throws InterruptedException
	{   
		Thread.sleep(2000);
		Loginbtn.click();
	}

    //enters email and password
	public void loginUser(String email,String pwd) throws InterruptedException
	{   
		Thread.sleep(2000);
		if(emailbtn.isDisplayed())
		{
	       emailbtn.sendKeys(email);
		}
		if(pwdbtn.isDisplayed())
		{
		   pwdbtn.sendKeys(pwd);
		}
	}
}
