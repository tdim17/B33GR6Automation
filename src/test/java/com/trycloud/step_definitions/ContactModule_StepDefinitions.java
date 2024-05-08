package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class ContactModule_StepDefinitions {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is already logged under a {string} role")
    public void theUserIsAlreadyLoggedUnderARole(String userType) {

        loginStepDefs.the_user_logged_in_as(userType);
    }


    @Given("user is on Dashboard page")
    public void user_is_on_dashboard_page() {
        System.out.println(("user is on the Dashboard page"));  // just a notification
    }

    @Given("user click Contact page")
    public void user_click_contact_page() {

        dashboardPage.contactsFolder.click();
        BrowserUtils.sleep(5);

    }


}
