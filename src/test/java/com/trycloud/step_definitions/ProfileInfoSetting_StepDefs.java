package com.trycloud.step_definitions;

import com.trycloud.pages.ProfileInfoSettingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileInfoSetting_StepDefs {
    ProfileInfoSettingPage profileInfoSetPage = new ProfileInfoSettingPage();


    //US-13 B33G6-TC133
    @When("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        System.out.println("User on the dashboard");
    }
    //US-13 B33G6-TC133
    @Then("user click on setting menu")
    public void user_click_on_setting_menu() {
        profileInfoSetPage.settingMenuBtn.click();
    }
    //US-13 B33G6-TC133
    @Then("user chose Setting from list")
    public void user_click_on_setting_button_from_list() {
        profileInfoSetPage.settings.click();
    }
    //US-13 B33G6-TC133
    @Then("user should see Personal Info")
    public void user_should_see_personal_info() {
        System.out.println("Username is displayed - " + profileInfoSetPage.displayName.isDisplayed());
        System.out.println("Email is displayed- " + profileInfoSetPage.emailAddress.isDisplayed());
        System.out.println("Phone number is displayed- " + profileInfoSetPage.phoneNumber.isDisplayed());

    }
    //US-13 B33G6-TC134
    @Then("user name should be the same with Full Name input box")
    public void userNameShouldBeTheSameWithFullNameInputBox() {
        String nameInFullNameBox = profileInfoSetPage.displayName.getText();
        String nameOnSetMenu = profileInfoSetPage.usernameOnSettingMenu.getText();

        Assert.assertEquals("Username doesn`t match", nameInFullNameBox, nameOnSetMenu);
    }

    //US-13 B33G6-TC135
    @Then("user cannot pass any characters except numbers into the Phone Number input box")
    public void userCannotPassAnyCharactersExceptNumbersIntoTheInputBox() {
        if(profileInfoSetPage.phoneNumber.getText().matches("[\\d+-]+")){
            System.out.println("Phone number is valid");
        }else {
            System.out.println("Phone number must contain only numbers");
        }
    }
}
