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

        BrowserUtils.waitForVisibility(dashboardPage.contactsFolder,5);
        dashboardPage.contactsFolder.click();
    }


    @Then("user can create a new group")
    public void userCanCreateANewGroup() {
        String preffix;
        for (int i = 1; i <= 2; i++) {
            contactModulePage.createNewGroup1.click();
            BrowserUtils.waitForVisibility(contactModulePage.inputNewGroupName,5);

            switch (i) {
                case 1 -> preffix = "A";
                case 2 -> preffix = "B";
                // default -> preffix = String.valueOf(i);
                default -> preffix = "default " +i;
            }
            contactModulePage.inputNewGroupName.sendKeys("Group "+ preffix + Keys.ENTER);
        }
    }


    @Then("user can create a new contact")
    public void userCanCreateANewContact() {
        for (int i = 1; i <= 5; i++) {
            contactModulePage.createNewContact.click();
            BrowserUtils.waitForVisibility(contactInfoPage.fullNameInbox,5);
            contactInfoPage.fullNameInbox.clear();
            BrowserUtils.waitForVisibility(contactInfoPage.fullNameInbox,5);
            contactInfoPage.fullNameInbox.sendKeys("User " +i + Keys.ENTER);
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
        contactInfoPage.yearSet(year).click();
        contactInfoPage.monthSet(month).click();
        contactInfoPage.daySet(day).click();
        contactInfoPage.calendarClickButton.click();
        BrowserUtils.waitFor(2);

        String valueActual = contactInfoPage.inputBoxAnniversary.getAttribute("value");
        System.out.println("valueActual  : " + valueActual);

        String monthString = contactInfoPage.convertMonthToString(month);
        String valueExpected = monthString + " " + day + ", " + year;

        System.out.println("valueExpected: " + valueExpected);

        Assert.assertEquals(valueExpected, valueActual);
    }

    @And("delete all contacts on the page")
    public void deleteAllContactsOnThePage() {

        BrowserUtils.waitForVisibility(contactInfoPage.contactExtraTripleMenu, 5);

        List<WebElement> elements = contactModulePage.contactList;

        for (WebElement element : elements) {
            try {
                element.click();
                contactInfoPage.contactExtraTripleMenu.click();
                contactInfoPage.deleteInsideTripleMenu.click();
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // skip if contact is absent on the page
            }
        }
    }
}