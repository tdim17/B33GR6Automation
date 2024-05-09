package com.trycloud.step_definitions;

import com.trycloud.pages.ContactPage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class ContactModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    ContactPage contactPage = new ContactPage();

    @Given("user is on Dashboard page")
    public void user_is_on_dashboard_page() {
        System.out.println(("user is on the Dashboard page"));  // just a notification
    }

    @Then("user click Contact page")
    public void user_click_contact_page() {

        dashboardPage.contactsFolder.click();
        BrowserUtils.sleep(5);

    }


    @Then("user can create a new group")
    public void userCanCreateANewGroup() {
        contactPage.addNewGroup2.click();
        BrowserUtils.sleep(2);
        contactPage.inputNewGroupName.sendKeys("Group01" + Keys.ENTER);

    }

    @And("user can add any contact into a group")
    public void userCanAddAnyContactIntoAGroup() {
    }
}
