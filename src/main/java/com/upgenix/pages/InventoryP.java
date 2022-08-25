package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryP {

    public InventoryP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Inventory")
    public WebElement inventoryModule;

    @FindBy(partialLinkText = "Products")
    public WebElement products;

    @FindBy(className = "o_kanban_view o_kanban_ungrouped")
    public WebElement isOnProductMod;

}