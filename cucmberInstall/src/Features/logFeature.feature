Feature: login to the sauce demo

  Background: 

  Scenario: Valid user should able to login
    Given user is in login page
    When user insert valid user name    
    And user insert valid password
    And user click in the signin button
    Then user should able to login
