package com.cucumber.framework.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.pageobject.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToApplication {
	
	LoginPage loginPg;
	public WebDriver driver;
	
	
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
	   TestBase.driver.get(ObjectRepo.reader.getWebSite());
	}

	@When("^user click on sign in link$")
	public void user_click_on_sign_in_link() throws Throwable {
		driver=TestBase.driver;
		System.out.println(driver.hashCode());
		loginPg = new LoginPage(driver);
	    loginPg.clickOnSignBtn();
	}

	@When("^enter email address$")
	public void enter_email_address() throws Throwable {
	   
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
	    
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
	    
	}

	@Then("^login is successful$")
	public void login_is_successful() throws Throwable {
	    
	}

}
