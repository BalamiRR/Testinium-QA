package com.upgenix.step_definitions;

import com.upgenix.pages.InventoryP;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Inventory {

    LoginSD loginSD = new LoginSD();
    InventoryP inventory = new InventoryP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("Logged user clicks on Inventory Module")
    public void logged_user_clicks_on_inventory_module() {
        inventory.inventoryModule.click();
    }

    @When("User clicks on Product module")
    public void user_clicks_on_product_module() {
        wait.until(ExpectedConditions.visibilityOf(inventory.products));
        inventory.inventoryModule.click();

    }
    @When("User see the products")
    public void user_see_the_products() {
        Driver.getDriver().getTitle().equals("Products - Odoo");
    }

    @When("User clicks create button")
    public void user_clicks_create_button() {

    }
}
