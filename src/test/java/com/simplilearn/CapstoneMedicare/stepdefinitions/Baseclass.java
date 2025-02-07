package com.simplilearn.CapstoneMedicare.stepdefinitions;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.simplilearn.CapstoneMedicare.pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

        public static WebDriver driver;
        public static Properties prop;
        
        //Initialization of WebDriver
		@BeforeAll
		public static void setup() 
		{

			WebDriverManager.chromedriver().setup();
		    if(driver==null)
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\config\\systemprofile\\.cache\\selenium\\chromedriver\\win64\\chromedriver.exe");//locates and sets the chromedriver 
			driver = new ChromeDriver();//Initialize the driver
			driver.manage().window().maximize();//Maximizes the browser
		    driver.manage().deleteAllCookies();//Deletes cookies
			}
		}

		//Closes the browser after all tests
	    @AfterAll
		public static void tearDown() {
            if(driver!=null) {
			driver.quit();
			System.out.println("AfterTest:Medicare Website is closed");
            }
		}
        
	    //Generates random string used for email in signup 
		public static String randomString() {
			String generatedString=RandomStringUtils.randomAlphabetic(5);
			return(generatedString);
		}
}
