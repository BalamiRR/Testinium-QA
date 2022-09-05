package com.testinium.step_definitions;

import com.testinium.pages.ContactsP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contacts {

    ContactsP contactP = new ContactsP();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("User is at Contact dashboard")
    public void user_is_at_contact_dashboard() {
        contactP.contactModule.click();
    }

    @When("User clicks the create button")
    public void user_clicks_the_create_button() throws InterruptedException {
        Thread.sleep(3000);
        contactP.createContact.click();
    }

    @When("User enters name {string}")
    public void user_enters_name(String string) {
        wait.until(ExpectedConditions.visibilityOf(contactP.nameInput));
        contactP.nameInput.sendKeys(string);
    }

    @When("User enters {string}")
    public void user_enters(String streetName) {
        contactP.streetInput.sendKeys(streetName);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String phoneNo, String eMail) {
        contactP.phoneNoInput.sendKeys(phoneNo);
        contactP.emailInput.sendKeys(eMail);
    }

    @Then("User sees the created new contact details at dashboard")
    public void user_sees_the_created_new_contact_details_at_dashboard() {
        contactP.contactModule.click();
        wait.until(ExpectedConditions.visibilityOf(contactP.contactModule));
        contactP.okBtn.click();
    }

    @When("User clicks list section and choose the profile")
    public void user_clicks_list_section_and_choose_the_profile() throws InterruptedException {
        Thread.sleep(3000);
        contactP.callList.click();
        Thread.sleep(3000);
        contactP.newContact.click();
    }

    @When("User clicks Action to choose delete button")
    public void user_clicks_action_to_choose_delete_button() {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("(//div[@class='o_cp_sidebar']/div/div)[2]")));
        WebElement currentlySelectedOptiom = select.getFirstSelectedOption();

        String actual = currentlySelectedOptiom.getText();
        String expected = "Action";

        Assert.assertEquals(actual,expected);

        //select.selectByVisibleText("Delete");


        //contactP.actionInput.click();
    }

    @When("User clicks and goes directly to the profile")
    public void user_clicks_and_goes_directly_to_the_profile() {

    }

    @Then("User sees deleted profile")
    public void user_sees_deleted_profile() {

    }

    @When("User selects the profile")
    public void user_selects_the_profile() {

    }

    @When("User clicks the print button and then select due payments")
    public void user_clicks_the_print_button_and_then_select_due_payments() {

    }

    @Then("User can see the dowloaded file")
    public void user_can_see_the_dowloaded_file() {

    }
}
