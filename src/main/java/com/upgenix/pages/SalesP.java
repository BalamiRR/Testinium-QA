package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




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

    @FindBy(xpath = "//li[@id='ui-id-31']/a")
    public WebElement createAndEditState;

    @FindBy(xpath = "//input[@id='o_field_input_1708']")
    public WebElement stateName;

    @FindBy(xpath = "//input[@id='o_field_input_1709']")
    public WebElement stateCode;

    @FindBy(xpath = "//input[@id='o_field_input_1710']")
    public  WebElement countryStateButton;

    @FindBy(xpath = "//li[@id='ui-id-222']/a")
    public  WebElement countrySelection;



}
