package stepDefinitions;

import helpers.Hook;

import org.openqa.selenium.WebDriver;

import Application_Pages.Adidas_Home_Page;
import Application_Pages.Men_BaseketBall_Shoes_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MenProductFootWearPageDefinition{
	// commiting on 03/29
	public WebDriver driver;
	CommonPageStepDefinition csd= new CommonPageStepDefinition();
	
	//Adidas_Home_Page homePage=new Adidas_Home_Page(driver);
	Adidas_Home_Page homePage;
	Men_BaseketBall_Shoes_Page menBaseketBallShoesPg=new Men_BaseketBall_Shoes_Page(driver);
	
	
	/*public MenProductFootWearPageDefinition() {
		this.driver = Hook.getDriver();
	}*/
	
	
	@And("^Hover over Men Menu$")
	public void Hover_Over_Men_Menu() throws Throwable 
	{
		
		driver=	Hook.getDriver();
		homePage=new Adidas_Home_Page(driver);
		homePage.hover_Over_Menu("Men");		
	}

	@Then("^Verify Men Menu opens$")
	public void Verify_Men_Menu_opens() throws Throwable 
	{
		homePage.verify_Men_FootWear_Menu_Display();
	}

	@Then("^Click on Basketball link$")
	public void Click_On_Basketball_Link() throws Throwable 
	{		
		homePage.click_BaseketBall_Option();
	}

	@Then("^verify Men Basketball page appears$")
	public void Verify_Men_Basketball_Page_Appears() throws Throwable 
	{
		menBaseketBallShoesPg = new Men_BaseketBall_Shoes_Page(driver);
		menBaseketBallShoesPg.verify_Men_BaseketBall_Shoes_Page_Appears();
	}
}
