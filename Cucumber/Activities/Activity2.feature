@activity2
Feature: Login Test

  @SmokeTest
  Scenario: Testing Login
    Given User is on Login Page
    When User enters Username and Password
    Then Read the page title and confirmation message
    And Close the browser