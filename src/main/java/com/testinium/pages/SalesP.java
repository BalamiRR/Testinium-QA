package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SalesP {

    public SalesP(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Sales")
    public WebElement salesPartial;

    @FindBy(xpath  = "//a[@href='/web#menu_id=447&action=48']/span")
    public WebElement customersButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath ="//input[@id='o_field_input_470']" )
    public WebElement customerName;

    @FindBy(xpath = "//input[@id='o_field_input_474']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='o_field_input_477']")
    public WebElement stateOptions;

    @FindBy(xpath = "//li[.='Create and Edit...']")
    public WebElement createAndEditState;

    @FindBy(xpath = "//input[@id='o_field_input_516']")
    public WebElement stateName;

    @FindBy(xpath = "//input[@id='o_field_input_517']")
    public WebElement stateCode;

    @FindBy(xpath = "//input[@id='o_field_input_518']")
    public  WebElement countryStateButton;

    @FindBy(xpath = "//li[@id='ui-id-30']/a")
    public  WebElement countrySelection;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span")
    public  WebElement saveButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement createCustomer;

    @FindBy(xpath = "//div[@class='o_searchview']/input")
    public WebElement searchBar;

    @FindBy(xpath = "//strong[@class='o_kanban_record_title oe_partner_heading']/span")
    public WebElement nameCheck;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement warningButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement warning;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public List<WebElement> allCustomers;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']")
    public WebElement link;

    @FindBy(xpath = "//div[@class=\"oe_kanban_details\"]//span")
    public WebElement details;


}
