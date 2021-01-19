package com.stepdefnfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinitionFile {
	public WebDriver driver;
	
	@Given("user is on adactin hotel login page")
	public void user_is_on_adactin_hotel_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("user eneter the valid credentials for username and password")
	public void user_eneter_the_valid_credentials_for_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("CelinaGrace");
		driver.findElement(By.id("password")).sendKeys("devbeu123");
	  
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.id("login")).click();
		
	    
	}

	@Then("user validate the outcomes")
	public void user_validate_the_outcomes() {
		String s= driver.getCurrentUrl();
		boolean contains = s.contains("SearchHotel");
		Assert.assertTrue("verify the search hotel url", contains);
	
	    
	}



}
