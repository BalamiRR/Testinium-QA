package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "(//td[@class='fc-widget-content'])[29]")
    public WebElement dateBox;

    @FindBy(xpath = "//div[@class='modal-header']")
    public WebElement createNote;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement summaryBox;

    @FindBy(xpath= "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='o_field_name o_field_type_char']")
    public WebElement getNote;

    @FindBy(className = "o_field_name")
    public WebElement createdNote;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement editButton;

    @FindBy(id = "o_field_input_46")
    public WebElement editText;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement createdModele;

    @FindBy(id = "o_field_input_59")
    public WebElement tagsCheckbox;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_field_name o_field_type_char']")
    public WebElement selectNote;

}
