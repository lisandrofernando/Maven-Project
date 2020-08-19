package stepDefinitions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(Cucumber.class)
public class stepDefinition{

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Landed successful");
    }

    @When("^User login into the application with username and password$")
    public void user_login_into_the_application_with_username_and_password() throws Throwable {
    	 System.out.println("Loged in successful");
    }

    @Then("^Add some products to the cart$")
    public void add_some_products_to_the_cart() throws Throwable {
    	 System.out.println("Added items successful");
    }

    @And("^Purchase the items$")
    public void purchase_the_items() throws Throwable {
    	 System.out.println("Purchased items successful");
        
    }

}


