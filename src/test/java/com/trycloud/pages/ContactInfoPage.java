package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactInfoPage {

    public ContactInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='contact-fullname']")
    public WebElement fullNameInbox;

    @FindBy(xpath = "(//div[@class='multiselect__content-wrapper'])[6]//div")
    public List<WebElement> groupsList;

    @FindBy(xpath = "//div[@id='app-navigation-vue']//span[@class='app-navigation-entry__title']")
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

    @FindBy(xpath = "(//input[@autocomplete='nope'])[6]")
    public WebElement addNewProperty;


    @FindBy (xpath="//div[@class='multiselect property__value multiselect--above multiselect--single']//li[@class='multiselect__element']")
    public WebElement propertiesList;

    @FindBy(xpath = "//li[@class='multiselect__element']//div[@title='Anniversary']")
    public WebElement addPropertyAnniversary;

    // This method for Property options. It receives the Sting title of property as an argument and returns the parameterized locators:
    public WebElement propertySet(String title) {
        return Driver.getDriver().findElement(By.xpath("//li[@class='multiselect__element']//div[@title='" + title + "']"));
    }

    @FindBy (xpath = "//*[@class='property__value property__title--right']")
    public List <WebElement> listOfAllPropertiesFromPage;


    @FindBy(xpath = "//input[@class='mx-input']")
    public WebElement inputEventCalendar;

    @FindBy(xpath = "//span[@class='mx-calendar-header-label']//button[@type='button'][2]")
    public WebElement calendarYearButton;

    @FindBy(xpath = "//button[@class='mx-btn mx-datepicker-btn-confirm']")
    public WebElement calendarClickButton;

    @FindBy(xpath = "//div[@class='action-item header-menu']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement contactExtraTripleMenu;


    @FindBy(xpath = "//div[@class='popover__inner']//span[@class='action-button__icon icon-delete']")
    public WebElement deleteInsideTripleMenu;

    @FindBy (xpath = "//div[@class='empty-content']")
    public WebElement contactDeleteNoteProof;


    @FindBy(xpath = "//span[@class='mx-calendar-header-label']//button[@type='button'][1]")
    public WebElement calendarMonthButton;

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']//button[3]")
    public WebElement calendarButtonDoubleRight;   // button "year >>"

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']//button[1]")
    public WebElement calendarButtonDoubleLeft;   // button "year <<"

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']//button[2]")
    public WebElement calendarButtonLeft;   // button "month <<"

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']//button[2]")
    public WebElement calendarButtonRight;   // button "month >>"


    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']/div")
    public WebElement choseContact;


    // These methods work with the calendar options. They receive the year, month, day parameters as an argument and return the corresponding locators:
    public WebElement yearSet(int yearNumber) {
        return Driver.getDriver().findElement(By.xpath("//table[@class='mx-table mx-table-year']//td[@data-year='" + yearNumber + "']"));
    }
    public WebElement monthSet(int monthNumber) {
        return Driver.getDriver().findElement(By.xpath("//table[@class='mx-table mx-table-month']//td[@data-month='" + (monthNumber - 1) + "']"));
    }
    public WebElement daySet(int dayNumber) {
        return Driver.getDriver().findElement(By.xpath("//table[@class='mx-table mx-table-date']//td[.='" + dayNumber + "']"));
    }


    // This method converts a numeric (int) value of Month to a String representation:
    public String convertMonthToString(int monthNumber) {
        String monthString;
        switch (monthNumber) {
            case 1 -> monthString = "Jan";
            case 2 -> monthString = "Feb";
            case 3 -> monthString = "Mar";
            case 4 -> monthString = "Apr";
            case 5 -> monthString = "May";
            case 6 -> monthString = "Jun";
            case 7 -> monthString = "Jul";
            case 8 -> monthString = "Aug";
            case 9 -> monthString = "Sep";
            case 10 -> monthString = "Oct";
            case 11 -> monthString = "Nov";
            case 12 -> monthString = "Dec";
            default -> monthString = "Invalid Month Name";
        }
        return monthString;
    }

}
