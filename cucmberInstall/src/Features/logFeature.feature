Feature: login to the sauce demo

  Background: 
Given user is in login page
@smoke
  Scenario: Validating the login page
    
    Then user shold able to see the username textbox
    Then user shold able to see the password textbox
    Then user shold able to see the signin button
    
    Scenario Outline: Valid user should able to login
 
    When user insert new valid "<username>"
    And user insert valid "<password>"
    And user click in the signin button
    Then user should able to login
    

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      