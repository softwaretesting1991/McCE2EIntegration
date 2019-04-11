package org_automation_mccormick_pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPopup extends PageFactor {

	WebDriver driver;

	public RegistrationPopup(WebDriver driver) {

		this.driver = driver;
	}

	public void ClickLogin() throws Exception {

		LoginButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		RegistrationButton.click();
		Thread.sleep(5000);
	}

	public void EnterFirstName(String FirstName) throws Exception {

		FirstNameField.sendKeys(FirstName);
	}

	public void EnterLastName(String LastName) throws Exception {

		LastNameField.sendKeys(LastName);
	}

	public void EnterEmail(String Email) throws Exception {

		EmailField.sendKeys(Email);
	}

	public void EnterPassword(String Password) throws Exception {

		PasswordField.sendKeys(Password);
	}

	public void EnterPrivacyCheck() throws Exception {

		PrivacyCheck.click();
	}

	public void EnterCreateButton() throws Exception {

		CreateAccount.click();		
	}	
	public void SelectBirthYear() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Select birthyear = new Select(BirthYear);
		birthyear.selectByValue("1991");	
	}
	public void ClickCookingStylebutton() throws Exception {

		CookingStyle.click();
	}
	public void ClickGetStartedButton() throws Exception {

		GetStarted.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void Selectcuisine() throws Exception {

		Cuisine.click();
	}
	public void Selectcookingtechniques() throws Exception {

		CookingTechinique.click();
	}
	public void ChooseFlavors() throws Exception {

		Flavors.click();
	}
	public void ChooseIngredients() throws Exception {

		Ingredients.click();
	}
	public void ChooseOccasions() throws Exception {

		Occasions.click();
	}
	public void ChooseBrand() throws Exception {

		Brand.click();
	}
	public void TakeMeFlvorProfie() throws Exception {

		TakeMeFlvorProfie.click();
		Thread.sleep(10000);
	}
}
