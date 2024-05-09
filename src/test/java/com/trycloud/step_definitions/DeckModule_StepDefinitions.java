package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DeckModule_StepDefinitions {
    DeckPage deckPage = new DeckPage();
    DashboardPage dashboardPage = new DashboardPage();
    String boardName = ConfigurationReader.getProperty("boardName");


    @Given("user is on the Deck page")
    public void user_is_on_the_deck_page() {
        dashboardPage.deckFolder.click();
        BrowserUtils.verifyTitle("Deck - Trycloud");
    }
    @When("user clicks on Add board button of the All boards side menu")
    public void user_clicks_on_add_board_button_of_the_all_boards_side_menu() {
        if(!deckPage.addBoardButton.isDisplayed()){
            deckPage.sideMenuButton.click();
        }
        deckPage.addBoardButton.click();
    }
    @When("user write the {string} name and send it")
    public void user_write_the_name_and_send_it(String boardName) {
        deckPage.boardNameInputBox.sendKeys(boardName);
        deckPage.boardNameSubmitButton.click();
    }
    @Then("user should see that just created {string} is located at All boards side menu")
    public void user_should_see_that_just_created_is_located_at_all_boards_side_menu(String boardName) {
        for (WebElement boardListName : deckPage.boardListNames) {
            if (boardListName.getText().equals(boardName)) {
                Assert.assertTrue(boardListName.isDisplayed());
            }
        }
    }



}
