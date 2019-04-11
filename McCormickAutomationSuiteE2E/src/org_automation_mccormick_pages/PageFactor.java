package org_automation_mccormick_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactor {
		
		//Login Page Elements
		
	    static public @FindBy(xpath="//span[@class='icon icon-profile']") WebElement LoginButton;
	    static public @FindBy(xpath="//*[@id=\"login-modal-email\"]") WebElement EnterEmail;
		static public @FindBy(xpath="//*[@id=\"login-modal-password\"]") WebElement EnterPassword;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/div[2]/form/div/button") WebElement LoginSubmitButton;

		//Registration Page Elements
		
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/div[3]/h3/a") WebElement RegistrationButton;
		static public @FindBy(xpath="//*[@id=\"registration-modal-firstname\"]") WebElement FirstNameField;
		static public @FindBy(xpath="//*[@id=\"registration-modal-lastname\"]") WebElement LastNameField;
		static public @FindBy(xpath="//*[@id=\"registration-modal-email\"]") WebElement EmailField;
		static public @FindBy(xpath="//*[@id=\"registration-modal-password\"]") WebElement PasswordField;
		static public @FindBy(xpath="//*[@id=\"tnc\"]") WebElement PrivacyCheck;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/div[2]/form/div/button") WebElement CreateAccount;
		static public @FindBy(xpath="//*[@id=\"reg-birth-year\"]") WebElement BirthYear;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/div[2]/div[3]/label/input") WebElement CookingStyle;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/button") WebElement GetStarted;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[1]/div[1]/div[1]/label/div/label") WebElement Cuisine;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[2]/div[1]/div[2]/label/div/label") WebElement CookingTechinique;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[3]/div[2]/div[1]/label/div/label") WebElement Flavors;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[4]/div[1]/div[2]/label/div/label") WebElement Ingredients;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[5]/div[2]/div[2]/label/div/label") WebElement Occasions;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[6]/div[1]/div[1]/div[1]/div/label") WebElement Brand;
		static public @FindBy(xpath="/html/body/aside/div[1]/div[2]/div/div/div/form/div/section/div[7]/div/button") WebElement TakeMeFlvorProfie;

		//Contact us Page Elements
		
		static public @FindBy(partialLinkText="Contact") WebElement FooterLink;
		static public @FindBy(xpath="//*[@id=\"txtEmail\"]") WebElement EmailAddressField;
		static public @FindBy(xpath="//*[@id=\"txtConfirmEmail\"]") WebElement ConfirmEmailAddressField;
		static public @FindBy(xpath="//*[@id=\"txtProductName\"]") WebElement ProductNamefield;
		static public @FindBy(xpath="//*[@id=\"txtUPC\"]") WebElement UPCfield;
		static public @FindBy(xpath="//*[@id=\"txtBestByDateCode\"]") WebElement BestBy_DateCode_Field;
		static public @FindBy(xpath="//*[@id=\"txtComments\"]") WebElement CommentsField;
		static public @FindBy(xpath="//*[@id=\"txtFirstName\"]") WebElement FirstName_Field;
		static public @FindBy(xpath="//*[@id=\"txtLastName\"]") WebElement LastName_Field;
		static public @FindBy(xpath="//*[@id=\"txtAddress\"]") WebElement AddressField;
		static public @FindBy(xpath="//*[@id=\"txtCity\"]") WebElement CityField;
		static public @FindBy(xpath="//*[@id=\"selState\"]") WebElement StateField;
		static public @FindBy(xpath="//*[@id=\"txtZipCode\"]") WebElement ZIPCodeField;
		static public @FindBy(xpath="//*[@id=\"txtPhoneNumber\"]") WebElement DayTimePhoneField;
		static public @FindBy(xpath="//*[@id=\"selCountry\"]") WebElement CountryField;
		static public @FindBy(xpath="//*[@id=\"fileUploads\"]") WebElement ChooseFileField;
		static public @FindBy(className="g-recaptcha") WebElement CaptchaField;
		static public @FindBy(xpath="//*[@id=\"btnSubmitForm\"]") WebElement SendButton;
		
		
		
	}
