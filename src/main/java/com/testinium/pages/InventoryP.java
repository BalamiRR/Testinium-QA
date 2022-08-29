package com.testinium.pages;

import com.testinium.utilities.Driver;
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

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn;

    @FindBy(className = "o_notification_manager")
    public WebElement fieldError;

    @FindBy(id = "o_field_input_479")
    public WebElement productName;

    @FindBy(xpath = "//span[.='EY']")
    public WebElement productsList;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement createdProduct;


}