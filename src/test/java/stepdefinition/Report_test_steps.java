package spring2023Project;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Report_test_steps {
	@Given("the last month statistics comes with total = {string}, cost = {string}, payrolls = {string}")
	public void theLastMonthStatisticsComesWithTotalCostPayrolls(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.reportReady);
	   // throw new io.cucumber.java.PendingException();
	}

	@When("the manager asks for report")
	public void theManagerAsksForReport() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.is_asked);
	}

	@Then("the last month statistics comes with total = {string}, cost = {string}, payrolls = {string} becomes as a report")
	public void theLastMonthStatisticsComesWithTotalCostPayrollsBecomesAsAReport(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		CleanApp ca = new CleanApp();
		assertEquals(false, ca.generateReport);
	   // throw new io.cucumber.java.PendingException();
	}

}
