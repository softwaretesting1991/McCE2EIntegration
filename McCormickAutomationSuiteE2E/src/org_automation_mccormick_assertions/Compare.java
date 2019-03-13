package org_automation_mccormick_assertions;

import org.openqa.selenium.WebDriver;
public class Compare {

	public static boolean validateTextPresentOnPage(WebDriver driver, String Exptextvalue) {
		
		boolean result = false;
		
		if (driver.getPageSource().contains(Exptextvalue))
		{
			result = true;
		}
		
		return result;		
	}
	}
