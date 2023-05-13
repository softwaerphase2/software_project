package springproject;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrderStatus_test_steps {

	@Given("there is an order that the customer Not explained it enough")
	public void thereIsAnOrderThatTheCustomerNotExplainedItEnough() {

		Customer C = new Customer();
		C.setHasOrder("no");
		assertEquals(false , C.getHasOrder());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the order status is waiting")
	public void theOrderStatusIsWaiting() {
	    
		Order O = new Order();
		String w = "waiting";
		O.setOrderStatus(w);
		assertEquals(w , O.getOrderStatus());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("there is an order that ordered by customer but not ready yet")
	public void thereIsAnOrderThatOrderedByCustomerButNotReadyYet() {
	    
		Order O = new Order();
		O.setIsReady(false);
		assertEquals(false , O.getIsReady());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the order status is in treatment")
	public void theOrderStatusIsInTreatment() {
	    
		Order O = new Order();
		String w = "in treatment";
		O.setOrderStatus(w);
		assertEquals(w , O.getOrderStatus());
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("there is an order that ordered by customer and its ready")
	public void thereIsAnOrderThatOrderedByCustomerAndItsReady() {
	    
		Order O = new Order();
		O.setIsReady(true);
		assertEquals(true , O.getIsReady());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the order status is complete")
	public void theOrderStatusIsComplete() {
	    
		Order O = new Order();
		String w = "complete";
		O.setOrderStatus(w);
		assertEquals(w , O.getOrderStatus());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
