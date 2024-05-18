package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderViewPage {
    public FolderViewPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement FileMojo;

    @FindBy(xpath = "//a[text()='All files']")
    public WebElement allFiles;



    @FindBy(xpath = "(//span[text()='Name'])[1]")
    public WebElement nameButton;

    @FindBy(xpath = "(//tbody[@id='fileList'])/tr")
    public List<WebElement> fileListMenu;

    @FindBy(xpath = "//td[@class='filesize']")
    public List<WebElement> sizeList;

    @FindBy(xpath = "//td[@class='date']//span[@class='modified live-relative-timestamp']")
    public List<WebElement> modifiedList;


    @FindBy(xpath = "//*[@id=\"headerSize\"]/a/span[2]")
    public WebElement arrayUp;
    @FindBy (xpath ="//*[@id=\"headerSize\"]/a/span[2]" )
    public  WebElement arrayDown;


    @FindBy(xpath = "(//a[@class='size sort columntitle'])[1]")
    public WebElement sizeButton;

    @FindBy (xpath = "(//a[@id='modified'])[1]")
    public WebElement modifiedButton;


    @FindBy(xpath = "(//th[@id='headerSelection'])[1]")
    public WebElement selectAllFiles;

    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> allBoxes;

    @FindBy(xpath = "(//a[@data-sort='name']//span)[1]")
    public WebElement totalValue;




}








