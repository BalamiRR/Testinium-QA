package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Month;

public class CalendarP {
    public CalendarP(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//title[.='Meetings - Odoo']" )
    public WebElement title;

    @FindBy(partialLinkText = "Calendar")
    public WebElement calendarButton;

    @FindBy(className = "o_calendar_container")
    public WebElement calendarModule;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement day;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement week;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement month;

    @FindBy(className= "ui-state-highlight")
    public WebElement dayCalendar;

    @FindBy(xpath = "//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']")
    public WebElement monthAndYearCalendar;

    @FindBy(xpath = "//div[@class='o_control_panel']/ol/li")
    public WebElement dateActual;


}
