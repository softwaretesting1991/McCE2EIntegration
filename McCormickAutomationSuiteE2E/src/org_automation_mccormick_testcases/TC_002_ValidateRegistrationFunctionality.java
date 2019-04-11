package org_automation_mccormick_testcases;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import org_automation_mccormick_base.DriverInstance;
import org_automation_mccormick_pages.PageFactor;
import org_automation_mccormick_pages.RegistrationPopup;

public class TC_002_ValidateRegistrationFunctionality extends DriverInstance {
	
	@Test
	public void tc_002_registration() throws Exception {
		
		
		RegistrationPopup registration = new RegistrationPopup(driver);
		PageFactory.initElements(driver, PageFactor.class);
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
