@DeckFeatures
Feature: User should be able to manage the works
  by creating a new board/list/card and modifying them under Deck Module.

  Background: User is already in Dashboard page
    Given the user is already logged under a "user" role

  Scenario: User can create a new board
    Given user is on the Deck page
    When user clicks on Add board button of the All boards side menu
    And user write the "new board" name and send it
    Then user should see that just created "new board" is located at All boards side menu
