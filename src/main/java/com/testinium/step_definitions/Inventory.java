package com.testinium.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.testinium.pages.InventoryP;
import com.testinium.utilities.Driver;
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

    @When("User clicks the save button")
    public void user_clicks_the_save_button() {
        wait.until(ExpectedConditions.visibilityOf(inventory.saveBtn));
        inventory.saveBtn.click();
    }

    @Then("User should see the error")
    public void user_should_see_the_error() {
        inventory.fieldError.isDisplayed();
    }

    @When("User enters Product Name")
    public void user_enters_product_name() {
        inventory.productName.sendKeys("IBM");
    }

    @Then("User should see the title includes the Product Name")
    public void user_should_see_the_title_includes_the_product_name() {
        inventory.productsList.isDisplayed();
    }

    @Then("User sees the created Product")
    public void user_sees_the_created_product() {
        inventory.createdProduct.isDisplayed();
    }



}