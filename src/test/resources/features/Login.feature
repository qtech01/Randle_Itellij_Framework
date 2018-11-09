@Login
Feature: Login

  Scenario Outline: As a user i want to login successfully
    Given I am on the home page
    And I see a logo Banner
    When I click SignIn button
    And I enter user email "<email>" details
    And I enter user password "<password>" details
    And I click the Login Button
    Then I should be logged in successfully
    And I Sign out


    Examples:
      |email                    |password      |
      |bradj4244@gmail.com      |Tomorrow1     |
  