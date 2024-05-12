package com.trycloud.step_definitions;

import com.trycloud.pages.LanguagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Language_StepDefinitions {

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

        Assert.assertEquals(languagePage.languageLabel.getText(),"Dil");
    }







}
