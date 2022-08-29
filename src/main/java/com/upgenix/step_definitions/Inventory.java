package com.upgenix.step_definitions;

import com.upgenix.pages.InventoryP;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inventory {

    InventoryP inventory = new InventoryP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("Logged user clicks on Inventory Module")
    public void logged_user_clicks_on_inventory_module() {
        inventory.inventoryModule.click();
    }

    @When("User clicks on Product module")
    public void user_clicks_on_product_module() {
        wait.until(ExpectedConditions.visibilityOf(inventory.products));
        inventory.products.click();
    }

    @When("User see the products")
    public void user_see_the_products() {
        Driver.getDriver().getTitle().equals("Products - Odoo");
    }

    @When("User clicks create button")
    public void user_clicks_create_button() {
        inventory.createBtn.click();
    }

    @Then("User clicks the save button without entering any info")
    public void user_clicks_the_save_button_without_entering_any_info() {
        wait.until(ExpectedConditions.visibilityOf(inventory.createBtn));
        inventory.saveBtn.click();
    }

    @Then("User should see the error")
    public void user_should_see_the_error() {
        inventory.fieldError.isDisplayed();
    }




}