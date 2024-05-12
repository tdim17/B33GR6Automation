
Feature: Users should be able to login

  #Background tag works before each scenario. We can use it for repeated steps only from the start (it's PRE condition)
  Background: User is already in Dashboard page
    Given the user logged in as "employee"

  Scenario: User should be able to create a new group and add any contact into a group under Contacts module
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create a new group
    Then user can create a new contact
    And user can see all groups name through the dropdown menu inside existing contact

  @dmitry
  Scenario: User should be able to add a new property
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create a new group
    Then user can create a new contact
    And user can add a new property Anniversary on the contact Info page
    Then user can add date of Anniversary 2029 07 20

