package org.automation.mccormick.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.mccormick.assertions.Compare;
import org.automation.mccormick.base.DriverInstance;
import org.automation.mccormick.datagenerator.DataGenerator;
import org.automation.mccormick.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{
	
	@Test(dataProvider="Excel" , dataProviderClass=DataGenerator.class)
	public void tc_001_loginfunctinality(String email, String pass) throws Exception {
		
		
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.EnterEmail(email);
		login.EnterPassword(pass);
		login.ClickLoginSubmitButton();
	}
	
	
	

}
