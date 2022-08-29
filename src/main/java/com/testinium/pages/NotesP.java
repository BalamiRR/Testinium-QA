package com.testinium.pages;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesP {

    public NotesP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[. = 'Create and Edit...']")
    public WebElement tabindex;


    @FindBy(xpath = "//title[.='Notes - Odoo']")
    public WebElement notesTitle;

    @FindBy(xpath = "//a[.='Create ']")
    public WebElement clickCreate;

    @FindBy(partialLinkText = "Notes")
    public WebElement notesModule;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement creatingNotes;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement tagsN;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement description;

    @FindBy(xpath = "//p[.='Note created']")
    public WebElement createdMessage;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createTag;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn;
}
