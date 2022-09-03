package com.testinium.step_definitions;

import com.testinium.pages.CrmP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
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

        String actualName = crm.findTitleTest.getText();
        String expectedName = "test";

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals(expectedName,actualName);

    }

    @And("User can fill textBox and register")
    public void userCanFillTextBoxAndRegister() {

    }

    @Then("User can see new pipeline")
    public void userCanSeeNewPipeline() {

    }
}
