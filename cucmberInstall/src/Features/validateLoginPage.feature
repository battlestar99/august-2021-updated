Feature: login to the sauce demo

  Background: 
Given user is in login page
@smoke
  Scenario: Validating the login page
    
    Then user shold able to see the username textbox
    And user shold able to see the password textbox
    And user shold able to see the signin button