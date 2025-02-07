package com.simplilearn.CapstoneMedicare.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {

	@FindBy(id="signup")
	private WebElement signupButton;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstNametxtbox;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement LastNametxtbox;

	@FindBy(xpath="//input[@id='email']")
	WebElement Emailtxtbox;

	@FindBy(xpath="//input[@id='contactNumber']")
	WebElement ContactNumbertxtbox;

	@FindBy(xpath="//input[@id='password']")
	WebElement Passwordtxtbox;

	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement ConfirmPasswordtxtbox;

	@FindBy(xpath="//input[@id='role1']")
	WebElement UserRoleradiobtn;

	@FindBy(xpath = "//button[normalize-space()='Next - Billing']")
	WebElement NextBillingbtn;

	@FindBy(xpath="//input[@id='addressLineOne']")
	WebElement address1txtbox;

	@FindBy(xpath="//input[@id='addressLineTwo']")
	WebElement address2txtbox;

	@FindBy(xpath="//input[@id='city']")
	WebElement Citytxtbox;

	@FindBy(xpath="//input[@id='postalCode']")
	WebElement Postalcodetxtbox;

	@FindBy(xpath="//input[@id='state']")
	WebElement Statetxtbox;

	@FindBy(xpath="//input[@id='country']")
	WebElement Countrytxtbox;

	@FindBy(xpath = "//button[normalize-space()='Next - Confirm']")
	WebElement Confirmbtn;

	@FindBy(xpath = "//button[normalize-space()='Back - Personal']")
	WebElement Backbtn;

	@FindBy(xpath = "//a[normalize-space()='Confirm']")
	WebElement confirmdetailsbtn;

	public RegisterUser(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void clickSignup() throws InterruptedException
	
	{   
		Thread.sleep(2000);
		signupButton.click();
	}

	public void setFirstName(String Firstname)
	{
		FirstNametxtbox.sendKeys(Firstname);
	}

	public void setLastName(String Lastname)
	{
		LastNametxtbox.sendKeys(Lastname);
	}

	public void setEmail(String Email)
	{
		Emailtxtbox.sendKeys(Email);
	}

	public void setContactNumber(String Number)
	{
		ContactNumbertxtbox.sendKeys(Number);
	}

	public void setPwd(String Password)
	{
		Passwordtxtbox.sendKeys(Password);
	}

	public void confirmpwd(String Confirmpwd)
	{
		ConfirmPasswordtxtbox.sendKeys(Confirmpwd);
	}

	public void selectRole() {
		UserRoleradiobtn.click();

	}

	public void clickNext()
	{
		NextBillingbtn.click();
	}
	
	

	public void enterAddress(String flat,String Street,String City,String Post,String State,String Country) throws InterruptedException
	{
		address1txtbox.sendKeys(flat);
		address2txtbox.sendKeys(Street);
		Citytxtbox.sendKeys(City);
		Postalcodetxtbox.sendKeys(Post);
		Statetxtbox.sendKeys(State);
		Countrytxtbox.sendKeys(Country);
	}
	
	public void clickNextConfirm() throws InterruptedException
	{
		Confirmbtn.click();
	    Thread.sleep(1000);
	}

	public void confirmbilling()
	{
		confirmdetailsbtn.click();
	}
}
