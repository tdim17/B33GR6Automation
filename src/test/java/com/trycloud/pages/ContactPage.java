package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy (xpath=" //span[@title='+ New group']")
//    public WebElement addNewGroup1;

    @FindBy (xpath=" //button[@aria-label='Actions']")
    public WebElement addNewGroup2;

    @FindBy (xpath=" //div[@class='popover__inner']//input[2]")
    public WebElement inputNewGroupName;



}
