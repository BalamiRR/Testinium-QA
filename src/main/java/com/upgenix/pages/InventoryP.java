package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryP {

    public InventoryP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//title[.='Inventory - Odoo']")
    public WebElement inventoryModule;



}
