package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeckPage {

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//div[@class=\'avatardiv avatardiv-shown\']//img")
public WebElement userAvatar;

@FindBy (xpath = "//a[@class='app-navigation-toggle']")
public WebElement sideMenuButton;

@FindBy (xpath = "//span[@title='Add board']")
public WebElement addBoardButton;

@FindBy (xpath = "//input[@placeholder='Board name']")
public WebElement boardNameInputBox;

@FindBy(xpath = "//div//input[@type='submit']")
    public WebElement boardNameSubmitButton;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']//li")
    public List<WebElement> boardListNames;

    //For Assertion

    @FindBy(xpath = "//div[@class=\'board-title\']//h2")
    public WebElement activeBoardHeader;

@FindBy(id = "stack-add")
    public WebElement addListBarButton;

@FindBy(xpath = "//div[@id='stack-add']//input[@type='submit']")
    public WebElement listNameSubmitButton;

@FindBy(id="new-stack-input-main")
    public WebElement listNameInputBox;

//@FindBy(xpath = "//div[@class='board']//h3[@class='stack__title has-tooltip']")
@FindBy(xpath = "//div[@class='stack__header']//h3")
    public WebElement listHeader;

@FindBy(xpath = "//div[@class='stack__header']//button[@rel='noreferrer noopener']")
    public WebElement addCardButton;

@FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInputBox;

@FindBy(xpath = "//div[@class='stack__card-add']//input[@type='submit']")
    public WebElement addNewCardButton;

@FindBy(xpath = "//div[@class='card-upper']//span")
    public WebElement headerOfCard;

@FindBy(id = "app-sidebar-vue")
    public WebElement cardSideBar;

@FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement sideBarCardHeader;

@FindBy(xpath = "//div[@class='card-controls compact-item']//div[@class='action-item']")
    public WebElement cardControlsButton;

@FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignToMeButton;

@FindBy(xpath = "//div[@class='avatardiv popovermenu-wrapper has-tooltip']")
    public WebElement userAvatarOnCard;
//need to assert src attribute









}