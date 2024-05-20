Feature: Validate username on the profile, Validating user email address on the Profile Settings,
  Validate change language functionality on the settings page

  Agile story: As a user, When I navigate to profile settings, I should see full name should match with the user name.
  As a user, when I am on the settings page, I should be able to enter email address into email input box.
  As a user, I should be able to change language displayed on the UI
  when I select a value from language dropdown


  Background: User is already in Dashboard page
    Given the user logged in as "user"

  @usernameValidation1
  Scenario: Validate username on the profile
    When user first clicks on profile button
    # And user clicks settings button
    # Then user name displayed under profile should match text box value under full name


  Scenario:Validate username on the profile after changing
    When user is on the settings page
    And changes the value under full name
    And refresh the page
    Then user should see that new changed value should match with name under profile


  Scenario:Validate username on the profile with incorrect format
    When user is on the settings page
    And  changes the value under full name to specials characters or integer
    Then system should not allow this change,should throw an warning message

  @email
  Scenario:
    When user is on the settings page
    And user enters valid email on email input box
    Then systems should accepts the change


  @Language
  Scenario:
    When user is on the settings page
    And selects the value from the language dropdown
    Then get the text of the language label on the settings page
    Then actual String value of the language label and expected String value of the language label should be same


