package com_utils.sample_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Utilities {
	
	static WebDriver driver;
	
	public Utilities (WebDriver driver) {
		Utilities.driver = driver;
		//PageFactory.initElements(driver, this);
		CloseBrowser();
	}
	
	

	public WebDriver CloseBrowser() {
	   driver.close();
	return driver;
	
	}

}
