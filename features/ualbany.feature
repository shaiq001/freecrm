
Feature: as a student i should be able to loging my Ualbany account

  Scenario Outline: Student login
    Given i should have a chrome browser running
    When 	i go to website 
    And   i enter valid "<username>" and valid"<password>"
    When 	i click on sign in button
   	Then  i should see title 
   	And 	i can click on UAlbany Mail
   	Then 	i Should see new window opened
   	And 	i should be able to click on No button
   	And 	i close all browsers
   	
   	 Examples:
    	|username|password|
    	|as855698|001()@Darwish|
    	|as855698|001()@Darwish|
   	 
   	
   	
  

