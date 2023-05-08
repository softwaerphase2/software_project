  
      @tag3
      Feature: Add Product
      
      @tag4
      Scenario: add a product successfully
      Given that the administrator is logged in
      When added a product with name "quilt", size "7", and material "cotton"
      Given the product is not in the store
			Then the product with name "quilt", size "7", and material "cotton" added successfully
			
			@tag5
      Scenario: a product is already exist
      Given that the administrator is logged in
      When added a product with name "quilt", size "7", and material "cotton"
      Given the product already is in the store
			Then the product will not added
			