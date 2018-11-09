@InvalidLogin
Feature: InvalidLogin

  Scenario Outline: As a user i want to see an error message when i login with invalid data
    Given I am on the home page
    And I see a logo Banner
    When I click SignIn button
    And I enter user email "<email>" details
    And I enter user password "<password>" details
    And I click the Login Button
    Then I should see an error "<ErrorMessage>" message details


    Examples:
      |email                    |password      |ErrorMessage                |
      |bradj4244@gmail.com      |WrongPWD1     |Authentication failed.      |
      |bradjohn21@yahoo.com     |              |Password is required.       |
      |                         |Tomorrow1     |An email address required.  |
      |wrongemail@hotmail.com   |WrongPWD2     |Authentication failed.      |
      |                         |              |An email address required.  |
      |bradjohn47@aol.com       |**********    |Authentication failed.      |
