package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutP {

    public LogOutP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "o_user_menu")
    public WebElement popUpButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//div[@class= 'o_dialog_warning modal-body']")
    public WebElement warningMess;
}
