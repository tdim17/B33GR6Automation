Feature: Validating user email address on the Profile Settings
  Agile story: As a user, when I am on the settings page, I should be able to enter email address into email input box.

  Background: User is already in Dashboard page
    Given the user is already logged under a "user" role


  Scenario:
    When user enters valid email on email input box
    Then systems should accepts the change

  Scenario:
    When user enters email address without .com into email input box
    And system should give an error or warning message

  #invalid email: 1) without .com;  2) leaving the email input box empty; 3) entering digits and spacial charactors only.