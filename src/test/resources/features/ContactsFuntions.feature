@B33G6-131
Feature: Contacts Module Functionality

	Background: User is already logged in on Dashboard page
		#@B33G6-132
		Given the user logged in as "user"


	@B33G6-127
	Scenario: US-003 TC1 AC1 Verify user can create a new contact
		Given User is on the Contact Module page
		When User clicks New Contact button
		And User enters full name by clicking New Contact profile Header
		Then User should see new contact entered on the name box


	@B33G6-128
	Scenario: US-003 TC2 AC2 Verify user can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab

		When User is on the Contact Module page
		Then User should see all list of contacts in middle column
		And User should see total numbers of contacts near Contact tab



	@B33G6-129
	Scenario: US-003 TC3 AC3 Verify user can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
		Given User is on the Contact Module page
		When User clicks profile photo icon near Contact Name on the right column
		And User selects ChooseFromFiles from the dropdown
		And User selects a desired jpeg file
		And User clicks Choose button on bottom right in the frame
		Then User should see chosen photo on the profile photo


	@B33G6-130
	Scenario: US-003 TC4 AC4 Verify user can delete any selected contact
		Given User is on the Contact Module page
		When User clicks a contact from the list on middle column
		And User clicks "three dot" on the top right from profile column
		And User selects "delete" button from the dropdown
		Then User should no longer see that contact anywhere on the page
