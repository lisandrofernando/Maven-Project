package com_professional.sample_project;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;

public class LandingPageTest extends base{
	
	@Test
	public void practiceAutomation() throws IOException {
	
	
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LoginPage ld = new LoginPage(driver);
	ld.CustomerAccount().click();
	ld.Email().sendKeys("camerdiaz@gmail.com");
	ld.Password().sendKeys("1234@");
	ld.SubmitLogin().click();
	HomePageObjects obj = new HomePageObjects(driver);
	obj.MyStores().click();
	obj.Dress().click();
	obj.AddToCart().click();
	obj.ContinueShopping().click();
	obj.MyStores().click();
//	WebDriverWait wait = new WebDriverWait(driver,5);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Printed Dress']")));
	obj.Chifondress().click();
	obj.AddToCart().click();
	obj.ProccedCheckOut().click();
	obj.ProccedToCheckOut1().click();
	obj.Procced().click();
	obj.Agree().click();
	obj.Continue().click();
	obj.LogOut().click();
	driver.close();
	
	
	}

}
