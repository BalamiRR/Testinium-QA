package com.testinium.step_definitions;

import com.testinium.pages.SalesP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.And;
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
        salesp.customerName.sendKeys("Lucas");
        salesp.address.sendKeys("1 boulevard auguste rodin 75000");
        salesp.stateOptions.click();
        salesp.createAndEditState.click();
        salesp.stateName.sendKeys("Albania");
        salesp.stateCode.sendKeys("78");
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


    @Then("User can find his name {string} from search bar")
    public void userCanFindHisNameFromSearchBar(String name) {
        salesp.searchBar.sendKeys(name+ Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(salesp.searchBar));

        String actualName = "Lucas";
        String expectedName = salesp.nameCheck.getText();

        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);


    }

    @And("User can create new customer")
    public void userCanCreateNewCustomer() {
        salesp.createButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.createButton));
        salesp.createCustomer.click();
    }

    @Then("User can get the error")
    public void userCanGetTheError() {

        String actualWarning = "The following fields are invalid:";
        String expectedWarning = salesp.warning.getText();

        System.out.println("actualWarning = " + actualWarning);
        System.out.println("expectedWarning = " + expectedWarning);

    }


}
