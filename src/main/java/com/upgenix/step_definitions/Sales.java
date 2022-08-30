package com.upgenix.step_definitions;

import com.upgenix.pages.SalesP;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
        salesp.customerName.sendKeys("Loue");
        salesp.address.sendKeys("1 boulevard auguste rodin 75000");
        salesp.stateOptions.click();
        salesp.createAndEditState.click();
        salesp.stateName.sendKeys("Albania");
        salesp.stateCode.sendKeys("81");
        salesp.countryStateButton.click();
        salesp.countrySelection.click();

    }
    @When("User can save the customer")
    public void user_can_save_the_customer() {
        salesp.saveButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.saveButton));
        salesp.createCustomer.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.createCustomer));
        salesp.customersButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.customersButton));

    }


    @Then("User can find his name from search bar")
    public void userCanFindHisNameFromSearchBar() {

        salesp.searchBar.sendKeys("Loue"+ Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(salesp.searchBar));

        String actualName = "Loue";
        String expectedName = salesp.nameCheck.getText();

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);


    }
}
