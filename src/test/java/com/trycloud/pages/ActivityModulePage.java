package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityModulePage {

    public ActivityModulePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li")
    public List<WebElement> activityunderlist;



    @FindBy(linkText = "By you")
    public WebElement byYou;

    @FindBy(linkText = "By others")
    public WebElement byOthers;

    @FindBy(linkText = "Circles")
    public WebElement circles;

    @FindBy(linkText = "Favorites")
    public WebElement favourites;

    @FindBy(linkText = "File changes")
    public WebElement fileChanges;

    @FindBy(linkText = "File shares")
    public WebElement fileShares;

    @FindBy(linkText = "Calendar")
    public WebElement calender;

    @FindBy(linkText = "Todos")
    public WebElement todos;

    @FindBy(linkText = "Comments")
    public WebElement comments;

    @FindBy(linkText = "Deck")
    public WebElement deck;

    @FindBy(xpath = "//div[@id='no_more_activities']")
    public WebElement noMoreEventsToLoad;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 8:41 PM']")
    public WebElement firsttime;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 8:40 PM']")
    public WebElement secondtime;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 8:35 PM']")
    public WebElement thirdtime;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 7:46 PM']")
    public WebElement fourthtime;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 7:42 PM']")
    public WebElement fifthtime;

    @FindBy(xpath = "//span[@data-original-title='July 13, 2023 7:42 PM']")
    public WebElement sixthtime;

}
