package org.automation.mccormick.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.automation.mccormick.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPopup {

	WebDriver driver;

	public RegistrationPopup(WebDriver driver) {

		this.driver = driver;
	}

	public void ClickLogin() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Login_button_locator_xpath"))).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_textlink_locator_xpath"))).click();
		Thread.sleep(5000);
	}

	public void EnterFirstName(String FirstName) throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_FirstName_locator_xpath"))).sendKeys(FirstName);
	}

	public void EnterLastName(String LastName) throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_LastName_locator_xpath"))).sendKeys(LastName);
	}

	public void EnterEmail(String Email) throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_Email_locator_xpath"))).sendKeys(Email);
	}

	public void EnterPassword(String Password) throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_Password_locator_xpath"))).sendKeys(Password);
	}

	public void EnterPrivacyCheck() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_PrivacyCheck_locator_xpath"))).click();
	}

	public void EnterCreateButton() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_CreateAccountbutton_locator_xpath"))).click();		
	}	
	public void SelectBirthYear() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Select birthyear = new Select(driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_SelectBirthYearDropdown_locator_xpath"))));
		birthyear.selectByValue("1991");	
	}
	public void ClickCookingStylebutton() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_SelectCookingStyle_locator_xpath"))).click();
	}
	public void ClickGetStartedButton() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_GetStartedButton_xpath"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void Selectcuisine() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_Selectcuisine_xpath"))).click();
	}
	public void Selectcookingtechniques() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_Selectcookingtechniques_xpath"))).click();
	}
	public void ChooseFlavors() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_ChooseFlavors_xpath"))).click();
	}
	public void ChooseIngredients() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_ChooseIngredients_xpath"))).click();
	}
	public void ChooseOccasions() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_ChooseOccasions_xpath"))).click();
	}
	public void ChooseBrand() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_ChooseBrand_xpath"))).click();
	}
	public void TakeMeFlvorProfie() throws Exception {

		driver.findElement(By.xpath(Utility.fetchelementvalue("Registration_TakeMeFlvorProfie_xpath"))).click();
		Thread.sleep(10000);
	}
}
