package com.testinium.step_definitions;

import com.testinium.pages.CalendarP;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

    CalendarP calendarP = new CalendarP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);

    @When("User clicks on the calendar dashboard")
    public void user_clicks_on_the_calendar_dashboard() throws InterruptedException {
        calendarP.calendarButton.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.calendarButton));
    }

    @When("User clicks on day button")
    public void user_clicks_on_day_button() {
        calendarP.day.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.day));
    }

    @When("User clicks on week button")
    public void user_clicks_on_week_button() {
        calendarP.week.click();
        wait.until(ExpectedConditions.visibilityOf(calendarP.week));
    }

    @When("User clicks on month button")
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

    @When("User clicks day on the calendar and display day")
    public void user_clicks_day_on_the_calendar_and_display_day() {

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
        String actualResult = calendarP.dateActual.getText();
        System.out.println("expectedResult" +expectedResult);
        System.out.println("actual:" +actualResult);


    }

    @Then("User clicks month on the calendar and display month")
    public void user_clicks_month_on_the_calendar_and_display_month() {

    }

}
