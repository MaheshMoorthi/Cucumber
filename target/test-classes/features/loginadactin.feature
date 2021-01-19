
Feature: verify login adactin 
  
  Scenario: verify login page of adactin hoytel app with valid credentials
    Given user is on adactin hotel login page
    When user eneter the valid credentials for username and password
    And user click the login button
    Then user validate the outcomes
    

 