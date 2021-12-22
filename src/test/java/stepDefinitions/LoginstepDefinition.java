package stepDefinitions;

import cucumber.api.junit.Cucumber;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;
import com_professional.sample_project.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(Cucumber.class)
public class LoginstepDefinition extends base{

	@Given("^Initialize Chrome browser$")
	public void initialize_Chrome_browser() throws Throwable {
		driver = initializeDriver();
	}

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something1(String strArg1) throws Throwable {
    	//driver.get(prop.getProperty(strArg1));
	        driver.get(strArg1);
    }
    @Then("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       	LoginPage ld = new LoginPage(driver);
    	ld.CustomerAccount().click();
    	ld.Email().sendKeys(strArg1);
    	ld.Password().sendKeys(strArg2);
    	ld.SubmitLogin().click();
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	LoginPage ld = new LoginPage(driver);
    	assertTrue(ld.Myaccount().isDisplayed());
    }

    
    @Then("^Logout from the main page$")
    public void logout_from_the_main_page() throws Throwable {
    	HomePageObjects obj = new HomePageObjects(driver);
    	obj.LogOut().click();
    }

    @Then("^Verify that authentication failed$")
    public void verify_that_authentication_failed() throws Throwable {
    	HomePageObjects obj = new HomePageObjects(driver);
    	 assertTrue(obj.AutheticationFailed().isDisplayed());
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        
    }

}


