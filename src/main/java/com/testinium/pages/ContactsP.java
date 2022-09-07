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

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement callList;

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

    @FindBy(xpath = "(//div[@class='o_checkbox']/input)[12]")
    public WebElement newContact;

    @FindBy(xpath = "(//div[@class='o_cp_sidebar']/div/div)[2]")
    public WebElement actionInput;

    @FindBy(xpath = "//a[@data-index='3']")
    public WebElement deleteInput;

    @FindBy(xpath = "(//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div)[1]")
    public WebElement firstUser;

    @FindBy(xpath = "//div[@class='oe_title']")
    public WebElement editTitle;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']")
    public WebElement printInput;


    @FindBy(xpath = "(//div[@class='btn-group o_dropdown open']/button)")
    public WebElement duePayment;


}

