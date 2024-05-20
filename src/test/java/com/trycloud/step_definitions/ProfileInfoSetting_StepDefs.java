package com.trycloud.step_definitions;

import com.trycloud.pages.ProfileInfoSettingPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileInfoSetting_StepDefs {
    ProfileInfoSettingPage profileInfoSetPage = new ProfileInfoSettingPage();

    @When("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        System.out.println("User on the dashboard");
    }
    @Then("user click on setting menu")
    public void user_click_on_setting_menu() {
        profileInfoSetPage.settingMenuBtn.click();
    }
    @Then("user chose Setting from list")
    public void user_click_on_setting_button_from_list() {
        profileInfoSetPage.settings.click();
    }
    @Then("user should see Personal Info")
    public void user_should_see_personal_info() {
        Assert.assertTrue(profileInfoSetPage.displayName.isDisplayed());
        Assert.assertTrue(profileInfoSetPage.emailAddress.isDisplayed());
        Assert.assertTrue(profileInfoSetPage.phoneNumber.isDisplayed());

    }

    @Then("user name should be the same with Full Name input box")
    public void userNameShouldBeTheSameWithFullNameInputBox() {

        String nameInFullNameBox = profileInfoSetPage.displayName.getText();
        profileInfoSetPage.settingMenuBtn.click();

        BrowserUtils.waitForVisibility(profileInfoSetPage.usernameOnSettingMenu, 5);
        String nameOnSetMenu = profileInfoSetPage.usernameOnSettingMenu.getText();
        System.out.println("nameInFullNameBox = " + nameInFullNameBox);
        System.out.println("nameOnSetMenu = " + nameOnSetMenu);

        Assert.assertEquals("Username doesn`t match", nameInFullNameBox, nameOnSetMenu);
         }


    @Then("user cannot pass any characters except numbers into the Phone Number input box")
    public void userCannotPassAnyCharactersExceptNumbersIntoTheInputBox() {
        if(profileInfoSetPage.phoneNumber.getText().matches("[\\d+-]+")){
            System.out.println("Phone number is valid");
        }else {
            System.out.println("Phone number must contain only numbers");
        }

    }
}
