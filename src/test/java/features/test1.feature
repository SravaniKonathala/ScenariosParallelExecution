Feature: Working on Parallel Execution

Scenario: Launching browser and application

	Given I launch the Chrome driver
	Then I launch the google application
	And I search for "automation testing"	and name is "q"
	And I close the browser
	
Scenario: Launching browser and application

	Given I launch the Firefox driver
	Then I launch the yahoo application 
	And I search for "automation testing"	and name is "p"
	And I close the browser
	