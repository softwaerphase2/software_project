
@tag
Feature: Track the orders and the status

  @tag1
  Scenario: waiting
    Given that the administrator is logged in
    And there is an order that the customer Not explained it enough
    Then the order status is waiting
    
  @tag2
  Scenario: in treatment
    Given that the administrator is logged in
    And there is an order that ordered by customer but not ready yet
    Then the order status is in treatment
    
  @tag3
  Scenario: complete
    Given that the administrator is logged in
    And there is an order that ordered by customer and its ready 
    Then the order status is complete  
