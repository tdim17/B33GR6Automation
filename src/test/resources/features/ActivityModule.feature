#@B33G6_US11
Feature: User should be able to see listed items
  Agile Story: As a user, I should be able to see listed items under the Activity module.


  Background: User is already in Dashboard page
    Given the user logged in as "user"


  #User can display all listed items under the Activity module.

  Scenario: User can display all listed items under the Activity module
    Given user is on the dashboard
    Then user click on Activity Module
    Then user should see ByYou folder
    Then user should see ByOthers folder
    Then user should see Circles folder
    Then user should see Favorites folder
    Then user should see FileChanges folder
    Then user should see FileShares folder
    Then user should see Calendar folder
    Then user should see Todos folder
    Then user should see Comments folder
    Then user should see Deck folder



  #Scenario: User can see all items list ordered by newest to oldest.
   # Given user is on the dashboard
    #Then user click on Activity Module
    #And user should see listed items date modified time

  #Scenario: User can see "No more events to load" message at the end of the "All Activities" tab.
    #Given user is on the dashboard
    #Then user click on Activity Module
   #And user should see "No more events to load" at the bottom


