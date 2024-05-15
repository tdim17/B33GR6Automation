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

    @FindBy (xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement profilePhotoIcon;

        @FindBy (xpath = "//*[text()='Choose from Files']")
        public WebElement profileChooseFromFiles;

        @FindBy (xpath = "//*[text()='Delete picture']")
        public WebElement deleteProfilePicBttn;

        @FindBy (xpath = "//*[@id='picker-filestable']//tbody//tr[3]")
        public WebElement savedProfilePic01;

        @FindBy (xpath = "//*[text()='Choose']")
        public WebElement confirmProfilePicBttn;

    @FindBy (xpath = "//div[@id='app-navigation-vue']//span[@class='app-navigation-entry__title']")
    public List<WebElement> groupsListPanel;

    @FindBy (xpath = "(//div[@class='multiselect__tags-wrap'])[8]")
    public WebElement addNewProperty;



}
