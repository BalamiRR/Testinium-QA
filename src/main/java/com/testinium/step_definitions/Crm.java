package com.testinium.step_definitions;

import com.testinium.pages.CrmP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crm {

    CrmP crm = new CrmP();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);


    @When("User click on the crm dashboard")
    public void user_click_on_the_crm_dashboard() {
        crm.crmLink.click();
        wait.until(ExpectedConditions.visibilityOf(crm.crmLink));
    }

    @And("User click on the pipeline button")
    public void userClickOnThePipelineButton() {
        crm.createButton.click();
        wait.until(ExpectedConditions.visibilityOf(crm.createButton));

    }

    @And("User can create the new pipeline")
    public void userCanCreateTheNewPipeline() {
        crm.opportunityTitle.sendKeys("test"+ Keys.ENTER);
        crm.customer.click();
        crm.customerId.click();
        crm.expectedRevenue.clear();
        crm.expectedRevenue.sendKeys("8"+Keys.ENTER);
        crm.priority.click();
        crm.createPipeline.click();
        wait.until(ExpectedConditions.visibilityOf(crm.createPipeline));
    }

    @And("User can see the total price")
    public void userCanSeeTheTotalPrice() {
        int totalPrice= Integer.parseInt(crm.totalPrice.getText()) + 8;
        int price =89;

        System.out.println("totalPrice = " + totalPrice);
        System.out.println("price = " + price);

        Assert.assertEquals(totalPrice,price);

    }

    @Then("User can see new pipeline")
    public void userCanSeeNewPipeline() {
        String actualName = crm.findTitleTest.getText();
        String expectedName = "test";

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals(expectedName,actualName);

    }

    @And("User can change any user's information like {string} , {string} and {string}")
    public void userCanChangeAnyUserSInformationLikeAnd(String opportunity, String revenue, String probability) {
        crm.buttonPipeline.click();
        wait.until(ExpectedConditions.visibilityOf(crm.buttonPipeline));
        crm.editButton.click();
        crm.opportunityTitleEdit.clear();
        crm.opportunityTitleEdit.sendKeys(opportunity+Keys.ENTER);
        crm.expectedRevenueEdit.clear();
        crm.expectedRevenueEdit.sendKeys(revenue+Keys.ENTER);
        crm.probabilityEdit.clear();
        crm.probabilityEdit.sendKeys(probability+Keys.ENTER);
    }

    @And("User can save information")
    public void userCanSaveInformation() {
        wait.until(ExpectedConditions.visibilityOf(crm.probabilityEdit));
        crm.saveEdit.click();
    }

    @Then("User can verify the information")
    public void userCanVerifyTheInformation() {
        crm.pipelineSideButton.click();
        wait.until(ExpectedConditions.visibilityOf(crm.buttonPipeline));

        String actualName = crm.findTitleTest.getText();
        String expectedName = "Test2";

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals(expectedName,actualName);



    }

    @And("User can drag and drop the pipeline")
    public void userCanDragAndDropThePipeline() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(crm.progressPipeline)
                .pause(2000)
                .moveToElement(crm.progressPipeline2)
                .pause(2000)
                .release()
                .perform();

        Thread.sleep(2000);

    }

    @Then("User can see the new changes in progress")
    public void userCanSeeTheNewChangesInProgress() {
        String actualName = crm.testVerify.getText();
        String expectedName = "test";

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals(expectedName,actualName);
    }

    @And("User can register new customer")
    public void userCanRegisterNewCustomer() {
        crm.customerSideButton.click();
        wait.until(ExpectedConditions.visibilityOf(crm.customerSideButton));
        crm.createCustomer.click();
        wait.until(ExpectedConditions.visibilityOf(crm.createCustomer));
        crm.inputName.sendKeys("Test"+Keys.ENTER);
        crm.createCustomerButton.click();
        wait.until(ExpectedConditions.visibilityOf(crm.createCustomerButton));
        crm.searchingText.sendKeys("aa"+Keys.ENTER);

    }

    @Then("User can print the profile")
    public void userCanPrintTheProfile() {
        crm.nameCustomer.click();
        wait.until(ExpectedConditions.visibilityOf(crm.nameCustomer));
        crm.printButton.click();
        wait.until(ExpectedConditions.visibilityOf(crm.duePaymentButton));
        crm.duePaymentButton.click();

    }
}
