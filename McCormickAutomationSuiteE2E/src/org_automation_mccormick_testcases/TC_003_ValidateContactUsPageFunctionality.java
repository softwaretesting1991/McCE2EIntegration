package org_automation_mccormick_testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import org_automation_mccormick_base.DriverInstance;
import org_automation_mccormick_datagenerator.DataGenerator;
import org_automation_mccormick_pages.ContactPageMcCormick;
import org_automation_mccormick_pages.PageFactor;

public class TC_003_ValidateContactUsPageFunctionality extends DriverInstance {
	
	@Test (dataProvider="Excel", dataProviderClass=DataGenerator.class)
	public void tc_003_ContactUSPage(String EmailAddress, String ConfirmEmailAddress, String ProductName, String UPC, String BestByCode, String Comments, String FirstName, String LastName, String Address, String City, String Zip, String DaytimePhone ) throws Exception {
		
		ContactPageMcCormick contactus = new ContactPageMcCormick(driver);
		
		PageFactory.initElements(driver, PageFactor.class);
		
		contactus.ScrollDownPage();
		contactus.CickContactPageLink();
		contactus.EnterEmail(EmailAddress);
		contactus.ConfirmEmail(ConfirmEmailAddress);
		contactus.EnterProductName(ProductName);
		contactus.EnterUPC(UPC);
		contactus.EnterBestbyCode(BestByCode);
		contactus.EnterComments(Comments);
		contactus.EnterFirstName(FirstName);
		contactus.EnterLastName(LastName);
		contactus.EnterAddress(Address);
		contactus.EnterCity(City);
		contactus.SelectState();
		contactus.EnterZip(Zip);
		contactus.SelectCountry();
		contactus.EnterDaytimePhone(DaytimePhone);
		contactus.ChooseFile();
		contactus.ClickCaptchaCheck();
		contactus.ClickSendButton();
	}

}
