package com_professional.sample_project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;

public class SearchItem extends base {

	@BeforeTest
	public void initializeBrowser() throws IOException {
		// Given
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testPractice() throws InterruptedException {
		// Then
		LoginPage ld = new LoginPage(driver);
		ld.CustomerAccount().click();
		ld.Email().sendKeys("skywalker@hotmail.com");
		ld.Password().sendKeys("123456@");
		ld.SubmitLogin().click();
		// Then Verify that is successful logged
		AssertJUnit.assertTrue(ld.Myaccount().isDisplayed());
		// And
		HomePageObjects obj = new HomePageObjects(driver);
		obj.SearchBox().sendKeys("T-SHIRTS");
		obj.SearchBox().sendKeys(Keys.ENTER);
		System.out.println(obj.leftColunmLinks().findElements(By.tagName("a")).size());
		WebElement leftColunm = obj.leftColunmLinks();
		List<WebElement> myLinks = leftColunm.findElements(By.tagName("a"));
		for (int i = 1; i < myLinks.size(); i++) {

			System.out.println("The text on the links are " + myLinks.get(i).getText());

		}

		obj.LogOut().click();
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();

	}

}
