package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmP {
    public CrmP(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "CRM")
    public WebElement crmLink;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(name = "name")
    public  WebElement opportunityTitle;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6']//div//div//input")
    public WebElement customer;

    @FindBy(xpath = "//a[.='&CC']")
    public WebElement customerId;

    @FindBy(xpath = "//div[@class='o_row']//input")
    public WebElement expectedRevenue;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6']//tr[4]//a[3]")
    public WebElement priority;

    @FindBy(xpath = "//button[@name='close_dialog']")
    public WebElement createPipeline;

    @FindBy(xpath = "//span[.='test']")
    public  WebElement findTitleTest;


}