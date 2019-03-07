package org.automation.mccormick.base;

import java.io.IOException;

import org.automation.mccormick.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {

	public WebDriver driver; // public so that child class can use it.

	@BeforeMethod
	public void InitiateDriverInstance() throws IOException  // to start the browser.
, InterruptedException
	{
		if(Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("chrome"))  //Checking the returning object string is chrome??
		
		{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //Need to set system property before calling driver object. Key and Values provided.
		 driver= new ChromeDriver();
		}
		 
		else if(Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("firefox")) //Checking the returning object string is firefox??
			
			{
			System.setProperty("webdriver.gecko.drive", "./Driver/geckodriver.exe");
			 driver= new FirefoxDriver();
			}
			
		else if (Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("ie")) //Checking the returning object string is ie??
		{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
		}
		
		else 
		{
			driver = new ChromeDriver();
		}
		
		driver.get(Utility.fetchpropertyValue("applicationURL").toString());
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void CloseDriverInstance() // to close the browser.
	{
		driver.quit();
	}
	//@AfterSuite
	//public void generateReport() throws Exception
	//{
	///	Xl.generateReport("Automation_Test_Suite_McCormick.xlsx");
	//}
}
