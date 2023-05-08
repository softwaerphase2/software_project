 @tag
      Feature: Generating report
      
      @tag1
      Scenario: Generate report
      Given that the administrator is logged in
      And the last month statistics comes with total = "9000", cost = "1500", payrolls = "3000"
			Then generate a report