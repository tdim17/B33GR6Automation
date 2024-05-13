package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on Search button on right of dashboard")
    public void userClicksOnSearchButtonOnRightOfDashboard() {

        dashboardPage.searchHeader.click();

    }

    @And("user types {string} file name in the search box")
    public void userTypesFileNameInTheSearchBox(String searchValue) {

        dashboardPage.searchForm.sendKeys(searchValue);
    }

    @And("user click {string} file from list")
    public void userClickFileFromList(String file) {
        dashboardPage.searchResult.click();
    }

    @Then("user should see the details of the file on the right menu")
    public void userShouldSeeTheDetailsOfTheFileOnTheRightMenu() {

    }
}
