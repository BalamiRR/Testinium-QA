package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP {
    public LoginP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement inputEmail;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement button;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetPass;

    @FindBy(id = "oe_main_menu_navbar")
    public WebElement dashboard;

    @FindBy(className = "alert")
    public WebElement alertErrorMessage;

    @FindBy(name="password")
    public WebElement bulletPass;
}
