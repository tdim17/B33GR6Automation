package com.trycloud.step_definitions;

import com.trycloud.pages.ValidateEmailAddressPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EmailAddress_StepDefinitions {

    ValidateEmailAddressPage validateEmailAddressPage = new ValidateEmailAddressPage();

    @When("user enters valid email on email input box")
    public void user_enters_valid_email_on_email_input_box() {
        validateEmailAddressPage.emailInputBox.clear();
        validateEmailAddressPage.emailInputBox.sendKeys("ayjamal@gmail.com");

    }

    @Then("systems should accepts the change")
    public void systems_should_accepts_the_change() {

        Assert.assertEquals("ayjamal@gmail.com", validateEmailAddressPage.emailInputBox.getText());

    }

    @When("user enters email address without .com into email input box")
    public void user_enters_email_address_without_com_into_email_input_box() {

        validateEmailAddressPage.emailInputBox.clear();
        validateEmailAddressPage.emailInputBox.sendKeys("ayjamal@gmail");

    }

    @When("system should give an error or warning message")
    public void system_should_give_an_error_or_warning_message() {

        System.out.println("Entered wrong email format");

    }
}
