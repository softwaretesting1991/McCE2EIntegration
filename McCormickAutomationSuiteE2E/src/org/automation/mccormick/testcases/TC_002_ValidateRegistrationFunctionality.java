package org.automation.mccormick.testcases;

import java.util.Random;

import org.automation.mccormick.base.DriverInstance;
import org.automation.mccormick.datagenerator.DataGenerator;
import org.automation.mccormick.pages.RegistrationPopup;
import org.testng.annotations.Test;

public class TC_002_ValidateRegistrationFunctionality extends DriverInstance {
	
	@Test
	public void tc_002_registration() throws Exception {
		
		
		RegistrationPopup registration = new RegistrationPopup(driver);
		registration.ClickLogin();
		registration.EnterFirstName("test");
		registration.EnterLastName("user");
		
		Random randomNumber = new Random();
		int randomInt = randomNumber.nextInt(100000);
		registration.EnterEmail("testuser"+ randomInt +"@mailinator.com");
		registration.EnterPassword("123456");
		registration.EnterPrivacyCheck();
		registration.EnterCreateButton();
		registration.SelectBirthYear();
		registration.ClickCookingStylebutton();
		registration.ClickGetStartedButton();
		registration.Selectcuisine();
		registration.Selectcookingtechniques();
		registration.ChooseFlavors();
		registration.ChooseIngredients();
		registration.ChooseOccasions();
		registration.ChooseBrand();
		registration.TakeMeFlvorProfie();
	}

}
