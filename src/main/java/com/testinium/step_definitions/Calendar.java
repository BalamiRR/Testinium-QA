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
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

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

}
