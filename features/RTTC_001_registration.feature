@retail
Feature: Register New User

  @Registration
  Scenario: Register New User
    Given I am on Retail Homepage
    And i navigate to Login Page
    And i navigate to Register Page
    When I enter required details
    Then I should be able to register the new user successfully
    
