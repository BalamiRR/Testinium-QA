package com.upgenix.step_definitions;

import com.upgenix.pages.SalesP;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sales {

    SalesP salesp = new SalesP();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),4);

    @When("User click on the sales dashboard")
    public void user_click_on_the_sales_dashboard() throws InterruptedException {
        salesp.salesPartial.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.salesPartial));
    }

    @When("User click customers button")
    public void user_click_customers_button() throws InterruptedException {

        salesp.customersButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.customersButton));

        String actualTitle = "Customers - Odoo";
        String expectedTitle = "Customers - "+Driver.getDriver().getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expected = "+expectedTitle);

        Assert.assertEquals("The title is not same as the expected!", expectedTitle, actualTitle);
    }

    @When("User can create the customer")
    public void user_can_create_the_customer() throws InterruptedException {
        salesp.createButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.createButton));
        salesp.customerName.sendKeys("John Lennon");
        salesp.address.sendKeys("1 boulevard auguste rodin 75000");
        salesp.stateOptions.click();
        salesp.createAndEditState.click();
        salesp.stateName.sendKeys("Paris");
        salesp.stateCode.sendKeys("75000");
        salesp.countryStateButton.click();
        salesp.countrySelection.click();

    }
    @Then("User can save the customer")
    public void user_can_save_the_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
