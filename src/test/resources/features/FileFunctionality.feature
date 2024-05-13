@B33G6-122
Feature: Default

	
	@B33G6-120
	Scenario: User adds a file to favorites from its options menu
		Given The user is logged into the file management system
		And The user has navigated to the file they want to rename
		Then The user clicks on the three dots menu icon next to the file	

	
	#@B33G6-116
	#Scenario: User adds a file to favorites from its options menu
	#	Given The user is logged into the file management system
	#	And The user has navigated to the file they want to add to favorites
	#	Then The user clicks on the the three dots menu icon next to the file

	
	#@B33G6-121 @B33G6-63
	#Scenario: User can put some comments on any file from the file details menu opened right side
	#	Given The user is logged into the file management system
	#	And The user has navigated to the file they want to add comments to
	#	Then The user opens the file details menu, located on the right side of the file viewer or in a designated area
	#	And Within the file details menu, the user locates the "Comments" section
	#	And The user clicks on the "Add Comment" button or similar action
	#	And A text input field appears, allowing the user to enter their comment
	#	And The user types their comment into the input field
	#	And The user submits the comment, either by pressing enter or clicking a submit button
	#	And The comment is added to the file's comments section
	#	And The user's name and timestamp are associated with the comment to indicate authorship and when it was added
	#	And The user can view all comments associated with the file within the file details menu