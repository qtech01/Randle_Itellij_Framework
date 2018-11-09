@ForgotPasswordUnregisteredEmail
    Feature: Forgot Password Unregistered Email

    Scenario: As a user I want to see an error reset my Password with unregistered email
      Given I am on the home page
      And I see a logo Banner
      When I click SignIn button
      And I click forgot password Link
      And I enter unregistered user email "maxtest77@gmail.com" details
      And I click retrieve password button
      Then I should see an error message
      And I click back to login button
