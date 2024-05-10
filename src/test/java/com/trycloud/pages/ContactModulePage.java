package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactModulePage {

    public ContactModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy (xpath=" //span[@title='+ New group']")
//    public WebElement createNewGroup1;

    @FindBy (xpath=" //button[@class='icon action-item__menutoggle icon-add']")
    public WebElement createNewGroup1;

    @FindBy (xpath=" //div[@class='popover__inner']//input[2]")
    public WebElement inputNewGroupName;

    @FindBy (id="new-contact-button")
    public WebElement createNewContact;




}
