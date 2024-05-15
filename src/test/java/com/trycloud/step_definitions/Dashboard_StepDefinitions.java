package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.nio.file.Files;

public class Dashboard_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    FilesPage filesPage = new FilesPage();

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
        Assert.assertTrue(filesPage.filesName.isDisplayed());
    }
}
