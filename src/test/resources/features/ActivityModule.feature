#@B33G6_US11
Feature: User should be able to see listed items under activity module
  Agile Story: As a user, I should be able to see listed items under the Activity module.


  Background: User is already in Dashboard page
    Given the user logged in as "user"


  #User can display all listed items under the Activity module.

  Scenario: Verify user can display all listed items under the Activity module
    When User can click on activity module
  Then User can display all listed items under the Activity module
    |All activities|
    |By you|
    |By others|
    |Circles|
    |Favorites|
    |File changes|
    |File shares|
    |Calendar|
    |Todos|
    |Comments|
    |Deck|




  #Scenario: User can see all items list ordered by newest to oldest.
   # Given user is on the dashboard
    #Then user click on Activity Module
    #And user should see listed items date modified time

  #Scenario: User can see "No more events to load" message at the end of the "All Activities" tab.
    #Given user is on the dashboard
    #Then user click on Activity Module
   #And user should see "No more events to load" at the bottom


