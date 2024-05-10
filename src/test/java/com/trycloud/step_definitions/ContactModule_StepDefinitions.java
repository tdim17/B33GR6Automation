package com.trycloud.step_definitions;

import com.trycloud.pages.ContactIndividualPage;
import com.trycloud.pages.ContactModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    ContactModulePage contactModulePage = new ContactModulePage();
    ContactIndividualPage contactIndividualPage = new ContactIndividualPage();


    @Given("user is on Dashboard page")
    public void user_is_on_dashboard_page() {
        System.out.println(("user is on the Dashboard page"));  // just a notification
    }

    @Then("user click Contact page")
    public void user_click_contact_page() {

        BrowserUtils.sleep(2);
        dashboardPage.contactsFolder.click();
    }


    @Then("user can create a new group")
    public void userCanCreateANewGroup() {
        contactModulePage.createNewGroup1.click();
        BrowserUtils.sleep(1);
        contactModulePage.inputNewGroupName.sendKeys("GroupA" + Keys.ENTER);
        contactModulePage.createNewGroup1.click();
        BrowserUtils.sleep(1);
        contactModulePage.inputNewGroupName.sendKeys("GroupB" + Keys.ENTER);
        contactModulePage.createNewGroup1.click();
        BrowserUtils.sleep(1);
        contactModulePage.inputNewGroupName.sendKeys("GroupC" + Keys.ENTER);
    }

//    @Then("user can create a new contact")
//    public void userCanCreateANewContact() {
//        contactModulePage.createNewContact.click();
//        BrowserUtils.sleep(2);
//        contactIndividualPage.fullNameInbox.clear();
//        BrowserUtils.sleep(2);
//        contactIndividualPage.fullNameInbox.sendKeys("Albert One" + Keys.ENTER);//
//    }


    @Then("user can create a new contact")
    public void userCanCreateANewContact() {
        for (int i = 1; i < 4; i++) {
            contactModulePage.createNewContact.click();
            BrowserUtils.sleep(1);
            contactIndividualPage.fullNameInbox.clear();
            BrowserUtils.sleep(1);
            contactIndividualPage.fullNameInbox.sendKeys("Albert " +i + Keys.ENTER);
        }
    }


    @And("user can see all groups name through the dropdown menu inside existing contact")
    public void userCanSeeAllGroupsNameThroughTheDropdownMenuInsideExistingContact() {

        List<String> groups = new ArrayList<>();

        for (WebElement element : contactIndividualPage.groupsList) {
            groups.add(element.getText());
        }
        System.out.println("groups = " + groups);



    }
}
