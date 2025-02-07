package com.simplilearn.CapstoneMedicare.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicinePurchase {

	WebDriver driver;
	JavascriptExecutor js;

	@FindBy(xpath="//a[text()='View Products']")
	WebElement viewproductbtn;

	@FindBy(xpath="//a[@href='/medicare/cart/add/2/product']")
	WebElement addcartbtn_combiflame;

	@FindBy(xpath="//a[@href='/medicare/cart/add/5/product']")
	WebElement addcartbtn_amoxicillin;

	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement continueshoppingbtn;

	@FindBy(xpath="//a[@href='/medicare/cart/validate']")
	WebElement checkoutbtn;

	@FindBy(xpath = "//a[normalize-space()='Select']")
	WebElement selectbtn;

	@FindBy(id="cardNumber")
	WebElement cardnumtxtbox;

	@FindBy(id="expityMonth")
	WebElement expirymonthtxtbox;

	@FindBy(id="expityYear")
	WebElement expiryyeartxtbox;

	@FindBy(id="cvCode")
	WebElement CVVtxtbox;

	@FindBy(xpath = "//a[normalize-space()='Pay']")
	WebElement paybtn;

	public MedicinePurchase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
    public void viewProducts() throws InterruptedException
	{   Thread.sleep(1000);
		viewproductbtn.click();
    }
    
    
	public void addItem1tocart() throws InterruptedException {
		Thread.sleep(1000);
		addcartbtn_combiflame.click();
     }

	public void addItem2tocart()
	{
		addcartbtn_amoxicillin.click();
     }

	public void continueshopping() throws InterruptedException {
		Thread.sleep(1000);
		continueshoppingbtn.click();
	}


	public void checkout() throws InterruptedException {
		Thread.sleep(1000);
		checkoutbtn.click();

	}

	public void selectAddress() throws InterruptedException {
		Thread.sleep(1000);
		selectbtn.click();

	}

	public void Entercarddetails() {
		cardnumtxtbox.sendKeys("0987654321");
		expirymonthtxtbox.sendKeys("10");
		expiryyeartxtbox.sendKeys("30");
		CVVtxtbox.sendKeys("710");
	}

	public void clickPay() {
		paybtn.click();

	}






}
