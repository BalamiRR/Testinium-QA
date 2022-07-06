package com.fuatkara.pages;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.WebDriver;
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

    @FindBy(xpath = "//button[type='submit']")
    public WebElement button;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetPass;


}
