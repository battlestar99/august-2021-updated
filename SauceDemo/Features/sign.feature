#Author -
#Date -
Feature: This is a sign in feature of sauce demo

  Scenario Outline: sign in to Sauce Demo
    Given user is in login page
    When user insert valid "<username>"
    And user insert valid password
    And user click on sign in button
    Then user should be logged in

    Examples: 
    
    |username|
    |standard_user|
    |locked_out_user|