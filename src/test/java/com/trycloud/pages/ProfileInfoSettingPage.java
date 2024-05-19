package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoSettingPage {

public ProfileInfoSettingPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

//@B33G6_133
@FindBy(id = "expand")
    public WebElement settingMenuBtn;

//@B33G6_133/4
@FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settings;

//@B33G6_133
@FindBy(id = "displayname")
    public WebElement displayName;

//@B33G6_133
    @FindBy(id = "email")
    public WebElement emailAddress;

    //@B33G6_133/5
    @FindBy(id = "phone")
    public WebElement phoneNumber;

    //@B33G6_134
    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameOnSettingMenu;

    //@B33G6_134
    @FindBy(id = "id=displayname")
    public WebElement usernameInFullName;


}
