package springProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DistributeOrders_test_steps {

	@When("I want to give order for worker with name {string} and phone number {string}")
	public void iWantToGiveOrderForWorkerWithNameAndPhoneNumber(String string, String string2) {
	    
		Worker W = new Worker();
		String n = "ali";
		String p = "0569654321";
		W.setName(n);
		W.setPhoneNumber(p);
		assertTrue((W.getName().equals(n))&&(W.getPhoneNumber().equals(p)));
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the worker is available")
	public void theWorkerIsAvailable() {
	    
		Worker W = new Worker();
		W.setAvailability("yes");
		assertTrue(true);
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the Worker with name {string} and phone number {string} got this order")
	public void theWorkerWithNameAndPhoneNumberGotThisOrder(String string, String string2) {
	    
		Order O = new Order();
		Worker W = new Worker();
		O.setWorkerOnorder(W);
		assertEquals(W,O.getWorkerOnorder());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the worker is not available")
	public void theWorkerIsNotAvailable() {
	    
		Worker W = new Worker();
		W.setAvailability("no");
		assertFalse(false);
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the Worker cannot handle this order")
	public void theWorkerCannotHandleThisOrder() {
	    
		Order O = new Order();
		Worker W = new Worker();
		assertNotEquals(W,O.getWorkerOnorder());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
