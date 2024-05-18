@B33G6-91
Feature: Default

		User Story :
		As a user, I should be able to change folder view order by using Name/Size/Modified buttons.


	Background: for all the stories user is inside TryCloud dashboardFeature: Folder view functionality
		Given User is on tryCloud main dashboard page
		Given User is on the all files page



	@B33G6-110
	Scenario: Verify user can change folder view order by name
		Given  User is on the all files page
		When User click on sort by Name button
		Then User should see the list in alphabetical descending

			|market       |
			|Talk		  |
			|kawtar.png   |
			|kawtarFolder |

		And  User click on sort by Name button

		Then User should see the list in alphabetical ascending  order

			|kawtarFolder|
			|kawtar.png	 |
			|Talk		 |
			|market      |



	@B33G6-111
	Scenario: Verify  user can change folder view order by Size.
		Given User is on the all files page
		And User click sort by size button
		Then User should see the list of  size order

			| 407 KB  |
			| 311 KB  |
			| 0 KB    |
			| 0 KB    |

		And User click sort by size button

		Then User should see the descending  list of size order


			| 0 KB 	    |
			| 0 KB  	|
			| 311 KB    |
			| 407 KB    |



	@B33G6-113
	Scenario: Verify user can change folder view order by modified
		Given User is on the all files page
		And User clicks sort by modified button
		Then User should see the list in ascending order
				|5 days ago  |
		    	|5 days ago  |
				|8 days ago  |
            	|18 days ago |

		And User clicks sort by modified button
		Then User should see the list in descending order
		        |8 days ago |
				|5 days ago  |
		        |5 days ago  |
                |18 days ago  |


	@B33G6-115
	Scenario: Verify user can see all files at once and see the total value of it.
		Given User is on the all files page
		When User click on select all checkbox
		And all checkboxes should be selected
		Then total values of folders and files should be seen correctly


