package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.ProfileInfoSettingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ProfileInfoSetting_StepDefs {
        ProfileInfoSettingPage profileInfoSetPage = new ProfileInfoSettingPage();
        //DashboardPage dashboardPage = new DashboardPage();

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
        System.out.println("Username is displayed - " + profileInfoSetPage.displayName.isDisplayed());
        System.out.println("Email is displayed- " + profileInfoSetPage.emailAddress.isDisplayed());
        System.out.println("Phone number is displayed- " + profileInfoSetPage.phoneNumber.isDisplayed());

    }

    @Then("user name should be the same with Full Name input box")
    public void userNameShouldBeTheSameWithFullNameInputBox() {
        Assert.assertEquals("Username doesn`t match",profileInfoSetPage.usernameInFullName, profileInfoSetPage.usernameOnSettingMenu);
    }


    @Then("user cannot pass any characters except numbers into the Phone Number input box")
    public void userCannotPassAnyCharactersExceptNumbersIntoTheInputBox() {

    }
}
