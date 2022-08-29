package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SessionP {

    public SessionP(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement inputLogin;

    @FindBy(id = "password")
    public WebElement inputPass;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

}
