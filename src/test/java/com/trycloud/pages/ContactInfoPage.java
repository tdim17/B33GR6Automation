package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactInfoPage {

    public ContactInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id="contact-fullname")
            public WebElement fullNameInbox;


    @FindBy (xpath = "(//div[@class='multiselect__content-wrapper'])[6]//div")
    public List<WebElement> groupsList;

    @FindBy (xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
    public List<WebElement> contactNameList;

    @FindBy (xpath = "(//div[@class='app-navigation-entry__counter'])")
    public WebElement contactCount;

    @FindBy (xpath = "//div[@id='app-navigation-vue']//span[@class='app-navigation-entry__title']")
    public List<WebElement> groupsListPanel;

    @FindBy (xpath = "(//div[@class='multiselect__tags-wrap'])[8]")
    public WebElement addNewProperty;



}
