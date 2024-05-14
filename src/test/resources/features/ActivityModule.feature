
Feature: Users should be able to login


  Background: User is already in Dashboard page
    Given the user logged in as "user"

    Scenario: User can display all listed items under the Activity module
      When user click on Activity Button
      Then user see display by you button
      Then user see display by others button