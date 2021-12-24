package stepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;
import com_professional.sample_project.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItemStepDefinition extends base {

	@Given("^Initialize chrome browser$")
	public void initialize_chrome_browser() throws Throwable {
		driver = initializeDriver();
	}

	@And("^Land into \"([^\"]*)\"$")
	public void land_into_something(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@Given("^User sign into the application with (.+) and (.+)$")
	public void user_sign_into_the_application_with_and(String username, String password) throws Throwable {
		LoginPage ld = new LoginPage(driver);
		ld.CustomerAccount().click();
		ld.Email().sendKeys(username);
		ld.Password().sendKeys(password);
		ld.SubmitLogin().click();
	}

	@When("^Verify user successful logged in$")
	public void verify_user_successful_logged_in() throws Throwable {
		LoginPage ld = new LoginPage(driver);
		AssertJUnit.assertTrue(ld.Myaccount().isDisplayed());
	}

	@Then("^User on the search box enter \"([^\"]*)\"$")
	public void user_on_the_search_box_enter_something(String strArg1) throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		obj.SearchBox().sendKeys(strArg1);
		obj.SearchBox().sendKeys(Keys.ENTER);
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
	
	System.out.println(arg1);	

	}

	@Then("^User print the number of links on the page$")
	public void user_print_the_number_of_links_on_the_page() throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		System.out.println(obj.leftColunmLinks().findElements(By.tagName("a")).size());

	}

	@Then("^user print the text on the links in the page$")
	public void user_print_the_text_on_the_links_in_the_page() throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		WebElement leftColunm = obj.leftColunmLinks();
		List<WebElement> myLinks = leftColunm.findElements(By.tagName("a"));
		for (int i = 1; i < myLinks.size(); i++) {

			System.out.println("The text on the links are " + myLinks.get(i).getText());

		}
	}

	@Then("^SignOut from the main page$")
	public void signout_from_the_main_page() throws Throwable {
		HomePageObjects obj = new HomePageObjects(driver);
		obj.LogOut().click();
	}
	

    @And("^Dismiss the browser$")
    public void dismiss_the_browser() throws Throwable {
      driver.quit();
    }

}
