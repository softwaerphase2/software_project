@tag
Feature: Add new customer

  @tag1
  Scenario: Customer added successfully
    Given that the administrator is logged in
    When added a Customer with name "Ahmad Ali", email "AhmadAli12@gmail.com", and password "123456789"
    Given the customer is not already registered
		Then the Customer with name "Ahmad Ali", email "AhmadAli12@gmail.com", and password "123456789" added successfully
		
  @tag2
  Scenario: Customer already registered
    Given that the administrator is logged in
    When added a Customer with name "Ahmad Ali", email "AhmadAli12@gmail.com", and password "123456789"
    Given the customer is already registered
		Then the Customer will not added
		
		
  @tag3
  Scenario: Customer name is required
    Given that the administrator is logged in
    When added a Customer with name " ", email "AhmadAli12@gmail.com", and password "123456789"
    Given the customer is not already registered
		Then the Customer will not added

