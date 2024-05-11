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

    @FindBy (xpath = "//div[@id='app-navigation-vue']//span[@class='app-navigation-entry__title']")
    public List<WebElement> groupsListPanel;

    @FindBy (xpath = "(//input[@autocomplete='nope'])[6]")
    public WebElement addNewProperty;

    @FindBy (xpath="//li[@class='multiselect__element']//div[@title='Anniversary']")
    public WebElement addPropertyAnniversary;

    @FindBy (xpath="//input[@class='mx-input']")
    public WebElement inputBoxAnniversary;




    @FindBy (xpath="//span[@class='mx-calendar-header-label']//button[@type='button'][2]")
    public WebElement calendarYearButton;

    @FindBy (xpath="//span[@class='mx-calendar-header-label']//button[@type='button'][1]")
    public WebElement calendarMonthButton;

    @FindBy (xpath="//table[@class='mx-table mx-table-year']//td[@data-year='2029']")
    public WebElement calendarYear2029Chose;

    @FindBy (xpath="//table[@class='mx-table mx-table-month']//td[@data-month='6']")
    public WebElement calendarMonthJulyChose;

    @FindBy (xpath="//table[@class='mx-table mx-table-date']//td[.='20']")
    public WebElement calendarDay20Chose;



    @FindBy (xpath="//div[@class='mx-calendar mx-calendar-panel-date']//button[3]")
    public WebElement calendarButtonDoubleRight;   // button "year >>"

    @FindBy (xpath="//div[@class='mx-calendar mx-calendar-panel-date']//button[1]")
    public WebElement calendarButtonDoubleLeft;   // button "year <<"

    @FindBy (xpath="//div[@class='mx-calendar mx-calendar-panel-date']//button[2]")
    public WebElement calendarButtonLeft;   // button "month <<"

    @FindBy (xpath="//div[@class='mx-calendar mx-calendar-panel-date']//button[2]")
    public WebElement calendarButtonRight;   // button "month >>"


    @FindBy (xpath="//button[@class='mx-btn mx-datepicker-btn-confirm']")
    public WebElement clickButton;















}
