Feature: Validate username on the profile
  Agile story: As a user, When I navigate to profile settings, I should see full name should match with the user name.

  Background: User is already in Dashboard page
    Given the user is already logged under a "user" role

  @usernameValidation1
  Scenario: Validate username on the profile
    When user first clicks on profile button
    And user clicks settings button
    Then user name displayed under profile should match text box value under full name

  @usernameValidation2
  Scenario:Validate username on the profile after changing
    When user is on the settings page
    And changes the value under full name
    And refresh the page
    Then user should see that new changed value should match with name under profile

  @usernameValidation3
  Scenario:Validate username on the profile with incorrect format
    When user is on the settings page
    And  changes the value under full name to specials characters or integer
    Then system should not allow this change,should throw an warning message

