package com.upgenix.step_definitions;

import com.upgenix.pages.SalesP;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sales {

    SalesP salesp = new SalesP();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    @When("User click on the sales dashboard")
    public void user_click_on_the_sales_dashboard() {
        salesp.salesPartial.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.salesPartial));
    }

    @When("User click customers button")
    public void user_click_customers_button() {
        salesp.customersButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesp.customersButton));

        String actualTitle = "Customers - Odoo";
        String expectedTitle = "Customers - "+Driver.getDriver().getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expected = "+expectedTitle);

        Assert.assertEquals("The title is not same as the expected!", expectedTitle, actualTitle);
    }
    @When("User create new account")
    public void user_create_new_account() {

    }



}
