#Author - Zakir
#Date - 09/20/2021

Feature: checking Sauce Demo login functionality

Background: 

Scenario: positive login testing

Given user is in the login page
When user insert valid username
And user insert valid password
And user click on signin button
Then user should be able to login


