package com.trycloud.step_definitions;

import com.trycloud.pages.ContactInfoPage;
import com.trycloud.pages.ContactModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ContactsFunctionsStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    ContactModulePage contactModulePage = new ContactModulePage();
    ContactInfoPage contactInfoPage = new ContactInfoPage();
    LoginPage loginPage = new LoginPage();

    String newContactEx = "Example Name";


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
        contactInfoPage.fullNameInbox.sendKeys(newContactEx + Keys.ENTER);
    }

    @Then("User should see newly created newContactEx under Contact Module dropdown")
    public void userShouldSeeNewlyCreatedContactUnderContactModuleDropdown() {

        newContactEx.equalsIgnoreCase("Syed");
        Assert.assertEquals(contactInfoPage.fullNameInbox.getText(), "Syed");

    }






    @Then("User should see all list of contacts in middle column")
    public void userShouldSeeAllListOfContactsInMiddleColumn() {
    }

    @And("User should see total numbers of contacts near {string} tab")
    public void userShouldSeeTotalNumbersOfContactsNearTab(String arg0) {
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
