package com.cucumber.framework.stepdefinition.ProductCategory;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.HomePage;
import com.cucumber.framework.pageobject.WomenProductCategory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.apache.log4j.Logger;
import org.testng.Assert;

public class WomenDressProductCategory {
	
private final Logger log= LoggerHelper.getLogger(WomenDressProductCategory.class);
HomePage homepage;
WomenProductCategory womenproductcatpage;

@Given("^User click on women navigation menu$")
public void user_click_on_women_navigation_menu() throws Throwable {
  homepage = new HomePage(TestBase.driver);
  log.info("Clicking on Women menu");
  womenproductcatpage = homepage.clickOnMenu(homepage.womenMenu);
    
}

@Then("^verify total number of women product displayed as \"([^\"]*)\"$")
public void verify_total_number_of_women_product_displayed_as(String arg1) throws Throwable {
   int total= womenproductcatpage.getTotalProducts();
   if(total==Integer.parseInt(arg1))
	   Assert.assertTrue(true, "given product count is matching");
   else
	   Assert.assertFalse(false,"given product count is not matching");
   
}

}
