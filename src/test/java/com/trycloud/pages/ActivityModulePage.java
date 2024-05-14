package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityModulePage {

    public ActivityModulePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "By you")
    public WebElement byYou;

    @FindBy(linkText = "By others")
    public WebElement byOthers;
}
