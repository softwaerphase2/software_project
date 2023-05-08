package spring2023Project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerInfo_test_steps {

	@When("added a Customer with name {string}, email {string}, and password {string}")
	public void addedACustomerWithNameEmailAndPassword(String string, String string2, String string3) {
	    
		Customer C = new Customer();
		String fn = "Ahmad";
		String ln = "Ali";
		String e = "AhmadAli12@gmail.com";
		String p = "123456789";
		C.setFirstName(fn);
		C.setLastName(ln);
		C.setEmail(e);
		C.setPassword(p);
		assertTrue((C.getFirstName().equals(fn))&&(C.getLastName().equals(ln))&&(C.getEmail().equals(e))&&(C.getPassword().equals(p)));
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the customer is not already registered")
	public void theCustomerIsNotAlreadyRegistered() {
	    
		Customer C = new Customer();
		C.setExistence(false);
		assertFalse(C.isExistence());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the Customer with name {string}, email {string}, and password {string} added successfully")
	public void theCustomerWithNameEmailAndPasswordAddedSuccessfully(String string, String string2, String string3) {
	    
		CleanApp ca = new CleanApp();
		Customer C = new Customer();
		String fn = "Ahmad";
		String ln = "Ali";
		String e = "AhmadAli12@gmail.com";
		String p = "123456789";
		C.setFirstName(fn);
		C.setLastName(ln);
		C.setEmail(e);
		C.setPassword(p);
		C.setExistence(true);
		ca.setAddedCustomer(C);
		assertEquals(C , ca.getAddedCustomer());
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the customer is already registered")
	public void theCustomerIsAlreadyRegistered() {
	    
		Customer C = new Customer();
		C.setExistence(true);
		assertTrue(C.isExistence());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the Customer will not added")
	public void theCustomerWillNotAdded() {
	    
		CleanApp ca = new CleanApp();
		ca.setAddedCustomer(null);
		assertNull(ca.getAddedCustomer());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
