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

    @FindBy(xpath = "//title[.='Customers - Odoo']")
    public WebElement customerTitle;


}
