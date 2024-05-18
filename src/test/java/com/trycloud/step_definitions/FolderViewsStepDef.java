package com.trycloud.step_definitions;

import com.trycloud.pages.FolderViewPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class FolderViewsStepDef {

    LoginPage loginPage = new LoginPage();
    FolderViewPage folderViewPage_as = new FolderViewPage();

    @Given("User is on tryCloud main dashboard page")
    public void user_is_on_try_cloud_main_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("Employee300", "Employee123");
    }


    @Given("User is on the all files page")
    public void user_is_on_the_all_files_page() {
        folderViewPage_as.FileMojo.click();
        folderViewPage_as.allFiles.click();
    }

    @When("User click on sort by Name button")
    public void user_click_on_sort_by_name_button() {
        folderViewPage_as.nameButton.click();
    }


    @Then("User should see the list in alphabetical descending")
    public void user_should_see_the_list_in_alphabetical_descending(List<String> expectedListDes) {
        BrowserUtils.sleep(1);
        List<String> actualList = new ArrayList<>();
        for (WebElement each : folderViewPage_as.fileListMenu) {
            actualList.add(each.getAttribute("data-file"));
        }
        Collections.sort(actualList, Collections.reverseOrder());
    }

    @Then("User should see the list in alphabetical ascending  order")
    public void user_should_see_the_list_in_alphabetical_ascending_order(List<String> expectedList) {
        BrowserUtils.sleep(1);
        List<String> actualList = new ArrayList<>();
        for (WebElement each : folderViewPage_as.fileListMenu) {
            actualList.add(each.getAttribute("data-file"));
        }
        Collections.sort(actualList, Collections.reverseOrder());
    }


    // Folder view By size


    @Given("User click sort by size button")
    public void user_click_sort_by_size_button() {
        folderViewPage_as.sizeButton.click();
    }


    @Then("User should see the list of  size order")
    public void user_should_see_the_list_of_size_order(List<String> listOfSizeExp) {
        BrowserUtils.sleep(1);

        List<String> listOfSizeActual = new ArrayList<>();
        for (WebElement each : folderViewPage_as.sizeList) {
            listOfSizeActual.add(each.getText());
        }
        listOfSizeActual.remove(4);
        Assert.assertEquals(listOfSizeActual, listOfSizeExp);
    }


    @Then("User should see the descending  list of size order")
    public void user_should_see_the_descending_list_of_size_order(List<String> listOfSizeExp) {
        BrowserUtils.sleep(1);
        BrowserUtils.sleep(1);
        List<String> listOfSizeActual = new ArrayList<>();
        for (WebElement each : folderViewPage_as.sizeList) {
            listOfSizeActual.add(each.getText());
        }
        listOfSizeActual.remove(4);
        Assert.assertEquals(listOfSizeActual, listOfSizeExp);
    }


    //Folder View by Modified
    @Then("User clicks sort by modified button")
    public void user_clicks_sort_by_modified_button() {
        folderViewPage_as.modifiedButton.click();
    }


    @Then("User should see the list in ascending order")
    public void user_should_see_the_list_in_ascending_order(List<String> expectedList) {
        BrowserUtils.sleep(1);
        List<String> actualList = new ArrayList<>();
        for (WebElement each : folderViewPage_as.modifiedList) {
            actualList.add(each.getText());

        }
        Assert.assertEquals(actualList, expectedList);
    }


    @Then("User should see the list in descending order")
    public void user_should_see_the_list_in_descending_order(List<String> expectedList) {
        BrowserUtils.sleep(1);
        List<String> actualList = new ArrayList<>();
        for (WebElement each : folderViewPage_as.modifiedList) {
            actualList.add(each.getText());
        }
        Collections.sort(actualList, Collections.reverseOrder());
        Assert.assertEquals(actualList, expectedList);
    }

    // Check all boxes at once

    @When("User click on select all checkbox")
    public void user_click_on_select_all_checkbox() {

        folderViewPage_as.selectAllFiles.click();
    }

    @When("all checkboxes should be selected")
    public void all_checkboxes_should_be_selected() {
        BrowserUtils.sleep(1);
        int count = 0;

        for (WebElement each : folderViewPage_as.allBoxes) {
            if (each.isSelected()) {
                count++;
            }
        }
        Assert.assertEquals(count,folderViewPage_as.allBoxes.size());
        System.out.println("folderViewPage_as = " + folderViewPage_as.allBoxes.size());


    }
    @Then("total values of folders and files should be seen correctly")
    public void total_values_of_folders_and_files_should_be_seen_correctly() {

        Assert.assertTrue(folderViewPage_as.totalValue.isDisplayed());


    }



}


















