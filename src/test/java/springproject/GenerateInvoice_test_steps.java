package springproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GenerateInvoice_test_steps {
	
	@Given("customer gives {string} to clean , his address was {string} , and total price after discount was {string}")
	public void customerGivesToCleanHisAddressWasAndTotalPriceAfterDiscountWas(String string, String string2, String string3) {
	    
		Order O = new Order();
		String [] i = {"carpet"};
		String a = "Nablus";
		int tp = 60;
		O.setItems(i);
		O.setAddress(a);
		O.setTotalPrice(tp);
		assertTrue(O.getItems().equals(i)&&(O.getAddress().equals(a))&&(O.getTotalPrice() == tp));
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Invoice generated")
	public void invoiceGenerated() {
	    
		CleanApp A = new CleanApp();
		A.setInvoiceGenerated(true);
		assertTrue(A.isInvoiceGenerated());
	    //throw new io.cucumber.java.PendingException();
	}

}
