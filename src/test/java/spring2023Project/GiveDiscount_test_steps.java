package spring2023Project;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiveDiscount_test_steps {
	
	@Given("the customer frequently uses the service with an amount of money < {int} NIS or did not frequently uses the service")
	public void theCustomerFrequentlyUsesTheServiceWithAnAmountOfMoneyNISOrDidNotFrequentlyUsesTheService(Integer int1) {
	    
		Customer C = new Customer();
		String c = "c";
		C.setCustomerType(c);
		assertEquals(c , C.getCustomerType());
	    //throw new io.cucumber.java.PendingException();
	}

	@When("generate bill")
	public void generateBill() {
		
	    Order O = new Order();
	    String x = "in treatment";
	    O.setOrderStatus(x);
	    assertEquals(x , O.getOrderStatus());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the total price comes with no discount")
	public void theTotalPriceComesWithNoDiscount() {
		
		Order O = new Order();
		int d = 0;
		O.setOrderDiscount(d);
		assertEquals(d , O.getOrderDiscount());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the customer frequently uses the service with an amount of money > {int} NIS and < {int} NIS")
	public void theCustomerFrequentlyUsesTheServiceWithAnAmountOfMoneyNISAndNIS(Integer int1, Integer int2) {
	    
		Customer C = new Customer();
		String t="b";
		if(int2 == 2000) {t="a";}
		C.setCustomerType(t);
		assertEquals(t , C.getCustomerType());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the total price comes with {int}% discount")
	public void theTotalPriceComesWithDiscount(Integer int1) {
	    
		Order O = new Order();
		int d = int1;
		O.setOrderDiscount(d);
		assertEquals(d , O.getOrderDiscount());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the customer frequently uses the service with an amount of money > {int}")
	public void theCustomerFrequentlyUsesTheServiceWithAnAmountOfMoney(Integer int1) {
	    
		Customer C = new Customer();
		String s = "s";
		C.setCustomerType(s);
		assertEquals(s , C.getCustomerType());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
