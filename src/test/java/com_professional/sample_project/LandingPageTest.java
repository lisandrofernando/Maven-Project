package com_professional.sample_project;

import java.io.IOException;

import org.testng.annotations.Test;

public class LandingPageTest extends base{
	
	@Test
	public void practiceAutomation() throws IOException {
	
	
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.quit();
	
	}

}
