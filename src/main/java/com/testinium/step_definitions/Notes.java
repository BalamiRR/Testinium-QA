package com.testinium.step_definitions;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.testinium.pages.InventoryP;
import com.testinium.pages.NotesP;
import com.testinium.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notes {

    InventoryP inventoryP = new InventoryP();
    NotesP notesP = new NotesP();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("User clicks the Notes module")
    public void user_clicks_the_notes_module() throws InterruptedException {
        Thread.sleep(2000);
        notesP.notesModule.click();
    }

    @When("User clicks create button in Notes module")
    public void user_clicks_create_button_in_notes_module() {
        wait.until(ExpectedConditions.visibilityOf(notesP.creatingNotes));
        notesP.creatingNotes.click();
    }

    @When("User enters a tag name")
    public void user_enters_a_tag_name() {
        notesP.tagsN.sendKeys("New Tag", Keys.ENTER);
        notesP.tabindex.click();
    }

    @When("User enters description")
    public void user_enters_description() {
        notesP.description.sendKeys("This note is an example for the Testinium App");
        notesP.saveBtn.click();
    }
    @When("User clicks save button")
    public void user_clicks_save_button() {
        wait.until(ExpectedConditions.visibilityOf(notesP.saveBtn));
        notesP.saveBtn.click();
    }
    @Then("User sees the created new notes")
    public void user_sees_the_created_new_notes() {
        String actualMessage = notesP.createdMessage.getText();
        String expecgedMessage = "Note created";
        Assert.assertEquals(actualMessage, expecgedMessage);
    }

    @When("User clicks the edit button")
    public void user_clicks_the_edit_button() {
        notesP.appK.click();
    }

    @When("User enters new description")
    public void user_enters_new_description() {
        notesP.description.clear();
        notesP.description.sendKeys("FKASDFGASDFADSFADS");
        inventoryP.saveBtn.click();
        notesP.notesModule.click();
    }

    @Then("User should see the Notes list")
    public void user_should_see_the_notes_list() {
        wait.until(ExpectedConditions.visibilityOf(notesP.notesModule));
        notesP.notesModule.click();
        Assert.assertTrue(notesP.notesModule.isDisplayed());
    }

    @When("User move element from New section to Today section")
    public void user_move_element_from_new_section_to_today_section() {
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(notesP.newTable).pause(2000).moveToElement(notesP.todayTable).pause(2000).release().perform();
    }

    @Then("User sees Today new added element")
    public void user_sees_today_new_added_element() {
        String actualTable = notesP.todayTable.getText();
        String expectedTable = "Today";

        Assert.assertEquals(actualTable, expectedTable);
    }
}