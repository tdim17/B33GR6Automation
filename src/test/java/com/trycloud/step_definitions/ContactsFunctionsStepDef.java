package com.trycloud.step_definitions;

import com.trycloud.pages.ContactInfoPage;
import com.trycloud.pages.ContactModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactsFunctionsStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    ContactModulePage contactModulePage = new ContactModulePage();
    ContactInfoPage contactInfoPage = new ContactInfoPage();
    LoginPage loginPage = new LoginPage();

    String fullNameEx = "Cydeo Student1";


    @Given("User is on the Contact Module page")
    public void userIsOnTheContactModulePage() {
        dashboardPage.contactsFolder.click();
    }

    @When("User clicks New Contact button")
    public void userClicksNewContactButton() {
        contactModulePage.createNewContact.click();
    }



    @And("User enters full name by clicking New Contact profile Header")
    public void userEntersFullNameByClickingNewContactProfileHeader() {


        contactInfoPage.fullNameInbox.click();
        contactInfoPage.fullNameInbox.sendKeys(fullNameEx + Keys.ENTER);

    }

    @Then("User should see new contact entered on the name box")
    public void User_should_see_new_contact_entered_on_the_name_box() {

        Assert.assertTrue(fullNameEx, contactInfoPage.fullNameInbox.isDisplayed());
    }

    @And("User closes current driver")
    public void userClosesCurrentDriver() {
        Driver.closeDriver();
    }

    @When("User is on contact page")
    public void userIsOnContactPage() {
        dashboardPage.contactsFolder.click();
    }
    @Then("User should see all list of contacts in middle column")
    public void userShouldSeeAllListOfContactsInMiddleColumn() {
        int contactList = contactInfoPage.contactNameList.size();
        Assert.assertTrue(contactList>0);
    }

    @And("User should see total numbers of contacts near Contact tab")
    public void userShouldSeeTotalNumbersOfContactsNearTab(){
        int contactCount = Integer.parseInt(contactInfoPage.contactCount.getText());
        Assert.assertTrue(contactCount > 0);
    }

    @When("User clicks a contact from the list on middle column")
    public void userClicksAContactFromTheListOnMiddleColumn() {
    }

    @And("User clicks profile photo icon near Contact Name on the right column")
    public void userClicksProfilePhotoIconNearContactNameOnTheRightColumn() {
    }

    @And("User selects {string} from the dropdown")
    public void userSelectsFromTheDropdown(String arg0) {
    }

    @And("User selects a desired jpeg file")
    public void userSelectsADesiredJpegFile() {
    }

    @And("User clicks {string} on bottom right in the frame")
    public void userClicksOnBottomRightInTheFrame(String arg0) {
    }

    @Then("User should see chosen photo on the proper profile")
    public void userShouldSeeChosenPhotoOnTheProperProfile() {
    }

    @And("User clicks {string} on the top right from profile column")
    public void userClicksOnTheTopRightFromProfileColumn(String arg0) {
    }

    @And("User selects {string} button from the dropdown")
    public void userSelectsButtonFromTheDropdown(String arg0) {
    }

    @Then("User should no longer see that contact anywhere on the page")
    public void userShouldNoLongerSeeThatContactAnywhereOnThePage() {
    }



}
