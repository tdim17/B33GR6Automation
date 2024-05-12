package com.trycloud.step_definitions;

import com.trycloud.pages.ContactInfoPage;
import com.trycloud.pages.ContactModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    ContactModulePage contactModulePage = new ContactModulePage();
    ContactInfoPage contactInfoPage = new ContactInfoPage();


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
//        BrowserUtils.sleep(1);
//        contactModulePage.inputNewGroupName.sendKeys("GroupC" + Keys.ENTER);
    }


    @Then("user can create a new contact")
    public void userCanCreateANewContact() {
        for (int i = 1; i < 2; i++) {
            contactModulePage.createNewContact.click();
            BrowserUtils.sleep(1);
            contactInfoPage.fullNameInbox.clear();
            BrowserUtils.sleep(1);
            contactInfoPage.fullNameInbox.sendKeys("Albert " +i + Keys.ENTER);
        }
    }


    @And("user can see all groups name through the dropdown menu inside existing contact")
    public void userCanSeeAllGroupsNameThroughTheDropdownMenuInsideExistingContact() {

            List<String> list1 = new ArrayList<>();
            for (WebElement element : contactInfoPage.groupsList) {
                list1.add(element.getAttribute( "title" ));
            }

            List<String> list2 = new ArrayList<>();
            for (WebElement each : contactInfoPage.groupsListPanel) {
                list2.add(each.getText());
            }
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
            Assert.assertTrue(list2.containsAll(list1));

    }

    @And("user can add a new property Anniversary on the contact Info page")
    public void userCanAddANewPropertyOnTheContactInfoPage() {

        contactInfoPage.addNewProperty.click();
        contactInfoPage.addPropertyAnniversary.click();

    }


    @Then("user can add date of Anniversary {int} {int} {int}")
    public void userCanAddDateOfAnniversary(int year, int month, int day) {

        contactInfoPage.inputBoxAnniversary.click();
        BrowserUtils.waitFor(1);

        contactInfoPage.calendarYearButton.click();
        // BrowserUtils.waitFor(1);

        contactInfoPage.yearSet(year).click();
        // BrowserUtils.waitFor(1);

        contactInfoPage.monthSet(month).click();
        // BrowserUtils.waitFor(1);

        contactInfoPage.daySet(day).click();
        // BrowserUtils.waitFor(2);

        contactInfoPage.clickButton.click();


    }
}
