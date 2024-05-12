package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateEmailAddressPage {

    public ValidateEmailAddressPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "email")
    public WebElement emailInputBox;


}
