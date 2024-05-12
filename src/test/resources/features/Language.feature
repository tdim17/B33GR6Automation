Feature: Validate change language functionality on the settings page
  Agile story: As a user, I should be able to change language displayed on the UI
  when I select a value from language dropdown

  Background: User is already in Dashboard page
    Given the user is already logged under a "user" role

  @Language
  Scenario:
    When user is on the settings page
    And selects the value from the language dropdown
    Then get the text of the language label on the settings page
    Then actual String value of the language label and expected String value of the language label should be same

