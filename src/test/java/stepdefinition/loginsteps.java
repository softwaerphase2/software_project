package stepdefinition;

import cleanservice.Customer;
import cleanservice.home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class loginsteps {
	static boolean result;
	@When("the customer logs in with email {string} and password {string}")
	public static void the_customer_logs_in_with_email_and_password(String email, String password) {
       result  = home.login(email, password);
 
	}

	@Then("the customer should be logged in successfully")
	public void the_customer_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   assertEquals(true,  result);
	}

	@Then("the customer should not be logged in")
	public void the_customer_should_not_be_logged_in() {
		assertEquals(false,  result);	
		}
}
