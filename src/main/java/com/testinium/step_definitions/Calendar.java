package com.testinium.step_definitions;

import com.testinium.pages.CalendarP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

    CalendarP calendarP = new CalendarP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);

    @When("User click on the calendar dashboard")
    public void user_clicks_on_the_calendar_dashboard() throws InterruptedException {
        calendarP.calendarButton.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.calendarButton));
    }

    @When("User click on day button")
    public void user_clicks_on_day_button() {
        calendarP.day.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.day));
    }

    @When("User click on week button")
    public void user_clicks_on_week_button() {
        calendarP.week.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.week));
    }

    @When("User click on month button")
    public void user_clicks_on_month_button() {
        calendarP.month.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.month));
    }

    @Then("User should see the last stage of calendar view")
    public void user_should_see_the_last_stage_of_calendar_view() {
        wait.until(ExpectedConditions.visibilityOf(calendarP.calendarModule));
        String expectedDashboard = "Meetings - Odoo";
        String actualDashboard = Driver.getDriver().getTitle();
        Assert.assertEquals("The title is not same as the expected!", expectedDashboard, actualDashboard);
    }

    @When("User click day on the calendar and display day")
    public void user_clicks_day_on_the_calendar_and_display_day() throws InterruptedException {
        calendarP.day.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.day));
        String dayCalendar = calendarP.dayCalendar.getText();
        int monthCalendar = Integer.parseInt(calendarP.monthAndYearCalendar.getAttribute("data-month")) + 1;
        int yearCalendar = Integer.parseInt(calendarP.monthAndYearCalendar.getAttribute("data-year"));

        String month = "";

        switch (monthCalendar) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        String expectedResult = "Meetings (" + month + " " + dayCalendar + ", " + yearCalendar + ")";
        Thread.sleep(3000);
        String actualResult = calendarP.dateActual.getText();
        Assert.assertEquals(expectedResult,actualResult);


    }

    @Then("User click month on the calendar and display month")
    public void user_click_month_on_the_calendar_and_display_month() throws InterruptedException {
        calendarP.month.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.month));
        int monthCalendar = Integer.parseInt(calendarP.monthAndYearCalendar.getAttribute("data-month")) + 1;
        int yearCalendar = Integer.parseInt(calendarP.monthAndYearCalendar.getAttribute("data-year"));

        String month = "";

        switch (monthCalendar) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        String expectedResult = "Meetings (" + month+ " "+ yearCalendar + ")";
        Thread.sleep(3000);
        String actualResult = calendarP.dateActual.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @And("User click on desired date time")
    public void userClickOnDesiredDateTime() {
        calendarP.dateBox.click();
        Assert.assertTrue(calendarP.createNote.isDisplayed());
    }

    @Then("User enters {string} in the box and clicks the create button")
    public void userEntersInTheBoxAndClicksTheCreateButton(String note) {

        String eventName = note;

        calendarP.summaryBox.sendKeys(note);
        calendarP.createButton.click();

        Assert.assertEquals(calendarP.getNote.getText(),eventName);
    }

    @When("User can see all the note")
    public void user_can_see_all_the_note() {
        Assert.assertTrue(calendarP.createdNote.isDisplayed());
    }
    @When("User can select the note")
    public void user_can_select_the_note() {
        calendarP.selectNote.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.selectNote));
        Assert.assertTrue(calendarP.createdModele.isDisplayed());
    }
    @When("User can edit the information")
    public void user_can_edit_the_information() {
        calendarP.editButton.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.editButton));
        calendarP.editText.clear();
        calendarP.editText.sendKeys("Hello My Friends");
        wait.until(ExpectedConditions.visibilityOf(calendarP.editText));
        calendarP.tagsCheckbox.isSelected();


    }
    @Then("User can save all edit")
    public void user_can_save_all_edit() {
        calendarP.saveButton.click();
    }


}
