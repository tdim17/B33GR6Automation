package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//li[@data-id='files']")
    public WebElement fileFolder;

    @FindBy (xpath="//li[@data-id='photos']")
    public WebElement photosFolder;

    @FindBy (xpath="//li[@data-id='activity']")
    public WebElement activityFolder;

    @FindBy (xpath="//li[@data-id='spreed']")
    public WebElement talkFolder;

    @FindBy (xpath="//li[@data-id='contacts']")
    public WebElement contactsFolder;

    @FindBy (xpath="//li[@data-id='circles']")
    public WebElement circlesFolder;

    @FindBy (xpath="//li[@data-id='calendar']")
    public WebElement calendarFolder;

    @FindBy (xpath="//li[@data-id='deck']")
    public WebElement deckFolder;

    @FindBy(id = "expand")
    public WebElement settingMenuBtn;


    @FindBy(xpath = "//a[@class='header-menu__trigger']")
    public WebElement searchHeader;

//    @FindBy(css = ".unified-search__input-wrapper>form.unified-search__form")
    @FindBy(xpath = "//input[@class=\"unified-search__form-input\"]")
    public WebElement searchForm;

    @FindBy(css = "span.unified-search__result-content")
    public WebElement searchResult;

}
