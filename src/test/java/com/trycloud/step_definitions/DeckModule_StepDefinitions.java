package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DeckModule_StepDefinitions {
    DeckPage deckPage = new DeckPage();
    DashboardPage dashboardPage = new DashboardPage();
//    String boardName;
//    String listName;
    String randomBoardName;


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
    @When("user write the {string} name on the board name input field and send it")
    public void user_write_the_name_on_the_board_name_input_field_and_send_it(String boardName) {
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


    @When("user pick a random board from the All boards list")
    public void userPickARandomBoardFromTheAllBoardsList() {
        if(!deckPage.addBoardButton.isDisplayed()){
            deckPage.sideMenuButton.click();
        }
        WebElement randomBoard = deckPage.randomBoardPick(deckPage.boardListNames);
       randomBoardName = randomBoard.getText();
       randomBoard.click();
    }

    @When("click on Add list button")
    public void click_on_add_list_button() {
        deckPage.addListBarButton.click();
    }

    @When("write the {string} name on the new list input field and send it")
    public void write_the_name_on_the_new_list_input_field_and_send_it(String listName) {
        deckPage.listNameInputBox.sendKeys(listName);
        deckPage.listNameSubmitButton.click();
    }
    @Then("user should see just created {string} on picked before random board page")
    public void userShouldSeeJustCreatedOnPickedBeforeRandomBoardPage(String listName) {
        Assert.assertEquals(deckPage.activeBoardHeader.getText(),randomBoardName);
        for (WebElement listHeader : deckPage.listHeaders) {
            if (listHeader.getText().equals(listName)) {
                Assert.assertTrue(listHeader.isDisplayed());
            }

        }

    }
    @And("user pick any list on the current board and click on Add card button")
    public void userPickAnyListOnTheCurrentBoardAndClickOnAddCardButton() {
        WebElement randomButton = deckPage.randomAddCardButton(deckPage.addCardButtons);
        randomButton.click();
    }

    @When("write the name of the {string} on the card name input field and send it")
    public void write_the_name_of_the_on_the_card_name_input_field_and_send_it(String newCardName) {
        deckPage.cardNameInputBox.sendKeys(newCardName);
        deckPage.addNewCardButton.click();

    }
    @Then("user should see just created {string} and a new card interface on the side menu")
    public void user_should_see_just_created_and_a_new_card_interface_on_the_side_menu(String newCardName) {
        Assert.assertTrue(deckPage.cardSideBar.isDisplayed());
        for (WebElement listHeader : deckPage.listHeaders) {
            if(listHeader.getText().equals(newCardName)){
                Assert.assertTrue(listHeader.getText().equals(deckPage.sideBarCardHeader.getText()));
            }
        }


    }


}
