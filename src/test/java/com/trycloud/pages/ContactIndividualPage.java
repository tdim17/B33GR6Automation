package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactIndividualPage {

    public ContactIndividualPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id="contact-fullname")
            public WebElement fullNameInbox;


    @FindBy (xpath = "(//div[@class='multiselect__content-wrapper'])[6]//div")
    public List<WebElement> groupsList;

    @FindBy (xpath = "//div[@id='app-navigation-vue']//span[@class='app-navigation-entry__title']")
    public List<WebElement> groupsListPanel;


}
