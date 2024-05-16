@B33G6-148 @dmitry
Feature: US-008 User should be able to create a new group and add any contact into a group under Contacts module

  #Background tag works before each scenario. We can use it for repeated steps only from the start (it's PRE condition)
  Background: User is already in Dashboard page
    #@B33G6-124
    Given the user logged in as "user"

  @B33G6-144
  Scenario: US-008 TC1 User can create a new group under Contacts Module
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create 3 new group
    Then verify if the group created

  @B33G6-145
  Scenario: US-008 TC2 User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create 5 new group
    And user can create 7 new contact
    Then  verify if user can see all groups name through the dropdown menu inside existing contact
    And delete all contacts on the page

  @B33G6-146
  Scenario: US-008 TC3 User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create 2 new contact
    And user can add a new property "Anniversary" on the contact Info page
    Then verify if the property is created
    And delete all contacts on the page
    # Properties that can be used: Anniversary , Email , Birthday , Nickname , Timezone , Website , Notes

  @B33G6-147
  Scenario: US-008 TC4 EXTRA AC: User can add a new property with calendar and set up the date of event
    Given user is on Dashboard page
    Then user click Contact page
    Then user can create 3 new contact
    And user can add a new property "Birthday" on the contact Info page
    And user can set date of event 2029 07 20
    Then verify if the date is added
    And delete all contacts on the page
    # Properties with date settings: Anniversary , Birthday