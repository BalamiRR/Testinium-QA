package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsP {

    public ContactsP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Contacts")
    public WebElement contactModule;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createContact;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "phone")
    public WebElement phoneNoInput;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(xpath="//span[.='Ok']")
    public WebElement okBtn;

    @FindBy(xpath = "//span[.='&Dustin']")
    public WebElement newContact;
}

