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

    @FindBy(className = "o-kanban-button-new")
    public WebElement createBtn;

    @FindBy(className = "o_form_button_save")
    public WebElement saveBtn;

    @FindBy(className = "o_notification_manager")
    public WebElement fieldError;


}