Feature: login functionality

Scenario: positive testing

Given user is in signin page
When user enter valid usernames
When user enter valid passwords
And click on signin button
Then User should be able to login