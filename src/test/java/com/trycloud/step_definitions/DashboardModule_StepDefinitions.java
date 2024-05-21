package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashboardModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("user can see file folder module")
    public void user_can_see_all_dashboard_modules() {
        Assert.assertTrue(dashboardPage.fileFolder.isDisplayed());
    }

    @Then("user can see photos folder module")
    public void userCanSeePhotosFolderModule() {
        Assert.assertTrue(dashboardPage.photosFolder.isDisplayed());
    }

    @Then("user can see activity folder module")
    public void userCanSeeActivityFolderModule() {
        Assert.assertTrue(dashboardPage.activityFolder.isDisplayed());
    }

    @Then("user can see talk folder module")
    public void userCanSeeTalkFolderModule() {
        Assert.assertTrue(dashboardPage.talkFolder.isDisplayed());
    }

    @Then("user can see contacts folder module")
    public void userCanSeeContactsFolderModule() {
        Assert.assertTrue(dashboardPage.contactsFolder.isDisplayed());
    }

    @Then("user can see circles folder module")
    public void userCanSeeCirclesFolderModule() {
        Assert.assertTrue(dashboardPage.circlesFolder.isDisplayed());
    }

    @Then("user can see calendar folder module")
    public void userCanSeeCalendarFolderModule() {
        Assert.assertTrue(dashboardPage.calendarFolder.isDisplayed());
    }

    @Then("user can see deck folder module")
    public void userCanSeeDeckFolderModule() {
        Assert.assertTrue(dashboardPage.deckFolder.isDisplayed());
    }

    @And("user can see username")
    public void userCanSeeUsername() {
        Assert.assertTrue(dashboardPage.settingMenuBtn.isDisplayed());
    }

    @Then("user can see dashboard title")
    public void userCanSeeDashboardTitle() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertTrue(actualTitle, actualTitle.contains(expectedTitle));
        System.out.println(actualTitle);
    }
}
