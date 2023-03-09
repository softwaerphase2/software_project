Feature: Customer Login

Scenario: Valid Login
    When the customer logs in with email "hgh@email.com" and password "password123"
    Then the customer should be logged in successfully

Scenario: Invalid Password
    When the customer logs in with email "jafar@email.com" and password "wrongpassword"
    Then the customer should not be logged in

Scenario: Invalid Email
    When the customer logs in with email "wrongemail@email.com" and password "password123"
    Then the customer should not be logged in