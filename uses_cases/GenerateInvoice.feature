@tag
Feature: Generate invoice

  @tag1
  Scenario: Invoice generated
    Given that the administrator is logged in
    And customer gives "carpet" to clean , his address was "Nablus" , and total price after discount was "60"
    When generate bill
    Then Invoice generated


