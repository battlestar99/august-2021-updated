Feature: login to the sauce demo

  Background: 
  Scenario Outline: invalid login
  @smoke
	Given user is in login page

    When user insert new valid "<username>"
    And user insert valid "<password>"
    And user click in the signin button
    Then user should able to login
    

    Examples: 
      | username                | password     |
      | locked_out_user         | secret_sauce |
      | performance_glitch_user | secret_sauce |
