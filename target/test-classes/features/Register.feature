@ignore
Feature: Register

  Scenario: As a user i want to create an account successfully
    Given I am on the home page
    And I see a logo Banner
    When I click SignIn button
    And I enter user email "<email>" details
    And I click the Create an account Button
    Then I should be on Your Personal Information Register page successfully
    And I enter all mandatory user details
    And I click Register Button
    Then I should be Register successfully
    And I Sign out