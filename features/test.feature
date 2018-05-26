Feature: As a valid user when i enter my credentials, i should be able to login
 
  Scenario: As an editor i should be able to login to the application
    Given I have firefox browser running
    When  I go to the websit
    And 	I enter valid username
    And 	I enter valid password
    When 	I click on the login button
    Then 	I should see alogout link
    
 