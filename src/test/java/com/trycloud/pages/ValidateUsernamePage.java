package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateUsernamePage {

    public ValidateUsernamePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@height='32']")
    public WebElement profileButton;

    @FindBy(xpath = "(//a[@href='/index.php/settings/user'])[1]")
    public WebElement settingsButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameUnderProfileButton;

    @FindBy(id = "displayname")
    public WebElement textBoxUnderFullName;




}
