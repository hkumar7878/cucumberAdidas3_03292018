/**
 * 
 */
package helpers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * @author Hitesh
 *
 */
public class Hook {

	public static WebDriver driver;
	//committ from off 04/02/2018
	//@Before("@web")
	//@Before("@RegressionTest3")
	@Before()
	//@BeforeMethod
	public void setUp()
	{
		
		System.out.println("This will run BEFORE any scenario defined in the feature file");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowsersExe//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://shop.adidas.co.in/");
	}
	
	
	
	@After
	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("This will run AFTER any scenario defined in the feature file");
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}