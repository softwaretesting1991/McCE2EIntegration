package org.automation.mccormick.testcases;

import org.automation.mccormick.base.DriverInstance;
import org.automation.mccormick.datagenerator.DataGenerator;
import org.automation.mccormick.pages.ContactPageMcCormick;
import org.testng.annotations.Test;

public class TC_003_ValidateContactUsPageFunctionality extends DriverInstance {
	
	@Test (dataProvider="Excel", dataProviderClass=DataGenerator.class)
	public void tc_003_ContactUSPage(String EmailAddress, String ConfirmEmailAddress, String ProductName, String UPC, String BestByCode, String Comments, String FirstName, String LastName, String Address, String City, String Zip, String DaytimePhone ) throws Exception {
		
		ContactPageMcCormick contactus = new ContactPageMcCormick(driver);
		
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
