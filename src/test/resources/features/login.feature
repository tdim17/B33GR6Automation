@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip_role1
  Scenario: Verify login with different user types
  Given the user logged in as "user"

  #@wip_role2
  #Scenario: Verify login with different user types
  #  Given the user logged in as "employee"

  # Given the user logged in as "<userType>"
  # Given the user logged in with username as "user300" and password as "Userpass123"




