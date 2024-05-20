package com.trycloud.step_definitions;

import com.trycloud.pages.LanguagePage;
import com.trycloud.pages.ValidateEmailAddressPage;
import com.trycloud.pages.ValidateUsernamePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Username_Email_LanguageValidation_StepDefinitions {

    ValidateUsernamePage validateUsernamePage = new ValidateUsernamePage();


    @When("user first clicks on profile button")
    public void user_first_clicks_on_profile_button() {

        validateUsernamePage.profileButton.click();

    }

    @And("user clicks settings button")
    public void user_clicks_settings_button() {
        validateUsernamePage.settingsButton.click();

    }

    @Then("user name displayed under profile should match text box value under full name")
    public void user_name_displayed_under_profile_should_match_text_box_value_under_full_name() {

        Assert.assertEquals(validateUsernamePage.usernameUnderProfileButton.getText(),
                validateUsernamePage.textBoxUnderFullName.getText());


    }

    @When("user is on the settings page")
    public void userIsOnTheSettingsPage() {

        validateUsernamePage.profileButton.click();
        validateUsernamePage.settingsButton.click();
    }


    @When("changes the value under full name")
    public void changes_the_value_under_full_name() {

        validateUsernamePage.textBoxUnderFullName.clear();
        validateUsernamePage.textBoxUnderFullName.sendKeys("Elon musk");


    }

    @When("refresh the page")
    public void refresh_the_page() {

        validateUsernamePage.profileButton.click();
        validateUsernamePage.settingsButton.click();


    }

    @Then("user should see that new changed value should match with name under profile")
    public void user_should_see_that_new_changed_value_should_match_with_name_under_profile() {

        Assert.assertEquals(validateUsernamePage.usernameUnderProfileButton.getText(),
                validateUsernamePage.textBoxUnderFullName.getText());


    }


    @When("changes the value under full name to specials characters or integer")
    public void changes_the_value_under_full_name_to_specials_characters_or_integer() {

        validateUsernamePage.textBoxUnderFullName.clear();
        validateUsernamePage.textBoxUnderFullName.sendKeys("!@#$%");


    }


    @Then("system should not allow this change,should throw an warning message")
    public void systemShouldNotAllowThisChangeShouldThrowAnWarningMessage() {

        if (validateUsernamePage.textBoxUnderFullName.getText().matches(".*[^a-zA-Z\\s].*")
                || validateUsernamePage.textBoxUnderFullName.getText().matches(".*\\d.*")) {
            System.out.println("Full name cannot contain special characters or integers");
        }


    }

    ValidateEmailAddressPage validateEmailAddressPage = new ValidateEmailAddressPage();

    @When("user enters valid email on email input box")
    public void user_enters_valid_email_on_email_input_box() {
        validateEmailAddressPage.emailInputBox.clear();
        validateEmailAddressPage.emailInputBox.sendKeys("ayjamal@gmail.com");

    }

    @Then("systems should accepts the change")
    public void systems_should_accepts_the_change() {

        String actualEmail = validateEmailAddressPage.emailInputBox.getAttribute("value");

        System.out.println(actualEmail);

        Assert.assertEquals("ayjamal@gmail.com", actualEmail);

    }

    LanguagePage languagePage = new LanguagePage();
    Select select = new Select(languagePage.languageDropdown);

    @When("selects the value from the language dropdown")
    public void selects_the_value_from_the_language_dropdown() {

        select.selectByValue("tr");
    }

    @Then("get the text of the language label on the settings page")
    public void get_the_text_of_the_language_label_on_the_settings_page() {

        languagePage.languageLabel.getText();
    }

    @Then("actual String value of the language label and expected String value of the language label should be same")
    public void actual_string_value_of_the_language_label_and_expected_string_value_of_the_language_label_should_be_same() {

        String expectedValue = "Dil";

        Assert.assertEquals(languagePage.languageLabel.getText(), "Dil");
    }


}
