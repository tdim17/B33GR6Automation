@projecttest
Feature: Users should be able to login

  #Background tag works before each scenario. We can use it for repeated steps only from the start (it's PRE condition)
  Background: User is already in Dashboard page
  Given the user logged in as "user"
 # Given the user is already logged under a "user" role

  Scenario: User should be able to create a new group and add any contact into a group under Contacts module
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create a new group
    # And user can add any contact into a group
