package org_automation_mccormick_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org_automation_mccormick_utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginPage {
	
	WebDriver driver ;
	//WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public LoginPage (WebDriver driver) {
			
		this.driver=driver;		
	}
	
	
	public void ClickLoginButton() throws Exception {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Utility.fetchelementvalue("Login_button_locator_xpath"))));
		driver.findElement(By.xpath(Utility.fetchelementvalue("Login_button_locator_xpath"))).click();
		Thread.sleep(5000);
	}
	
	public void EnterEmail(String email) throws Exception {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Utility.fetchelementvalue("login_email_locator_xpath"))));
		driver.findElement(By.xpath(Utility.fetchelementvalue("login_email_locator_xpath"))).sendKeys(email);
	}

	public void EnterPassword(String pass) throws Exception {
		
			driver.findElement(By.xpath(Utility.fetchelementvalue("login_password_locator_xpath"))).sendKeys(pass);
			}
	
	public void ClickLoginSubmitButton() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchelementvalue("Login_popup_loginbutton_xpath"))).click();
		Thread.sleep(8000);
				
	}

}

