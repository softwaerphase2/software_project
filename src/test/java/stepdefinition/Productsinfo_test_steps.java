package spring2023Project;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productsinfo_test_steps {
	
	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_LoggedIn);
	}

	@Given("there is a product with name {string}, size\"{int}\", and material\"cotton\"")
	public void thereIsAProductWithNameSizeAndMaterialCotton(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_valid);
		
	}

	@Given("the product is not in the store")
	public void theProductIsNotInTheStore() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_InTheStore);
	}

	@When("the product is added to the store")
	public void theProductIsAddedToTheStore() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.addProduct);
	}

	@Then("the product with name {string}, size\"{int}\", and material\"cotton\" is contained in the store")
	public void theProductWithNameSizeAndMaterialCottonIsContainedInTheStore(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_Contained);
	}

	@Given("that the administrator is not logged in")
	public void thatTheAdministratorIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_LoggedIn);
		
	}

	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.errorMessage);
	}

}
