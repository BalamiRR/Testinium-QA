package com.testinium.step_definitions;

import com.testinium.pages.LogOutP;
import com.testinium.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutSD {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    LogOutP logOutP = new LogOutP();
    @Then("User click Log out option")
    public void user_clicks_the_account_icon_and_then_click_log_out_option() {
        wait.until(ExpectedConditions.visibilityOf(logOutP.popUpButton));
        logOutP.popUpButton.click();
        logOutP.logOutButton.click();
    }

    @Then("User should see the login dashboard")
    public void user_should_see_the_login_dashboard() {
        String expectedDashboard = "Login | Best solution for startups";
        String actualDashboard = Driver.getDriver().getTitle();
        Assert.assertEquals("The title is not same as the expected! ", expectedDashboard, actualDashboard);
    }

    @Then("User can not click the step back button to go the home page")
    public void user_can_not_click_the_step_back_button_to_go_the_home_page() {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(logOutP.warningMess.isDisplayed());
    }
}
