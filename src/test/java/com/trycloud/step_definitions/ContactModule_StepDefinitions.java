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

    List<String> addedElements;


    @Given("user is on Dashboard page")
    public void user_is_on_dashboard_page() {
        System.out.println(("user is already on the Dashboard page"));  // just a notification
    }

    @Then("user click Contact page")
    public void user_click_contact_page() {

        BrowserUtils.waitForVisibility(dashboardPage.contactsFolder, 5);
        dashboardPage.contactsFolder.click();
    }


    @Then("user can create {int} new group")
    public void userCanCreateANewGroup(int numberOfGroups) {
        String preffix;

        addedElements = new ArrayList<>();
        for (int i = 1; i <= numberOfGroups; i++) {
            contactModulePage.createNewGroup1.click();
            BrowserUtils.waitForVisibility(contactModulePage.inputNewGroupName, 5);

            switch (i) {
                case 1 -> preffix = "A";
                case 2 -> preffix = "B";
                case 3 -> preffix = "C";
                case 4 -> preffix = "D";
                // default -> preffix = String.valueOf(i);
                default -> preffix = "default " + i;
            }
            String groupName = "Group " + preffix;
            contactModulePage.inputNewGroupName.sendKeys("Group " + preffix + Keys.ENTER);
            addedElements.add(groupName);
        }

    }


    @And("verify if the group created")
    public void verifyIfTheGroupCreated() {

        // getting this list from ContactModulePage:
        List<String> listGroups = new ArrayList<>();
        for (WebElement elemLeft : contactModulePage.groupList) {
            listGroups.add(elemLeft.getAttribute("title"));
        }
        System.out.println("Checking the group creation:");
        System.out.println("List from screen : " + listGroups);
        System.out.println("That was added   : " + addedElements);

        Assert.assertTrue(listGroups.containsAll(addedElements));

    }


    @Then("user can create {int} new contact")
    public void userCanCreateANewContact(int numberOfContacts) {
        for (int i = 1; i <= numberOfContacts; i++) {
            contactModulePage.createNewContact.click();
            BrowserUtils.waitForVisibility(contactInfoPage.fullNameInbox, 5);
            contactInfoPage.fullNameInbox.clear();
            BrowserUtils.waitForVisibility(contactInfoPage.fullNameInbox, 5);
            contactInfoPage.fullNameInbox.sendKeys("User " + i + Keys.ENTER);
        }
    }


    @And("verify if user can see all groups name through the dropdown menu inside existing contact")
    public void userCanSeeAllGroupsNameThroughTheDropdownMenuInsideExistingContact() {

        // I am getting this list from ContactInfoPage:   
        List<String> listContactInfo = new ArrayList<>();
        for (WebElement element : contactInfoPage.groupsList) {
            listContactInfo.add(element.getAttribute("title"));
        }

        // I am getting this list from ContactModulePage:
        List<String> listContactModule = new ArrayList<>();
        for (WebElement each : contactInfoPage.groupsListPanel) {
            listContactModule.add(each.getText());
        }
        System.out.println("Checking the ability to see all groups from contact list:");
        System.out.println("list from user   : " + listContactInfo);
        System.out.println("list from module : " + listContactModule);
        Assert.assertTrue(listContactModule.containsAll(listContactInfo));

    }

    protected String valueActual;
    protected String valueExpected;

    @Then("user can set date of event {int} {int} {int}")
    public void userCanSetDateOfEvent(int year, int month, int day) {

        contactInfoPage.inputEventCalendar.click();
        BrowserUtils.waitFor(1);

        contactInfoPage.calendarYearButton.click();
        contactInfoPage.yearSet(year).click();
        contactInfoPage.monthSet(month).click();
        contactInfoPage.daySet(day).click();
        contactInfoPage.calendarClickButton.click();
        BrowserUtils.waitFor(2);

        valueActual = contactInfoPage.inputEventCalendar.getAttribute("value");
        System.out.println("valueActual  : " + valueActual);

        String monthString = contactInfoPage.convertMonthToString(month);
        valueExpected = monthString + " " + day + ", " + year;

    }


    @Then("verify if the date is added")
    public void verifyIfTheDateIsAdded() {

        System.out.println("valueExpected: " + valueExpected);
        Assert.assertEquals(valueExpected, valueActual);

    }



    @And("delete all contacts on the page")
    public void deleteAllContactsOnThePage() {

        BrowserUtils.sleep(1);
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

    protected String lastAddedProperty;

    @And("user can add a new property {string} on the contact Info page")
    public void userCanAddANewPropertyOnTheContactInfoPage(String propertyArg) {

        contactInfoPage.addNewProperty.click();
        contactInfoPage.propertySet(propertyArg).click();
        lastAddedProperty = propertyArg;

    }


    @Then("verify if the property is created")
    public void verifyIfThePropertyIsCreated() {

        List <WebElement> allPropertiesList = contactInfoPage.listOfAllPropertiesFromPage;
        String nameOfAllProperties = "";

        boolean isNewPropertyAdded = false;

        for (WebElement element : allPropertiesList) {

            if (element.getAttribute("outerText").equals(lastAddedProperty)){
                nameOfAllProperties = element.getAttribute("outerText");
                isNewPropertyAdded = true;
                break;
            }
        }
        Assert.assertTrue("New Property has not been created!", isNewPropertyAdded);
        System.out.println("Property has been added: " + nameOfAllProperties);
    }

}