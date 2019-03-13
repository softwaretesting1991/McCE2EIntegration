package org_automation_mccormick_pages;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import org_automation_mccormick_utility.Utility;
public class ContactPageMcCormick {
	
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
	  
	  driver.findElement(By.partialLinkText(Utility.fetchelementvalue("ContactusPage_FooterLink_linktext"))).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  public void EnterEmail(String EmailAddress) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_EmailAddress_xpath"))).sendKeys(EmailAddress);
  }
  
 public void ConfirmEmail(String ConfirmEmailAddress) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_ConfirmEmailAddress_xpath"))).sendKeys(ConfirmEmailAddress);  
  }

 public void EnterProductName(String ProductName) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_ProductName_xpath"))).sendKeys(ProductName);  
 }

 public void EnterUPC(String UPC) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_UPC_xpath"))).sendKeys(UPC);  
}
 
 public void EnterBestbyCode(String BestByCode) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_BestBy/DateCode_xpath"))).sendKeys(BestByCode);  
}

 public void EnterComments(String Comments) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_Comments_xpath"))).sendKeys(Comments);  
}

 public void EnterFirstName(String FirstName) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_FirstName_xpath"))).sendKeys(FirstName);  
}

 public void EnterLastName(String LastName) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_LastName_xpath"))).sendKeys(LastName);  
}
 
 public void EnterAddress(String Address) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_Address_xpath"))).sendKeys(Address);  
}
 public void EnterCity(String City) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_City_xpath"))).sendKeys(City);  
}
 public void SelectState() throws Exception{
	  
	 Select State= new Select( driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_State_xpath"))));
	 State.selectByValue("AK");
}
 public void EnterZip(String Zip) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_ZIPCode_xpath"))).sendKeys(Zip);  
}
 public void SelectCountry() throws Exception{
	  
	 Select country = new Select(driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_Country_xpath"))));
	    country.selectByValue("USA");
}
 public void EnterDaytimePhone(String DaytimePhone) throws Exception{
	  
	  driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_DayTimePhone_xpath"))).sendKeys(DaytimePhone);  
}
 public void ChooseFile() throws Exception{
	 
	 File file = new File("./TestData/Demo2_(2).png");
	  WebElement choosfile= driver. findElement(By.xpath(Utility.fetchelementvalue("Contactus_ChooseFile_xpath"))); 
	  Thread.sleep(1000);
	  choosfile.sendKeys(file.getAbsolutePath()); 
}
 public void ClickCaptchaCheck() throws Exception{
	  
	  driver.findElement(By.className(Utility.fetchelementvalue("Contactus_Captcha_class"))).click();
	  Thread.sleep(3000);
}
 public void ClickSendButton() throws Exception{
	  
	  driver.findElement(By.xpath(Utility.fetchelementvalue("Contactus_Send_xpath"))).click();
	  Thread.sleep(10000);
}
}
