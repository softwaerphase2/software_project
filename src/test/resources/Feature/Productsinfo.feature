#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


      
      @tag3
      Feature: Add Product
      
      @tag4
      Scenario: add a product successfully
      Given that the administrator is logged in
      And there is a product with name "quilt", size"7", and material"cotton"
      And the product is not in the store
      When the product is added to the store
			Then the product with name "quilt", size"7", and material"cotton" is contained in the store
			
			@tag5
      Scenario: add a product when administrator is not logged in
      Given that the administrator is not logged in
      And there is a product with name "quilt", size"7", and material"cotton"
      When the product is added to the store
			Then the error message "Administrator login required" is given
			