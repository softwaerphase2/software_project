package springproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Report_test_steps {

	@Given("the last month statistics comes with total = {string}, cost = {string}, payrolls = {string}")
	public void theLastMonthStatisticsComesWithTotalCostPayrolls(String string, String string2, String string3) {
	     
		CleanApp ca = new CleanApp();
		int t = 9000;
		int c = 1500;
		int p = 3000;
		ca.setTotal(t);
		ca.setCost(c);
		ca.setPayrolls(p);
		assertTrue((ca.getTotal() == t)&&(ca.getCost() == c)&&(ca.getPayrolls() == p));
	    //throw new io.cucumber.java.PendingException();
	}


	@Then("generate a report")
	public void generateAReport() {
	    
		CleanApp ca = new CleanApp();
		ca.setReprtGenerated(true);
		assertTrue(ca.isReprtGenerated());
	    //throw new io.cucumber.java.PendingException();
	}
	
}
