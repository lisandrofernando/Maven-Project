package com_professional.sample_project;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;
import com_utils.sample_project.Utilities;

public class PurchasePageTest extends base{
	
	@BeforeTest
	public void initializeBrowser() throws IOException {
		
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testPractice() throws InterruptedException {
		
	LoginPage ld = new LoginPage(driver);
	ld.CustomerAccount().click();
	ld.Email().sendKeys("camerdiaz@gmail.com");
	ld.Password().sendKeys("123456#");
	ld.SubmitLogin().click();
	
	assertTrue(ld.Myaccount().isDisplayed());
	
	HomePageObjects obj = new HomePageObjects(driver);
	obj.MyStores().click();
	obj.Dress().click();
	obj.AddToCart().click();

	obj.ProccedCheckOut().click();
	obj.ProccedToCheckOut1().click();
	obj.Procced().click();
	obj.Agree().click();
	obj.Continue().click();
	obj.LogOut().click();
	}
	
	@AfterTest
	public static void CloseBrowser() {
	   driver.close();
	
	}
	
	
}
