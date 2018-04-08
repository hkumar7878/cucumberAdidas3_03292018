package com.cucumber.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.Wait.WaitHelper;
import com.cucumber.framework.configreader.ObjectRepo;

public class LoginPage {
	
	public WebDriver driver;
	private final Logger log=LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waithelper;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement lnk_signIn;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement txt_EmailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement txt_Password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement btn_sign_In;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		waithelper = new WaitHelper(driver);
		waithelper.waitForElement(driver, lnk_signIn, ObjectRepo.reader.getExplicitWait());
	}
	
	public void clickOnSignBtn()
	{
		lnk_signIn.click();
	}

}
