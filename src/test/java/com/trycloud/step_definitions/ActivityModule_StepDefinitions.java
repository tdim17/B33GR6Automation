package com.trycloud.step_definitions;

import com.trycloud.pages.ActivityModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityModule_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    ActivityModulePage activityModulePage = new ActivityModulePage();

    @When("User can click on activity module")
    public void userCanClickOnActivityModule() {
        dashboardPage.activityFolder.click();
    }

    @Then("User can display all listed items under the Activity module")
    public void user_can_display_all_listed_items_under_the_activity_module(List<String> expActivity) {

        List<String> actualActivityList = BrowserUtils.getElementsText(activityModulePage.activityunderlist);
        System.out.println("List actual : " + actualActivityList);
        System.out.println("List expect : " + expActivity);

        Assert.assertEquals(expActivity,actualActivityList);

    }




    /*@When("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        System.out.println("User on the dashboard");
    }



    @Then("user click on Activity Module")
    public void user_click_on_activity_module() {
        dashboardPage.activityFolder.click();
    }


    @Then("user should see ByYou folder")
    public void userShouldSeeByYouFolder() {
        Assert.assertTrue(activityModulePage.byYou.isDisplayed());
    }

    @Then("user should see ByOthers folder")
    public void userShouldSeeByOthersFolder() {
        Assert.assertTrue(activityModulePage.byOthers.isDisplayed());
    }

    @Then("user should see Circles folder")
    public void userShouldSeeCirclesFolder() {
        Assert.assertTrue(activityModulePage.circles.isDisplayed());
    }

    @Then("user should see Favorites folder")
    public void userShouldSeeFavoritesFolder() {
        Assert.assertTrue(activityModulePage.favourites.isDisplayed());
    }

    @Then("user should see FileChanges folder")
    public void userShouldSeeFileChangesFolder() {
        Assert.assertTrue(activityModulePage.fileChanges.isDisplayed());
    }

    @Then("user should see FileShares folder")
    public void userShouldSeeFileSharesFolder() {
        Assert.assertTrue(activityModulePage.fileShares.isDisplayed());
    }

    @Then("user should see Calendar folder")
    public void userShouldSeeCalendarFolder() {
        Assert.assertTrue(activityModulePage.calender.isDisplayed());
    }

    @Then("user should see Todos folder")
    public void userShouldSeeTodosFolder() {
        Assert.assertTrue(activityModulePage.todos.isDisplayed());
    }

    @Then("user should see Comments folder")
    public void userShouldSeeCommentsFolder() {
        Assert.assertTrue(activityModulePage.comments.isDisplayed());
    }

    @Then("user should see Deck folder")
    public void userShouldSeeDeckFolder() {
        Assert.assertTrue(activityModulePage.deck.isDisplayed());
    }
}
    
    

    /*@And("user should see {string} at the bottom")
    public void userShouldSeeAtTheBottom(String msg) {
        
        Assert.assertTrue(activityModulePage.noMoreEventsToLoad.isDisplayed());

        System.out.println("activityModulePage.noMoreEventsToLoad.getText() = " + activityModulePage.noMoreEventsToLoad.getText());
    }
}



        System.out.println("By You is displayed - " + activityModulePage.byYou.isDisplayed());
        // activityModulePage.byYou.click();
        System.out.println("By Others is displayed - " + activityModulePage.byOthers.isDisplayed());
        System.out.println("Circles is displayed - " + activityModulePage.circles.isDisplayed());
        System.out.println("Favourites is displayed - " + activityModulePage.favourites.isDisplayed());
        System.out.println("File Changes is displayed - " + activityModulePage.fileChanges.isDisplayed());
        System.out.println("File Shares is displayed - " + activityModulePage.fileShares.isDisplayed());
        System.out.println("Calender is displayed - " + activityModulePage.calender.isDisplayed());
        System.out.println("Todos is displayed - " + activityModulePage.todos.isDisplayed());
        System.out.println("Comments is displayed - " + activityModulePage.comments.isDisplayed());
        System.out.println("Deck is displayed - " + activityModulePage.deck.isDisplayed());

    }




    @And("user should see listed items date modified time")
    public void userShouldSeeListedItemsDateModifiedTime() {

        System.out.println("firsttime is displayed - " + activityModulePage.firsttime.isDisplayed());
        System.out.println("Secondtime is displayed - " + activityModulePage.secondtime.isDisplayed());
        System.out.println("Thirdtime is displayed - " + activityModulePage.thirdtime.isDisplayed());
        System.out.println("Fourthtime is displayed - " + activityModulePage.fourthtime.isDisplayed());
        System.out.println("Fifthtime is displayed - " + activityModulePage.fifthtime.isDisplayed());
        System.out.println("Sixthtime is displayed - " + activityModulePage.sixthtime.isDisplayed());


    }

    @And("user should see no more events to load at the bottom")
    public void userShouldSeeNoMoreEventsToLoadAtTheBottom() {
        System.out.println("No more events to load - " + activityModulePage.noMoreEventsToLoad.isDisplayed());
    }
}



    @Then("user see display by you button")
    public void userSeeDisplayItemsList() {

        ActivityModulePage activityModulePage;
        Assert.assertTrue(activityModulePage.byYou.isDisplayed());
        activityModulePage.byYou.click();
    }

    @Then("user see display by others button")
    public void userSeeDisplayByOthersButton() {
        Assert.assertTrue(activityModulePage.byOthers.isDisplayed());
        BrowserUtils.sleep(2);
        activityModulePage.byOthers.click();

    }
    */

}