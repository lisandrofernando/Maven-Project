package com_professional.sample_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	
	 WebDriver driver;

	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement Password;
	
	
	@FindBy(id="SubmitLogin")
	WebElement SubmitLogin;
	
	@FindBy(css="[title='Log in to your customer account']")
	WebElement LogCustomerAcount;
//	
//	@FindBy(css="[title='Printed Chiffon Dress']")
//	WebElement chiffondress;
//		
	
	public WebElement Email() {
		return Email;
	}

	
	public WebElement Password() {
		return Password;
	}
	
	public WebElement SubmitLogin() {
		return SubmitLogin;
	}

	public WebElement CustomerAccount() {
		return LogCustomerAcount;
	}


}


