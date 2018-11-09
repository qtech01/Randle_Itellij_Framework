@ForgotPassword
Feature: Forgot Password

  Scenario: As a user I want to reset my Password
    Given I am on the home page
    And I see a logo Banner
    And I click SignIn button
    And I click forgot password Link
    And I enter user email "maxtest964@gmail.com" details
    And I click retrieve password button
    Then I should see a confirmation message
    And I click back to login button
