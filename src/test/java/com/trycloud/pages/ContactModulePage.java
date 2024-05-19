package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactModulePage {

    public ContactModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // This locator for text "+ New group"
    @FindBy (xpath=" //span[@title='+ New group']")
    public WebElement createNewGroup;
    // This locator for sign "+"
    @FindBy (xpath=" //button[@class='icon action-item__menutoggle icon-add']")
    public WebElement createNewGroup1;


    @FindBy (xpath=" //div[@class='popover__inner']//input[2]")
    public WebElement inputNewGroupName;

    @FindBy (id="new-contact-button")
    public WebElement createNewContact;

    @FindBy (xpath="//div[@class='vue-recycle-scroller__item-view']")
    public List<WebElement> contactList;

    @FindBy (xpath="//ul[@class='app-navigation__list']//span[@class='app-navigation-entry__title']")
    public List<WebElement> groupList;

}
