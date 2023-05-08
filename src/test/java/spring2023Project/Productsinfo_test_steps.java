package spring2023Project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productsinfo_test_steps {

	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {
	    
		CleanApp ca = new CleanApp();
		String a = "admin";
		ca.setAppUserType(a);
		assertEquals(a, ca.getAppUserType());
	    //throw new io.cucumber.java.PendingException();
	}

	@When("added a product with name {string}, size {string}, and material {string}")
	public void addedAProductWithNameSizeAndMaterial(String string, String string2, String string3) {
	    
		Product P = new Product();
		String n = "carpet";
		String s = "4";
		String m = "cutton";
		P.setProductMaterial(m);
		P.setProductName(n);
		P.setProductSize(s);
		assertTrue((P.getProductMaterial().equals(m))&&(P.getProductName().equals(n))&&(P.getProductSize().equals(s)));
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the product is not in the store")
	public void theProductIsNotInTheStore() {
	    
		Product P = new Product();
		P.setExistence(false);
		assertFalse(P.isExistence());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the product with name {string}, size {string}, and material {string} added successfully")
	public void theProductWithNameSizeAndMaterialAddedSuccessfully(String string, String string2, String string3) {
	    
		CleanApp ca = new CleanApp();
		Product P = new Product();
		String n = "carpet";
		String s = "4";
		String m = "cutton";
		P.setProductMaterial(m);
		P.setProductName(n);
		P.setProductSize(s);
		P.setExistence(true);
		
		ca.setAddedProduct(P);
		assertEquals(P , ca.getAddedProduct());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the product already is in the store")
	public void theProductAlreadyIsInTheStore() {
	    
		Product P = new Product();
		P.setExistence(true);
		assertTrue(P.isExistence());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the product will not added")
	public void theProductWillNotAdded() {
	    
		CleanApp ca = new CleanApp();
		ca.setAddedProduct(null);
		assertNull(ca.getAddedProduct());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
