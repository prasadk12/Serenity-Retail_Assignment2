 @retail
Feature: Login with Username and Password

  @Login
  Scenario: Login with Username and Password
    Given I am on Retail Homepage
    And i navigate to Login Page
    And i login with Username and Password
    Then I should be able to login to the application
