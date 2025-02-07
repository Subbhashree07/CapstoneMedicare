package com.simplilearn.CapstoneMedicare.stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    	features= "classpath:features",
    	//tags= "@sanity",
    	glue = "com.simplilearn.CapstoneMedicare.stepdefinitions",
    	monochrome = true,
    	plugin = {"pretty","html:target/cucumber-report.html"}

 )

public class TestRunner{

}
