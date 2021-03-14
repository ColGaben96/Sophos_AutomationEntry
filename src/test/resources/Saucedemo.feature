Feature: Enter Saucedemo and do some tests.
  As it was solicited, this feature has to enter Saucedemo and follow it's instructions.
  In this case, has to buy some stuff

  Scenario: Given I am on Saucedemo Webpage
    When I get in webpage
    Then Authenticate with "login" and "password"