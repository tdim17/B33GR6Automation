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
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactsFunctionsStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    ContactModulePage contactModulePage = new ContactModulePage();
    ContactInfoPage contactInfoPage = new ContactInfoPage();
    LoginPage loginPage = new LoginPage();

    String fullNameEx = "Cydeo Student1";



    //SCENARIO 01
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

    //SCENARIO 02
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

    //SCENARIO 03

    @When("User clicks profile photo icon near Contact Name on the right column")
    public void userClicksProfilePhotoIconNearContactNameOnTheRightColumn() {
        contactInfoPage.profilePhotoIcon.click();
    }

    @And("User selects ChooseFromFiles from the dropdown")
    public void User_selects_ChooseFromFiles_from_the_dropdown() {
        BrowserUtils.waitFor(5);

    contactInfoPage.profileChooseFromFiles.click();


    }

    @And("User selects a desired jpeg file")
    public void userSelectsADesiredJpegFile() {
        contactInfoPage.savedProfilePic01.click();
    }

    @And("User clicks Choose button on bottom right in the frame")
    public void User_clicks_Choose_button_on_bottom_right_in_the_frame(){
        contactInfoPage.confirmProfilePicBttn.click();
    }

    @Then("User should see chosen photo on the profile photo")
    public void User_should_see_chosen_photo_on_the_profile_photo() {
        contactInfoPage.profilePhotoIcon.click();

        Assert.assertTrue(contactInfoPage.deleteProfilePicBttn.isDisplayed());
    }

    //SCENARIO 04
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
