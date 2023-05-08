@tag
Feature: Give a discount

@tag1
  Scenario: no discount
    Given that the administrator is logged in
    And the customer frequently uses the service with an amount of money < 400 NIS or did not frequently uses the service
    When generate bill
    Then the total price comes with no discount
    
@tag2
Scenario: 10% discount
    Given that the administrator is logged in
    And the customer frequently uses the service with an amount of money > 400 NIS and < 1000 NIS
    When generate bill
    Then the total price comes with 10% discount

@tag3
Scenario: 15% discount
    Given that the administrator is logged in
    And the customer frequently uses the service with an amount of money > 1000 NIS and < 2000 NIS
    When generate bill
    Then the total price comes with 15% discount
    
@tag4
Scenario: 20% discount
    Given that the administrator is logged in
    And the customer frequently uses the service with an amount of money > 2000
    When generate bill
    Then the total price comes with 20% discount