@Omair
Feature: As a user I should be able to modify Dashboard page

 #Background tag works before each scenario. We can use it for repeated steps only from the start (it's PRE condition)
  Background: User is already in Dashboard page
    Given the user logged in as "user"

  Scenario: After Login user can see all modules and Username
    When user is on Dashboard page
    Then user can see dashboard title
    Then user can see file folder module
    Then user can see photos folder module
    Then user can see activity folder module
    Then user can see talk folder module
    Then user can see contacts folder module
    Then user can see circles folder module
    Then user can see calendar folder module
    Then user can see deck folder module
    And user can see username





