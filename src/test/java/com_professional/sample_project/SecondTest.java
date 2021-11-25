package com_professional.sample_project;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;


public class SecondTest extends base{
	
	@BeforeTest
	public void initializeBrowser() throws IOException {
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testPractice2() {
		try {
           Actions action = new Actions(driver);
           action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
           HomePageObjects obj = new HomePageObjects(driver);
           obj.Blouse().click();
           Assert.assertEquals("Match your favorites blouses with the right accessories for the perfect look.", "Match your favorites blouses with the right accessories for the perfect look.");
           JavascriptExecutor js = (JavascriptExecutor)driver;
           js.executeScript("window.scrollTo(0,500)");
           for(int i=0; i<3; i++) {
           obj.AddCart().click();
           obj.ContinueShopping().click();
           }
           
	}
		catch(Exception e) {
			System.out.println("There are problems adding to the cart");
		}
	}
	
	@AfterTest
	public void CloseBrowser() {
	driver.close();
	
	
	}

}
