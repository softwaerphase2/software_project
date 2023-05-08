@tag
Feature: Distribute Orders

  @tag1
  Scenario: Worker got this order
    Given that the administrator is logged in
    When I want to give order for worker with name "Ahmad" and phone number "0569123456"
		Given the worker is available
    Then the Worker with name "Ahmad" and phone number "0569123456" got this order

    
  @tag2
  Scenario: Worker is not available
    Given that the administrator is logged in
    When I want to give order for worker with name "Ahmad" and phone number "0569123456"
		Given the worker is not available
    Then the Worker cannot handle this order