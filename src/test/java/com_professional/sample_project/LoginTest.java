package com_professional.sample_project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;

public class LoginTest extends base{
	
	@BeforeTest
	public void initializeBrowser() throws IOException {
		//Given
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testPractice() {
		//Then
	LoginPage ld = new LoginPage(driver);
	ld.CustomerAccount().click();
	ld.Email().sendKeys("skywalker@hotmail.com");
	ld.Password().sendKeys("123456@");
	ld.SubmitLogin().click();
	//Then Verify that is successful logged
	AssertJUnit.assertTrue(ld.Myaccount().isDisplayed());
	//And
	HomePageObjects obj = new HomePageObjects(driver);
	obj.LogOut().click();
	}
	
	@AfterTest
	public void CloseBrowser() {
	driver.close();
	
	
	}

}
