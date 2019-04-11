package org_automation_mccormick_pages;


import org.openqa.selenium.WebDriver;

public class LoginPage extends PageFactor{
	
	WebDriver driver ;
	//WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public LoginPage (WebDriver driver) {
			
		this.driver=driver;		
	}
	
	
	public void ClickLoginButton() throws Exception {
		
		LoginButton.click();
		Thread.sleep(5000);
	}
	
	public void EnterEmail(String email) throws Exception {
		
		EnterEmail.sendKeys(email);
		
	}

	public void EnterPassword(String pass) throws Exception {
		
		EnterPassword.sendKeys(pass);
			}
	
	public void ClickLoginSubmitButton() throws Exception {
		
		LoginSubmitButton.click();
		Thread.sleep(8000);
				
	}

}

