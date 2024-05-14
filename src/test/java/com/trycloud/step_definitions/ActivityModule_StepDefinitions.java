package com.trycloud.step_definitions;

import com.trycloud.pages.ActivityModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    ActivityModulePage activityModulePage = new ActivityModulePage();

    @When("user click on Activity Button")
    public void user_click_on_activity_button() {
     dashboardPage.activityFolder.click();

    }


    @Then("user see display by you button")
    public void userSeeDisplayItemsList() {

        Assert.assertTrue(activityModulePage.byYou.isDisplayed());
        activityModulePage.byYou.click();
    }

    @Then("user see display by others button")
    public void userSeeDisplayByOthersButton() {
        Assert.assertTrue(activityModulePage.byOthers.isDisplayed());
        BrowserUtils.sleep(2);
        activityModulePage.byOthers.click();

    }
}
