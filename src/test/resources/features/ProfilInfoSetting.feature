#@B33G6_US94
Feature: User should be able to change profile info
  Agile story: As a user, I should be able to change profile info settings under the Profile module.


  Background: User is already on the dashboard
    Given the user logged in as "user"

 #@B33G6_133
    # User can see at least following titles inside “Personal Info” under Profile Settings page;
      # => Full name/Email/Phone Number
  Scenario: User can see personal info under Profile Setting page
  Given user is on the dashboard
  Then user click on setting menu
  Then user chose Setting from list
  And user should see Personal Info

#@B33G6_134
  #Name of the user in the Settings field should be the same with Full Name input box
  Scenario: User`s name in the Settings field should be the same with Full Name input box
    Given user is on the dashboard
    When user click on setting menu
    Then user chose Setting from list
    Then user name should be the same with Full Name input box

  #@B33G6_135
  #User cannot pass any characters except numbers into the "Phone Number" input box.
  Scenario: User cannot pass any characters except numbers into the "Phone Number" input box
    Given user is on the dashboard
    When user click on setting menu
    Then user chose Setting from list
    Then user cannot pass any characters except numbers into the Phone Number input box