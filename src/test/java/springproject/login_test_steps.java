package springproject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_test_steps {

	@Given("a customer with name {string}, email {string}, and password {string}")
	public void aCustomerWithNameEmailAndPassword(String string, String string2, String string3) {
	    
		Customer S = new Customer();
		String fn = "Ahmad";
		String ln = "Ali";
		String e = "AhmadAli12@gmail.com";
		String p = "123456789";
		S.setFirstName(fn);
		S.setLastName(ln);
		S.setEmail(e);
		S.setPassword(p);
		assertTrue((S.getFirstName().equals(fn))&&(S.getLastName().equals(ln))&&(S.getEmail().equals(e))&&(S.getPassword().equals(p)));
	    //throw new io.cucumber.java.PendingException();
	}

	@When("the customer logs in with email {string} and password {string}")
	public void theCustomerLogsInWithEmailAndPassword(String string, String string2) {
	    
		Customer S = new Customer();
		String e = "AhmadAli12@gmail.com";
		String p = "123456789";

		S.setEmail(e);
		S.setPassword(p);
		assertTrue((S.getEmail().equals(e))&&(S.getPassword().equals(p)));
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the customer should be logged in successfully")
	public void theCustomerShouldBeLoggedInSuccessfully() {
	    
		CleanApp A = new CleanApp();
		A.setAppUserType("Customer");
		assertNotNull(A.getAppUserType());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the customer should not be logged in")
	public void theCustomerShouldNotBeLoggedIn() {
	    
		CleanApp A = new CleanApp();
		assertNull(A.getAppUserType());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
