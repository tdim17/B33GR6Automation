@US04_DeckFeatures
Feature: User should be able to manage the works
  by creating a new board/list/card and modifying them under Deck Module.

  Background: User is already in Dashboard page
    #@B33G6-124
    Given the user logged in as "user"

  @B33G6-117
Scenario: US-004 TC1 AC1: Verify user can create a new board
    Given user is on the Deck page
    When user clicks on Add board button of the All boards side menu
    And user write the "new board" name on the board name input field and send it
    Then user should see that just created "new board" is located at All boards side menu

  @B33G6-119
Scenario: US-004 TC2 AC2: Verify user can create a new list of card or task under any board
    Given user is on the Deck page
    When user pick a random board from the All boards list
    And click on Add list button
    And write the "new list" name on the new list input field and send it
    Then user should see just created "new list" on picked before random board page


  @B33G6-125
  Scenario: US-004 TC3 AC3: Verify User can add a new card/task on any list on the current board
    Given user is on the Deck page
    When user pick a random board from the All boards list
    And user pick any list on the current board and click on Add card button
    And write the name of the "new card" on the card name input field and send it
    Then user should see just created "new card" and a new card interface on the side menu

  @B33G6-143
Scenario: US-004 AC4 TC4: Verify user can assign any card/task
  to himself/herself by using the three dots on the related card
    Given user is on the Deck page
    When user pick a random board from the All boards list
    And user picks a already existing card and click a tree dots menu element
    And click on Assign to me dropdown element of the card
    Then user profile icon is displayed next to tree dots menu of the card
