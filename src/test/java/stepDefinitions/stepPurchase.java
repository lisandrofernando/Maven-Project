package stepDefinitions;

import static org.testng.Assert.assertTrue;

import com_professional.sample_pageObjects.HomePageObjects;
import com_professional.sample_pageObjects.LoginPage;
import com_professional.sample_project.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepPurchase extends base{
	
	@Given("^Initialize Chrome browser$")
	public void initialize_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		  driver = initializeDriver();
	    }

	  @And("^Navigate to \"([^\"]*)\"$")
	    public void navigate_to_something1(String strArg1) throws Throwable {
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

	   

	    @Then("^Click on the main page select dress add to the cart continue shopping$")
	    public void click_on_the_main_page_select_dress_add_to_the_cart_continue_shopping() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	  
	    	HomePageObjects obj = new HomePageObjects(driver);
	    	obj.MyStores().click();
	    	obj.Dress().click();
	    	obj.AddToCart().click();
	    	obj.ContinueShopping().click();
	    }

	    @And("^Click on the main page select chiffon dress add to the cart$")
	    public void click_on_the_main_page_select_chiffon_dress_add_to_the_cart() throws Throwable {
	    	HomePageObjects obj = new HomePageObjects(driver);
	    	obj.MyStores().click();
	    	obj.Chifondress().click();
	    	obj.AddToCart().click();
	    }
	    
	    @Then("^Procced to checkout$")
	    public void procced_to_checkout() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    
	    	HomePageObjects obj = new HomePageObjects(driver);
	    	obj.ProccedCheckOut().click();
	    	obj.ProccedToCheckOut1().click();
	    	obj.Procced().click();
	        
	    }

	    
	    @And("^Agree with terms and conditions$")
	    public void agree_with_terms_and_conditions() throws Throwable {
	    	HomePageObjects obj = new HomePageObjects(driver);
	    	obj.Agree().click();
	    	obj.Continue().click();
	    }
	    
	    @Then("^Logout from the main page$")
	    public void logout_from_the_main_page() throws Throwable {
	    	HomePageObjects obj = new HomePageObjects(driver);
	    	obj.LogOut().click();
	    }

	    @And("^Close the browser$")
	    public void close_the_browser() throws Throwable {
	    
	    	driver.close();
	        
	    }
}
