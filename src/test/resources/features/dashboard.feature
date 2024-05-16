@Zeynab
Feature: User should be able to search file or contact from the Dashboard

  Background: User is already in Dashboard page
    Given the user logged in as "user"

  Scenario: US-009 TC1 AC1: User can search file typing its name through the magnifying glass icon
  inside any Module and see the details side page of the file when clicked on it.
    When user clicks on Search button on right of dashboard
    And user types "flowertoupload.jpeg" file name in the search box
    And user click "flowertoupload.jpeg" file from list
    Then user should see the details of the file on the right menu

    Scenario: US-009 TC1 AC2: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page

      When user clicks on Search button on right of dashboard
      And user types "flowertoupload.jpeg" file name in the search box
      And user click "flowertoupload.jpeg" file from list
      And user in Files page
      And user click the App icon at the top left corner
      Then user navigate to the Dashboard page

