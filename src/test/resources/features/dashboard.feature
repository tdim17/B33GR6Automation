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