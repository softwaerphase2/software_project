Feature: Customer Login

Scenario: Valid Login
    Given a customer with name "jafar", email "jafar@email.com", and password "password123"
    When the customer logs in with email "jafar@email.com" and password "password123"
    Then the customer should be logged in successfully

Scenario: Invalid Password
    Given a customer with name "jafar", email "jafar@email.com", and password "password123"
    When the customer logs in with email "jafar@email.com" and password "wrongpassword"
    Then the customer should not be logged in

Scenario: Invalid Email
    Given a customer with name "jafar", email "jafar@email.com", and password "password123"
    When the customer logs in with email "wrongemail@email.com" and password "password123"
    Then the customer should not be logged in