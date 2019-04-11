package org_automation_mccormick_pages;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class ContactPageMcCormick extends PageFactor {
	
  WebDriver driver;
  
  public ContactPageMcCormick(WebDriver driver) {
	  
	  this.driver=driver;
  }
    
  public void ScrollDownPage() {
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  
  public void CickContactPageLink() throws Exception {
	  
	  FooterLink.click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  public void EnterEmail(String EmailAddress) throws Exception{
	  
	  EmailAddressField.sendKeys(EmailAddress);
  }
  
 public void ConfirmEmail(String ConfirmEmailAddress) throws Exception{
	  
	 ConfirmEmailAddressField.sendKeys(ConfirmEmailAddress);  
  }

 public void EnterProductName(String ProductName) throws Exception{
	  
	 ProductNamefield.sendKeys(ProductName);  
 }

 public void EnterUPC(String UPC) throws Exception{
	  
	 UPCfield.sendKeys(UPC);  
}
 
 public void EnterBestbyCode(String BestByCode) throws Exception{
	  
	 BestBy_DateCode_Field.sendKeys(BestByCode);  
}

 public void EnterComments(String Comments) throws Exception{
	  
	 CommentsField.sendKeys(Comments);  
}

 public void EnterFirstName(String FirstName) throws Exception{
	  
	 FirstName_Field.sendKeys(FirstName);  
}

 public void EnterLastName(String LastName) throws Exception{
	  
	 LastName_Field.sendKeys(LastName);  
}
 
 public void EnterAddress(String Address) throws Exception{
	  
	 AddressField.sendKeys(Address);  
}
 public void EnterCity(String City) throws Exception{
	  
	 CityField.sendKeys(City);  
}
 public void SelectState() throws Exception{
	  
	 Select State= new Select(StateField);
	 State.selectByValue("AK");
}
 public void EnterZip(String Zip) throws Exception{
	  
	 ZIPCodeField.sendKeys(Zip);  
}
 public void SelectCountry() throws Exception{
	  
	 Select country = new Select(CountryField);
	    country.selectByValue("USA");
}
 public void EnterDaytimePhone(String DaytimePhone) throws Exception{
	  
	 DayTimePhoneField.sendKeys(DaytimePhone);  
}
 public void ChooseFile() throws Exception{
	 
	 File file = new File("./TestData/Demo2_(2).png");
	  Thread.sleep(1000);
	  ChooseFileField.sendKeys(file.getAbsolutePath()); 
}
 public void ClickCaptchaCheck() throws Exception{
	  
	 CaptchaField.click();
	  Thread.sleep(3000);
}
 public void ClickSendButton() throws Exception{
	  
	 SendButton.click();
	  Thread.sleep(10000);
}
}
