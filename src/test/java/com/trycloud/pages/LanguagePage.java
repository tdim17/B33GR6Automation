package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguagePage {

    public LanguagePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='languageinput']")
    public WebElement languageLabel;

    @FindBy(id = "languageinput")
    public WebElement languageDropdown;
}
